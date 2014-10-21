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
	
}