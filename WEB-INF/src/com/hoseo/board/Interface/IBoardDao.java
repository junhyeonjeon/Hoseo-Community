package com.hoseo.board.Interface;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.hoseo.board.BoardDto;
@Repository
public interface IBoardDao {
	// CRUD
	List getList(BoardDto dto);
	void insert(BoardDto dto);
	void update(BoardDto dto);
	void delete(BoardDto dto);
	
	
}
