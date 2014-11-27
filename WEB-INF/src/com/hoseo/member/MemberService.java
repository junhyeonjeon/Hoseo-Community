package com.hoseo.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoseo.member.Interface.IMemberDao;
import com.hoseo.member.Interface.IMemberService;

@Service
public class MemberService implements IMemberService{

	// ���� ��ü ����(dao)
	@Autowired
	IMemberDao dao;

	// ȸ�� ����
	@Override
	public void insert(MemberDto dto) {
		dao.insert(dto);		
	}

	// �α���
	@Override
	public boolean login(MemberDto dto) {
		return dao.login(dto);
	}

	// ���̵� ã��
	@Override
	public List search_id(MemberDto dto) {
		return dao.search_id(dto);
	}
	
	// ��й�ȣ ã�� - ���̵� �� �̸��� ��ġ Ȯ��
	@Override
	public int same_idAndEmail(MemberDto dto) {
		return dao.same_idAndEmail(dto);
	}

	// ��й�ȣ ã�� - �ӽú�й�ȣ ����
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
