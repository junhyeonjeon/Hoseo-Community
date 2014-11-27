package com.hoseo.member;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.hoseo.config.DBConnect;
import com.hoseo.member.Interface.IMemberDao;

@Repository
public class MemberDao implements IMemberDao {

	// DB ������ ���� ��ü ����
	@Autowired
	SqlMapClientTemplate sm;

	// ȸ�� ����
	@Override
	public void insert(MemberDto dto) {
		try {
			sm.insert("Member.insert", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �α���
	@Override
	public boolean login(MemberDto dto) {

		try {
			int result = (Integer) sm.queryForObject("Member.login", dto);
			if (result == 1) {
				try {
					dto.setUsername((String) sm.queryForObject("Member.login_name", dto));
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}
				return true;
			}
			return false;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	// �ߺ� üũ
	public boolean isExist(String sql) {

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

	// ���̵� ã��
	@Override
	public List search_id(MemberDto dto) {

		List result = null;

		try {
			result = sm.queryForList("Member.search_id", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	// ��й�ȣ ã�� - ���̵� �� �̸��� ��ġ Ȯ��
	@Override
	public int same_idAndEmail(MemberDto dto) {

		int result = 0;

		try {
			result = (Integer) sm.queryForObject("Member.idAndEmail", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	// ��й�ȣ ã�� - �ӽú�й�ȣ ����
	@Override
	public void search_updatePw(MemberDto dto) {
		try {
			sm.update("Member.search_updatePw", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(MemberDto dto){
		try {
			sm.update("Member.update", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void cancellation(MemberDto dto) {
		try {
			sm.update("Member.cancellation", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public MemberDto result_correction(MemberDto dto) {
		MemberDto result = new MemberDto(); 
		//��ü�� ��� �������ϳ� 

		try {
			result = (MemberDto) sm.queryForObject("Member.result_correction", dto);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
		
	}

	@Override
	public int modify_password(MemberDto dto) {
		int result =0;

		try {
			
			result = (Integer) sm.queryForObject("Member.modify_password", dto) ;
			
						
		} catch (Exception e) {
			e.printStackTrace();
			result=0;
		}
		
		return result;	
	
	}
}