package com.hoseo.board.controller;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.hoseo.board.BoardDto;
import com.hoseo.board.Interface.IBoardService;
import com.hoseo.page.Pager;
import com.hoseo.util.CommonFinals;
import com.hoseo.util.FileUtil;
import com.hoseo.util.ShaUtil;
import com.hoseo.util.StringUtil;

//컨트롤러 파일의 경우 @Controller이 있어야 한다.
//url 과 Controller 의 맵핑이 이루어진다.

/*1. @RequestMapping -
 *   @RequestMapping(Value="/board/list", REQUESTMETHOD.GET) <- 이게 URL이다.
 *   
 *   웹서버를 운영해서 사이트 서비스를 하려면 호스팅이 필요하다.
 *   호스팅을 하려면 도메인을 사려면 cafe24, 후이즈 등 호스팅 업체한테 비용을 지불하면된다.
 *   도메인을 사서 호스팅 업체하고 연결시켜야한다.
 */
@Controller
public class BoardController {

	// 서비스 인터페이스 참조
	// setter 대신 @Autowired 를 붙여준다.
	@Autowired
	IBoardService service;

	// contact 페이지 이동
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("contact/contact");
		mv.addObject("layout", "contact");

		return mv;
	}

	// market 페이지 이동
	@RequestMapping(value = "/market/list")
	public ModelAndView market(String kind, Pager pgDto, BoardDto dto) {
		ModelAndView mv = new ModelAndView();

		// 카테고리 적용
		dto.setCategory(kind);

		pgDto.setRowCount(service.totalList(dto)); // 총 글 수 가져오기
		pgDto.setPageSize(10); // 페이지당 글 갯수 설정

		// 이동 페이지 적용
		mv.setViewName("board/board");
		mv.addObject("layout", "market");
		mv.addObject("keyword", dto.getKeyword()); // 검색어
		mv.addObject("searchKey", dto.getSearchKey()); // 검색종류

		// 프리미엄 혹은 추천 게시물(슬라이더 등재) 및 모든 게시물
		mv.addObject("premium", service.getPremium(dto));
		mv.addObject("list", service.getList(dto, pgDto));

		// 총 글 수반환
		mv.addObject("rowCount", pgDto.getRowCount());

		return mv;
	}

	// board 페이지 이동
	@RequestMapping(value = "/board/list")
	public ModelAndView board(String kind, Pager pgDto, BoardDto dto) {
		ModelAndView mv = new ModelAndView();

		// 카테고리 적용
		dto.setCategory(kind);

		pgDto.setRowCount(service.totalList(dto)); // 총 글 수 가져오기
		pgDto.setPageSize(10); // 페이지당 글 갯수 설정

		mv.setViewName("board/board");
		mv.addObject("layout", "board");
		mv.addObject("keyword", ""); // 검색어
		mv.addObject("search", "all"); // 검색종류

		// 프리미엄 혹은 추천 게시물(슬라이더 등재)
		mv.addObject("premium", service.getPremium(dto));
		mv.addObject("list", service.getList(dto, pgDto));

		// 총 글 수반환
		mv.addObject("rowCount", pgDto.getRowCount());

		return mv;
	}

	// wrtie 페이지 이동
	@RequestMapping(value = "/*/write")
	public ModelAndView write(String layout, String mode, BoardDto dto) {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("board/board_write");
		mv.addObject("layout", layout);
		mv.addObject("category", dto.getCategory());
		mv.addObject("mode", mode);

		if (mode != null && mode.equals("mod")) {
			// 로그인정보와 작성자정보 일치 확인

			// 글 전체 정보 가져오기
			BoardDto contents = service.getContents(dto);
			contents.setContents(StringUtil.dbToText(contents.getContents()));

			mv.addObject("dto", contents);
			mv.addObject("seq", dto.getSeq());
		}

		return mv;
	}

	// 게시글 insert 후 돌아가기
	@RequestMapping(value = "/*/write_ok")
	public String write_ok(BoardDto dto, String referer, String mode) {
		
		// 강제개행을 DB에 저장하기 위해 수정
		dto.setContents(StringUtil.textToDb(dto.getContents()));
		
		if (mode.equals("mod")) {
			service.update(dto);
		} else {
			if (dto.getPremium() > 0) {
				// 파일 받아와서 저장하기
				List<MultipartFile> files = dto.getFiles();

				for (int i = 0; i < files.size(); i++) {

					// 파일이름 저장
					if (!files.get(i).getOriginalFilename().equals("")) {
						// 파일저장하기
						String path = CommonFinals.uploadPathBoard;

						String filename = FileUtil.getFileName(path,
								files.get(i).getOriginalFilename());
						dto.getFilename()[i] = filename;
						// 새로만들어진 파일명으로 저장해야 한다.
						// 없으면 null값 들어가 있음

						File f = new File(path + "/" + filename);

						// 지정한 이름으로 파일 전송
						try {
							files.get(i).transferTo(f);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
			service.insert(dto);
		}

		return "redirect:" + referer;
	}

	// 게시글 상세보기 페이지 이동
	@RequestMapping(value = "/*/view")
	public ModelAndView view(String layout, BoardDto dto) {
		ModelAndView mv = new ModelAndView();

		// 해당 게시글 조회수 업데이트
		service.updateHit(dto.getSeq());
		
		// 글 전체 정보 가져오기
		BoardDto contents = service.getContents(dto);
		contents.setContents(StringUtil.dbToText(contents.getContents()));

		mv.setViewName("board/board_view");
		mv.addObject("layout", "market");
		mv.addObject("contents", contents); // 글 전체 정보
		mv.addObject("repleCount", service.getRepleCount(dto)); // 댓글 갯수
		mv.addObject("repleList", service.getRepleList(dto)); // 댓글 가져오기
		mv.addObject("next_pre", service.getNextPre(dto)); // 이전글 다음글 가져오기

		return mv;
	}

	// 댓글 DB 입력
	@RequestMapping(value = "/*/insert_reple")
	public String insert_reple(BoardDto dto) {

		// 강제개행을 DB에 저장하기 위해 수정
		dto.setContents(StringUtil.textToDb(dto.getContents()));
		
		service.insertReple(dto);

		return "redirect:view.do?category=" + dto.getCategory() + "&seq=" + dto.getSeq();
	}
	
	// 댓글 삭제
	@RequestMapping(value = "/*/delete_reple")
	public String delete_reple(BoardDto dto) {		
		
		service.deleteReple(dto.getReple_seq());

		return "redirect:view.do?category=" + dto.getCategory() + "&seq=" + dto.getSeq();
	}

	// 추천 증가
	@RequestMapping(value = "/*/like")
	public String update_like(BoardDto dto) {

		service.updateLike(dto);

		return "redirect:view.do?category=" + dto.getCategory() + "&seq=" + dto.getSeq();
	}
	
	// 게시글 삭제 페이지 이동
	@RequestMapping(value = "/*/delete")
	public ModelAndView delete_board(BoardDto dto){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/board_delete");
		mv.addObject("layout", "market");
		
		return mv;
	}
	
	// 게시글 삭제 시 작성자 일치 확인
	@RequestMapping(value = "/*/delete_check.do")
	public ModelAndView delete_check(BoardDto dto) {
		ModelAndView mv = new ModelAndView();
		
		// 비밀번호 암호화
		dto.setPw(ShaUtil.hasing(dto.getPw()));

		mv.setViewName("board/board_delete_ok");
		mv.addObject("kind", dto.getCategory());
		
		if (service.delete(dto))
			mv.addObject("result", "Y");
		else
			mv.addObject("result", "N");

		return mv;
	}
}