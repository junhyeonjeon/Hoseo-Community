package com.hoseo.message.Interface;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hoseo.board.BoardDto;
import com.hoseo.message.MessageDto;
import com.hoseo.page.Pager;

@Repository
public interface IMessageDao {
	
	void insert(MessageDto dto);
	


	List sendList(MessageDto dto);
	List receiveList(MessageDto dto);
	int count(MessageDto dto);

}
