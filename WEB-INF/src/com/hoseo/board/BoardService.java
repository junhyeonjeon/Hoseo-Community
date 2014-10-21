package com.hoseo.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoseo.board.Interface.IBoardDao;
import com.hoseo.board.Interface.IBoardService;

@Service
public class BoardService implements IBoardService{

	// 참조 객체 선언(dao)
	@Autowired
	IBoardDao dao;
	
	@Override
	public List getList(BoardDto dto) {
		List boardList = dao.getList(dto);
		return boardList;
	}

	@Override
	public void insert(BoardDto dto) {
		dao.insert(dto);		
	}

	@Override
	public void update(BoardDto dto) {
		dao.update(dto);		
	}

	@Override
	public void delete(BoardDto dto) {
		dao.delete(dto);		
	}

}
