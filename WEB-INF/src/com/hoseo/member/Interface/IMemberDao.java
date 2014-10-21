package com.hoseo.member.Interface;

import org.springframework.stereotype.Repository;

import com.hoseo.member.MemberDto;
@Repository
public interface IMemberDao {
	
	void insert(MemberDto dto);
	boolean isExist(String sql);
	boolean login(MemberDto dto);
}
