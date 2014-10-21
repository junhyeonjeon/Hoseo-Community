package com.hoseo.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hoseo.member.MemberDto;
import com.hoseo.member.Interface.IMemberService;

//��Ʈ�ѷ� ������ ��� @Controller�� �־�� �Ѵ�.
//url �� Controller �� ������ �̷������.

/*1. @RequestMapping -
 *   @RequestMapping(Value="/board/list", REQUESTMETHOD.GET) <- �̰� URL�̴�.
 *   
 *   �������� ��ؼ� ����Ʈ ���񽺸� �Ϸ��� ȣ������ �ʿ��ϴ�.
 *   ȣ������ �Ϸ��� �������� ����� cafe24, ������ �� ȣ���� ��ü���� ����� �����ϸ�ȴ�.
 *   �������� �缭 ȣ���� ��ü�ϰ� ������Ѿ��Ѵ�.
*/
@Controller
public class MemberController {

	// ���� �������̽� ����
	// setter ��� @Autowired �� �ٿ��ش�.
	@Autowired
	IMemberService service;
	
	// ȸ������ ��� ���� ������ �̵�
	@RequestMapping(value = "/register")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("register");
		mv.addObject("layout", "index");
		
		return mv;
	}
	
	// ȸ������ ������ �̵�
	@RequestMapping(value = "/register_form")
	public ModelAndView register_form() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("register_form");
		mv.addObject("layout", "index");

		return mv;
	}
	
	// ���� ����
	@RequestMapping(value = "/register_ok")
	public String register_ok(MemberDto dto) {

		dto.setBirth(dto.getYear()+dto.getMonth()+dto.getDay());
		service.insert(dto);
		
		return "redirect:index.do";
	}
	
	// �α��� ������ �̵�
	@RequestMapping(value = "/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("login");
		mv.addObject("layout", "index");

		return mv;
	}
	
	// �α��� ���� üũ
	@RequestMapping(value = "/login_ok")
	public ModelAndView login_ok(MemberDto dto) {
		ModelAndView mv = new ModelAndView();

		service.login(dto);
		
		mv.setViewName("index");
		mv.addObject("layout", "index");

		return mv;
	}		
}