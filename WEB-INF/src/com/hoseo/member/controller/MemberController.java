package com.hoseo.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hoseo.member.MemberDto;
import com.hoseo.member.Interface.IMemberService;
import com.hoseo.message.MessageDto;
import com.hoseo.message.Interface.IMessageService;
import com.hoseo.util.RandomStringBuilder;
import com.hoseo.util.SendMail;
import com.hoseo.util.ShaUtil;

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
	@Autowired
	IMessageService Mservice;

	// 회원가입 약관 동의 페이지 이동
	@RequestMapping(value = "/member/register")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("member/register");
		mv.addObject("layout", "index"); // 상단 메뉴 HOME SELECT

		return mv;
	}

	// 회원가입 페이지 이동
	@RequestMapping(value = "/member/register_form")
	public ModelAndView register_form() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("member/register_form");
		mv.addObject("layout", "index"); // 상단 메뉴 HOME SELECT

		return mv;
	}

	// 가입 성공
	@RequestMapping(value = "/member/register_ok")
	public String register_ok(MemberDto dto) {

		// 비밀번호 암호화
		dto.setPw1(ShaUtil.hasing(dto.getPw1()));

		dto.setBirth(dto.getYear() + "-" + dto.getMonth() + "-" + dto.getDay());
		service.insert(dto);

		return "redirect:/index.do";
	}

	// 로그인 페이지 이동
	@RequestMapping(value = "/member/login")
	public ModelAndView login(String referer) {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("member/login");
		mv.addObject("layout", "index"); // 상단 메뉴 HOME SELECT
		mv.addObject("login_ok", ""); // 로그인페이지에서 로그인 성공여부를 결정하기 때문에 계속 갖고 다닌다.

		return mv;
	}

	// 로그인 정보 체크
	@RequestMapping(value = "/member/login_ok")
	public ModelAndView login_ok(MemberDto dto, String referer) {
		ModelAndView mv = new ModelAndView();

		// 비밀번호 암호화
		dto.setPw1(ShaUtil.hasing(dto.getPw1()));

		mv.setViewName("/member/login");
		mv.addObject("layout", "index"); // 상단 메뉴 HOME SELECT
		mv.addObject("login_ok", "N"); // 로그인 실패
		mv.addObject("referer", referer); // 로그인 성공 시 이전페이지로 갈 수 있도록, 계속 갖고 다닌다.

		if (service.login(dto)) {
			mv.addObject("login_ok", "Y"); // 로그인 성공
			mv.addObject("userid", dto.getUserid());// 회원아이디
			mv.addObject("username", dto.getUsername());// 회원이름
			
			
			// 받은 쪽지함 숫자 가져오기
			MessageDto Mdto = new MessageDto();
			Mdto.setReceiveid(dto.getUserid());
			mv.addObject("new_message", Mservice.count(Mdto));
			System.out.println("^^^^^^^^^"+ Mservice.count(Mdto));
			
		}

		return mv;
	}

	// 로그아웃
	@RequestMapping(value = "/member/logout")
	public ModelAndView logout() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("member/logout");

		return mv;
	}

	// 아이디 찾기 페이지 이동
	@RequestMapping(value = "/member/search/id")
	public ModelAndView search_id() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("member/search_id");

		return mv;
	}

	// 아이디 찾기 실행
	@RequestMapping(value = "/member/search/id_ok")
	public ModelAndView id_ok(MemberDto dto) {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("member/search_id_ok");
		mv.addObject("search_id", service.search_id(dto));

		return mv;
	}

	// 패스워드 찾기 페이지 이동
	@RequestMapping(value = "/member/search/pw")
	public ModelAndView search_pw() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("member/search_pw");

		return mv;
	}

	// 비밀번호 찾기 실행
	@RequestMapping(value = "/member/search/pw_ok")
	public ModelAndView pw_ok(MemberDto dto) {
		ModelAndView mv = new ModelAndView();

		// 임시 비밀번호로 사용할 문자열
		String randStr;

		// 임시비밀번호 발급 성공 실패 여부
		int result = 0;
		
		// 아이디 및 이메일 일치 확인 후 임시 비밀번호 설정
		if (service.same_idAndEmail(dto) > 0) {
			// 랜덤 문자열 생성
			randStr = RandomStringBuilder.randomPassword(10);
			// 임시 비밀번호 암호화
			dto.setPw1(ShaUtil.hasing(randStr));

			// 해당 회원의 비밀번호를 임시비밀번호로 설정
			service.search_updatePw(dto);
			result = 1;

			String title = "안녕하세요. 호서대 커뮤니티 관리자입니다.";
			String contents = "비밀번호 변경 요청으로 임시 비밀번호를 발급해 드립니다. <br/>회원 아이디 : "
					+ dto.getUserid() + "<br/>임시 비밀번호 : " + randStr;
			SendMail.send("hoseo_cmu@naver.com", dto.getEmail(), title,
					contents);
		}

		mv.setViewName("member/search_pw_ok");
		mv.addObject("result", result);

		return mv;
	}

	// 회원정보 수정
	@RequestMapping(value = "/member/correction")
	public ModelAndView correction(String referer, MemberDto dto) {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("member/correction");
		mv.addObject("layout", "index"); // 상단 메뉴 HOME SELECT
		mv.addObject("login_ok", ""); // 로그인페이지에서 로그인 성공여부를 결정하기 때문에 계속 갖고 다닌다.
		mv.addObject("result_correction", service.result_correction(dto));
		return mv;
	}

	// 탈퇴
	@RequestMapping(value = "/member/dis_agree_ok")
	public ModelAndView dis_agree_ok(MemberDto dto) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/logout");
		service.cancellation(dto);

		return mv;

	}

	// 수정 성공
		@RequestMapping(value = "/member/modify_ok")
		public String modify_ok(MemberDto dto) {
			System.out.println("수정 시작");

			String result = "";

			String birth="";
			
			
			dto.setPw1(ShaUtil.hasing(dto.getPw1()));
			// 입력 비밀번호
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

			dto.setPwf1(ShaUtil.hasing(dto.getPwf1()));
			if (service.modify_password(dto) > 0) {
				// 비밀번호 암호화

				if (dto.getPw1() == null)
					dto.setPw1(ShaUtil.hasing(dto.getPwf1()));

				System.out.println("@@@@@@@@@@@&");
				System.out.println(service.modify_password(dto));
				// 생년월일 저장
				dto.setBirth(dto.getYear() + "-" + dto.getMonth() + "-"
						+ dto.getDay());

				service.update(dto);

				result = "redirect:/index.do";
			}

			else {
				result = "redirect:/member/modify_hback.do";
			}

			return result;
		}

		// 탈퇴이동
		@RequestMapping(value = "/member/cancellation")
		public ModelAndView cancellation(String referer) {
			ModelAndView mv = new ModelAndView();

			mv.setViewName("member/cancellation");
			mv.addObject("layout", "index"); // 상단 메뉴 HOME SELECT
			mv.addObject("login_ok", ""); // 로그인페이지에서 로그인 성공여부를 결정하기 때문에 계속 갖고 다닌다.

			return mv;
		}

		@RequestMapping(value = "/member/modify_hback")
		public ModelAndView modify_hback(String referer) {
			ModelAndView mv = new ModelAndView();

			mv.setViewName("member/modify_hback");
			mv.addObject("layout", "index"); // 상단 메뉴 HOME SELECT
			mv.addObject("login_ok", ""); // 로그인페이지에서 로그인 성공여부를 결정하기 때문에 계속 갖고 다닌다.

			return mv;
		}

}