package com.hoseo.index.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hoseo.gallery.Interface.IGalleryService;
import com.hoseo.message.MessageDto;
import com.hoseo.message.Interface.IMessageService;
import com.hoseo.page.Pager;

@Controller
public class IndexController {
	@Autowired
	IGalleryService service;
	
	@Autowired
	IMessageService Mservice;
	
	// index 페이지 이동
	@RequestMapping(value = "/index")
	public ModelAndView index(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		

		mv.setViewName("index/index");
		mv.addObject("layout", "index");

		// footer에서 사용할 갤러리 9개 가져오기
		Pager dto = new Pager();
		dto.setPg(1);
		dto.setPageSize(9);
		mv.addObject("list", service.getList(dto));

		
		
		
		return mv;
	}
	
	// search 실행
	@RequestMapping(value = "/search")
	public ModelAndView search() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("index/search");
		mv.addObject("layout", "index");

		return mv;
	}
}
