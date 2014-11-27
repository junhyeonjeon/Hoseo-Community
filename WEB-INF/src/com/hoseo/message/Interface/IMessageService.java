package com.hoseo.message.Interface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hoseo.message.MessageDto;
import com.hoseo.page.Pager;

@Service
public interface IMessageService {
	
	void insert(MessageDto dto);
	List sendList(MessageDto dto);
	List receiveList(MessageDto dto);
	int count(MessageDto dto);
}
