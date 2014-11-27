package com.hoseo.member.Interface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hoseo.member.MemberDto;

@Service
public interface IMemberService {

	// 회원가입
	void insert(MemberDto dto);

	// 로그인
	boolean login(MemberDto dto);

	// 아이디찾기
	List search_id(MemberDto dto);
	
	// 비밀번호 찾기 - 아이디 및 이메일 일치 확인
	int same_idAndEmail(MemberDto dto);
	
	// 비밀번호 찾기 - 임시비밀번호 설정
	void search_updatePw(MemberDto dto);

	void update(MemberDto dto);

	void cancellation(MemberDto dto);

	MemberDto result_correction(MemberDto dto);

	int modify_password(MemberDto dto);
}
