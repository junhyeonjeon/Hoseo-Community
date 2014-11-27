package com.hoseo.gallery.controller;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.hoseo.gallery.GalleryDto;
import com.hoseo.gallery.Interface.IGalleryService;
import com.hoseo.page.Pager;
import com.hoseo.util.CommonFinals;
import com.hoseo.util.FileUtil;
import com.hoseo.util.ShaUtil;

@Controller
public class GalleryController {

	@Autowired
	IGalleryService service;

	// gallery 페이지 이동
	@RequestMapping(value = "/gallery/list")
	public ModelAndView gallery(Pager pgDto) {
		ModelAndView mv = new ModelAndView();

		pgDto.setRowCount(service.totalList()); // 총 글 수 가져오기
		pgDto.setPageSize(8); // 페이지당 글 갯수 설정

		mv.setViewName("gallery/gallery"); // 페이지 이름
		mv.addObject("layout", "gallery"); // 상단 메뉴 gallery select
		mv.addObject("list", service.getList(pgDto)); // 글 가져오기

		return mv;
	}

	// gallery upload 이동
	@RequestMapping(value = "/gallery/upload")
	public ModelAndView gallery_upload() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("gallery/gallery_upload");
		mv.addObject("layout", "gallery");

		return mv;
	}

	// gallery delete 이동
	@RequestMapping(value = "/gallery/delete")
	public ModelAndView gallery_delete() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("gallery/gallery_delete");
		mv.addObject("layout", "gallery");

		return mv;
	}

	// gallery delete 수행
	@RequestMapping(value = "/gallery/delete_check.do")
	public ModelAndView gallery_delete_check(GalleryDto dto) {
		ModelAndView mv = new ModelAndView();
		
		// 비밀번호 암호화
		dto.setPw(ShaUtil.hasing(dto.getPw()));

		mv.setViewName("gallery/gallery_delete_ok");
		if (service.gallery_delete(dto))
			mv.addObject("result", "Y");

		else
			mv.addObject("result", "N");

		return mv;
	}

	// gallery insert 하기
	@RequestMapping(value = "/gallery/upload_ok")
	public String write(GalleryDto dto) {

		// 파일 받아와서 저장하기
		List<MultipartFile> files = dto.getFiles();
		for (int i = 0; i < files.size(); i++) {

			// 파일이름 저장
			if (!files.get(i).getOriginalFilename().equals("")) {
				
				// 파일 저장하기(위치 지정)
				String path = CommonFinals.uploadPathGallery;
				String filename = FileUtil.getFileName(path, files.get(i).getOriginalFilename());

				// 새로 만들어지 파일명으로 저장해야 한다.
				// 없으면 null값이 들어감.
				dto.getFilename()[i] = filename;
				File f = new File(path + "/" + filename);

				// 위의 지정된 이름으로 파일 저장
				try {
					files.get(i).transferTo(f);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		// insert 후 list 페이지로 이동한다.
		// 매개변수로 개체를 써주면 알아서 form 객체로부터 날아온 파라미터를 BoardDto 객체로 만들어 준다.
		service.gallery_upload(dto);

		// insert 후 gallery 페이지로 이동한다.
		return "redirect:list.do?pg=1&block=1";
	}
}
