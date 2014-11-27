package com.hoseo.member.Interface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hoseo.member.MemberDto;

@Service
public interface IMemberService {

	// ȸ������
	void insert(MemberDto dto);

	// �α���
	boolean login(MemberDto dto);

	// ���̵�ã��
	List search_id(MemberDto dto);
	
	// ��й�ȣ ã�� - ���̵� �� �̸��� ��ġ Ȯ��
	int same_idAndEmail(MemberDto dto);
	
	// ��й�ȣ ã�� - �ӽú�й�ȣ ����
	void search_updatePw(MemberDto dto);

	void update(MemberDto dto);

	void cancellation(MemberDto dto);

	MemberDto result_correction(MemberDto dto);

	int modify_password(MemberDto dto);
}
