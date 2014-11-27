package com.hoseo.message;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.hoseo.board.BoardDto;
import com.hoseo.config.DBConnect;
import com.hoseo.member.MemberDto;
import com.hoseo.message.Interface.IMessageDao;


@Repository
public class MessageDao implements IMessageDao {

	// DB 접근을 위한 객체 참조
	@Autowired
	SqlMapClientTemplate sm;
	
	// 메세지 쓰기
	@Override
	public void insert(MessageDto dto) {
		try {
			sm.insert("Message.insert", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	// 보낸 쪽지 가져오기
	@Override
	public List sendList(MessageDto dto) {
		List messageList = null;

		try {
			messageList = sm.queryForList("Message.sendList", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return messageList;
	}
	
	
	// 받은 쪽지 가져오기
		@Override
		public List receiveList(MessageDto dto) {
			List messageList = null;

			try {
				messageList = sm.queryForList("Message.receiveList", dto);
			} catch (Exception e) {
				e.printStackTrace();
			}

			return messageList;
		}
		
		
		@Override
		public int count(MessageDto dto) {
			int result =0;
			try {
				result = (Integer) sm.queryForObject("Message.count", dto) ;			
			} catch (Exception e) {
				e.printStackTrace();
				result=0;
			}
			return result;	
		}
		
		
}