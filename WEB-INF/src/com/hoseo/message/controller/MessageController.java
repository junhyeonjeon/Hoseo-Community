package com.hoseo.message.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hoseo.message.MessageDto;
import com.hoseo.message.Interface.IMessageService;

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
public class MessageController {

	// ���� �������̽� ����
	// setter ��� @Autowired �� �ٿ��ش�.
	@Autowired
	IMessageService service;

	// �������� �������� �̵�
	@RequestMapping(value = "/message/message_form")
	public ModelAndView message_form() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("message/message_form");
		mv.addObject("layout", "index"); // ��� �޴� HOME SELECT

		return mv;
	}

	// ���������� ����
	@RequestMapping(value = "/message/message_ok")
	public String message_ok(MessageDto dto) {

		service.insert(dto);

		dto.setReceiveid(dto.getReceiveid());

		System.out.println("@@@!!!");
		System.out.println(dto.getSendid());

		return "redirect:message_send.do";

	}

	// ��������(message_receive) ������ �̵�
	@RequestMapping(value = "/message/message_receive")
	public ModelAndView message_receive(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		MessageDto dto = new MessageDto();

		mv.setViewName("message/message_receive");
		mv.addObject("layout", "message_receive");

		dto.setReceiveid((String) session.getAttribute("userid"));
		List list = service.receiveList(dto);
		mv.addObject("list", list);

		dto.setCount(service.count(dto));
		int result = service.count(dto);

		System.out.println("#######################");
		System.out.println(dto.getCount());
		System.out.println(result);
		System.out.println("#######################");

		mv.addObject("count", dto.getCount());

		/* mv.addObject("result_count", dto.getCount()); */

		return mv;
	}

	// ���� ����(message_send) ������ �̵�
	@RequestMapping(value = "/message/message_send")
	public ModelAndView message_send(HttpSession session) {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("message/message_send"); 
		mv.addObject("layout", "message_send");

		MessageDto dto = new MessageDto();

		dto.setSendid((String) session.getAttribute("userid"));

		List list = service.sendList(dto);

		System.out.println("!!!!!!!!!!!!!!!!");
		System.out.println(dto.getSendid());

		mv.addObject("list", list);

		return mv;
	}

}