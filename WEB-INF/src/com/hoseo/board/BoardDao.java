package com.hoseo.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.hoseo.board.Interface.IBoardDao;

@Repository
public class BoardDao implements IBoardDao {

	// DB 접근을 위한 객체 참조
	@Autowired
	SqlMapClientTemplate sm;

	@Override
	public List getList(BoardDto dto) {
		List boardList = null;

		try {
			boardList = sm.queryForList("Board.getList", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return boardList;
	}

	@Override
	public void insert(BoardDto dto) {
		try {
			sm.insert("Board.insert", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(BoardDto dto) {
		try {
			sm.update("Board.update", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(BoardDto dto) {
		try {
			sm.delete("Board.delete", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}