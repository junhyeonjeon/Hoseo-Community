package com.hoseo.message.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hoseo.message.MessageDto;
import com.hoseo.message.Interface.IMessageService;

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
public class MessageController {

	// 서비스 인터페이스 참조
	// setter 대신 @Autowired 를 붙여준다.
	@Autowired
	IMessageService service;

	// 쪽지쓰기 페이지로 이동
	@RequestMapping(value = "/message/message_form")
	public ModelAndView message_form() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("message/message_form");
		mv.addObject("layout", "index"); // 상단 메뉴 HOME SELECT

		return mv;
	}

	// 쪽지보내기 성공
	@RequestMapping(value = "/message/message_ok")
	public String message_ok(MessageDto dto) {

		service.insert(dto);

		dto.setReceiveid(dto.getReceiveid());

		System.out.println("@@@!!!");
		System.out.println(dto.getSendid());

		return "redirect:message_send.do";

	}

	// 받은쪽지(message_receive) 페이지 이동
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

	// 보낸 쪽지(message_send) 페이지 이동
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