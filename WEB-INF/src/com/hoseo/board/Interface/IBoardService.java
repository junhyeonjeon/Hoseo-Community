package com.hoseo.board.Interface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hoseo.board.BoardDto;

@Service
public interface IBoardService {
	// CRUD
	List getList(BoardDto dto);

	void insert(BoardDto dto);

	void update(BoardDto dto);

	void delete(BoardDto dto);
}
