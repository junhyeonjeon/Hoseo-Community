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
import com.hoseo.board.util.CommonFinals;
import com.hoseo.board.util.FileUtil;

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

	// index 페이지 이동
	@RequestMapping(value = "/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("index");
		mv.addObject("layout", "index");
		
		return mv;
	}
	
}