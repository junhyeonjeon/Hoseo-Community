package com.hoseo.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoseo.member.Interface.IMemberDao;
import com.hoseo.member.Interface.IMemberService;

@Service
public class MemberService implements IMemberService{

	// ���� ��ü ����(dao)
	@Autowired
	IMemberDao dao;

	@Override
	public void insert(MemberDto dto) {
		dao.insert(dto);		
	}
}
