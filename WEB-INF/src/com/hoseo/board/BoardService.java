package com.hoseo.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoseo.board.Interface.IBoardDao;
import com.hoseo.board.Interface.IBoardService;
import com.hoseo.page.Pager;

@Service
public class BoardService implements IBoardService {

	// 참조 객체 선언(dao)
	@Autowired
	IBoardDao dao;

	@Override
	public int totalList(BoardDto dto) {
		return dao.totalList(dto);
	}

	// 프리미엄 게시글 가져오기
	@Override
	public List getPremium(BoardDto dto) {
		List boardList = dao.getPremium(dto);
		return boardList;
	}

	// 일반 게시글 가져오기
	@Override
	public List getList(BoardDto dto, Pager pgDto) {
		List boardList = dao.getList(dto, pgDto);
		return boardList;
	}

	// 상세보기 시 해당 글 조회수 업데이트
	@Override
	public void updateHit(int seq) {
		dao.updateHit(seq);
	}

	// 글 내용 가져오기
	@Override
	public BoardDto getContents(BoardDto dto) {
		return dao.getContents(dto);
	}

	// 댓글 저장하기
	@Override
	public void insertReple(BoardDto dto) {
		dao.insertReple(dto);
	}

	// 댓글 갯수 가져오기
	@Override
	public int getRepleCount(BoardDto dto) {
		return dao.getRepleCount(dto);
	}

	// 댓글 가져오기
	@Override
	public List getRepleList(BoardDto dto) {
		return dao.getRepleList(dto);
	}

	// 글 저장하기
	@Override
	public void insert(BoardDto dto) {
		dao.insert(dto);
	}

	// 글 수정하기
	@Override
	public void update(BoardDto dto) {
		dao.update(dto);
	}

	// 게시글 삭제하기
	@Override
	public boolean delete(BoardDto dto) {
		return dao.delete(dto);
	}

	// 추천수 업데이트
	@Override
	public void updateLike(BoardDto dto) {
		dao.updateLike(dto);
	}

	// 댓글 삭제하기
	@Override
	public void deleteReple(int reple_seq) {
		dao.deleteReple(reple_seq);
	}

	// 이전글 다음글 가져오기
	@Override
	public BoardDto getNextPre(BoardDto dto) {
		return dao.getNextPre(dto);
	}

}
