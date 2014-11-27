package com.hoseo.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoseo.board.BoardDto;
import com.hoseo.member.MemberDto;
import com.hoseo.message.MessageDto;
import com.hoseo.message.Interface.IMessageDao;
import com.hoseo.message.Interface.IMessageService;

@Service
public class MessageService implements IMessageService {

	// ���� ��ü ����(dao)
	@Autowired
	IMessageDao dao;

	@Override
	public void insert(MessageDto dto) {
		dao.insert(dto);
	}

	// ���� ���� ��������
	@Override
	public List receiveList(MessageDto dto) {
		List messageList = dao.receiveList(dto);
		return messageList;
	}

	// ���� ���� ��������
	@Override
	public List sendList(MessageDto dto) {
		List messageList = dao.sendList(dto);
		return messageList;
	}

	// ���� ���� ��������
	@Override
	public int count(MessageDto dto) {
		return dao.count(dto);

	}

}
