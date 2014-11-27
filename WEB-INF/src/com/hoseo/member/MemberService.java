package com.hoseo.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoseo.member.Interface.IMemberDao;
import com.hoseo.member.Interface.IMemberService;

@Service
public class MemberService implements IMemberService{

	// 참조 객체 선언(dao)
	@Autowired
	IMemberDao dao;

	// 회원 가입
	@Override
	public void insert(MemberDto dto) {
		dao.insert(dto);		
	}

	// 로그인
	@Override
	public boolean login(MemberDto dto) {
		return dao.login(dto);
	}

	// 아이디 찾기
	@Override
	public List search_id(MemberDto dto) {
		return dao.search_id(dto);
	}
	
	// 비밀번호 찾기 - 아이디 및 이메일 일치 확인
	@Override
	public int same_idAndEmail(MemberDto dto) {
		return dao.same_idAndEmail(dto);
	}

	// 비밀번호 찾기 - 임시비밀번호 설정
	@Override
	public void search_updatePw(MemberDto dto) {
		dao.search_updatePw(dto);
	}

	@Override
	public void update(MemberDto dto) {
		dao.update(dto);
		
	}

	@Override
	public void cancellation(MemberDto dto) {
		dao.cancellation(dto);
		
	}

	@Override
	public MemberDto result_correction(MemberDto dto) {
		return dao.result_correction(dto);
	}

	@Override
	public int modify_password(MemberDto dto) {
		return dao.modify_password(dto);
		
	}
}
