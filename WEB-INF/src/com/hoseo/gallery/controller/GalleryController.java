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
import com.hoseo.gallery.util.CommonFinals;
import com.hoseo.gallery.util.FileUtil;

@Controller
public class GalleryController {

	@Autowired
	IGalleryService service;

	// gallery 페이지 이동
	@RequestMapping(value = "/gallery")
	public ModelAndView gallery(GalleryDto dto) {
		ModelAndView mv = new ModelAndView();

		int rowCount = service.totalList(); // 총 글 수

		// 페이지 개수
		int pageCount = rowCount / 10;
		if (rowCount % 10 > 0)
			pageCount++;

		// 페이지 블럭
		int block = pageCount / 10;
		if (pageCount % 10 != 0)
			block++;

		mv.setViewName("gallery"); // 페이지 이름
		mv.addObject("pg", dto.getPg()); // 페이지 번호
		mv.addObject("pageCount", pageCount); // 페이지 개수
		mv.addObject("block", block); // 페이지 개수
		mv.addObject("layout", "gallery"); // 상단 메뉴 gallery select
		mv.addObject("list", service.getList(dto.getPg())); // 글 가져오기

		return mv;
	}

	// gallery upload 이동
	@RequestMapping(value = "/gallery_upload")
	public ModelAndView gallery_upload() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("gallery_upload");
		mv.addObject("layout", "gallery");

		return mv;
	}

	// gallery insert 하기
	@RequestMapping(value = "/gallery_upload_ok")
	public String write(GalleryDto dto) {

		// 파일 받아와서 저장하기
		List<MultipartFile> files = dto.getFiles();
		for (int i = 0; i < files.size(); i++) {

			// 파일이름 저장
			if (!files.get(i).getOriginalFilename().equals("")) {
				// 파일 저장하기(위치 지정)
				String path = CommonFinals.uploadPath;
				String filename = path + "/" + FileUtil.getFileName(path, files.get(i).getOriginalFilename());

				// 새로 만들어지 파일명으로 저장해야 한다.
				// 없으면 null값이 들어감.
				dto.getFilename()[i] = filename;
				File f = new File(filename);

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
		return "redirect:gallery.do?pg=1";
	}
}
