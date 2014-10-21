package com.hoseo.member.Interface;

import org.springframework.stereotype.Service;

import com.hoseo.member.MemberDto;

@Service
public interface IMemberService {
	
	void insert(MemberDto dto);
	boolean login(MemberDto dto);
}
