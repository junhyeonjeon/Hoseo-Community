package com.hoseo.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hoseo.board.BoardDto;
import com.hoseo.board.Interface.IBoardService;

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
public class BoardController {

	// ���� �������̽� ����
	// setter ��� @Autowired �� �ٿ��ش�.
	@Autowired
	IBoardService service;

	// index ������ �̵�
	@RequestMapping(value = "/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("index");
		mv.addObject("layout", "index");

		return mv;
	}
	
	// contact ������ �̵�
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("contact");
		mv.addObject("layout", "contact");

		return mv;
	}
	
	// market ������ �̵�
	@RequestMapping(value = "/board")
	public ModelAndView market(BoardDto dto) {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("board");
		mv.addObject("layout", "market");

		return mv;
	}
}