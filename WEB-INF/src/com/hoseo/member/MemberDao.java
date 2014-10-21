package com.hoseo.member;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.hoseo.config.DBConnect;
import com.hoseo.member.Interface.IMemberDao;


@Repository
public class MemberDao implements IMemberDao {

	// DB 접근을 위한 객체 참조
	@Autowired
	SqlMapClientTemplate sm;
	
	// 회원 가입
	@Override
	public void insert(MemberDto dto) {
		try {
			sm.insert("Member.insert", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 로그인
	@Override
	public String login(MemberDto dto) {

		String userid = "";

		try {
			userid = (String) sm.queryForObject("Member.login", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return userid;
	}
	
	
	// 아이디 중복 체크
	public boolean isExist(String sql) {
		
		System.out.println("dsadsdsad");
		DBConnect db = new DBConnect();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		boolean result = false;

		try {
			conn = db.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int cnt = rs.getInt(1);
				if (cnt != 0)
					result = true;
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception ex) {
			}
		}
		return result;
	}
}