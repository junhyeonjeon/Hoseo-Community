package com.hoseo.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hoseo.member.MemberDto;
import com.hoseo.member.Interface.IMemberService;

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
public class MemberController {

	// 서비스 인터페이스 참조
	// setter 대신 @Autowired 를 붙여준다.
	@Autowired
	IMemberService service;
	
	// 회원가입 약관 동의 페이지 이동
	@RequestMapping(value = "/register")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("register");
		mv.addObject("layout", "index");
		
		return mv;
	}
	
	// 회원가입 페이지 이동
	@RequestMapping(value = "/register_form")
	public ModelAndView register_form() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("register_form");
		mv.addObject("layout", "index");

		return mv;
	}
	
	// 가입 성공
	@RequestMapping(value = "/register_ok")
	public String register_ok(MemberDto dto) {

		dto.setBirth(dto.getYear()+dto.getMonth()+dto.getDay());
		service.insert(dto);
		
		return "redirect:index.do";
	}
	
	// 로그인 페이지 이동
	@RequestMapping(value = "/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("login");
		mv.addObject("layout", "index");

		return mv;
	}
	
	// 로그인 정보 체크
	@RequestMapping(value = "/login_ok")
	public ModelAndView login_ok(MemberDto dto) {
		ModelAndView mv = new ModelAndView();

		service.login(dto);
		
		mv.setViewName("index");
		mv.addObject("layout", "index");

		return mv;
	}		
}