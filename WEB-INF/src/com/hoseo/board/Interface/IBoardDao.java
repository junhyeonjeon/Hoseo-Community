package com.hoseo.board.Interface;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hoseo.board.BoardDto;
import com.hoseo.page.Pager;

@Repository
public interface IBoardDao {

	// 프리미엄 게시글 가져오기
	List getPremium(BoardDto dto);

	// 모든 일반글 가져오기
	List getList(BoardDto dto, Pager pgDto);

	// 상세보기 시 해당 게시글 조회수 업데이트
	void updateHit(int seq);

	// 글 내용 가져오기
	BoardDto getContents(BoardDto dto);

	// 댓글 저장하기
	void insertReple(BoardDto dto);

	// 댓글 삭제하기
	void deleteReple(int reple_seq);

	// 댓글 갯수 가져오기
	int getRepleCount(BoardDto dto);

	// 댓글 가져오기
	List getRepleList(BoardDto dto);

	// 게시글 입력
	void insert(BoardDto dto);

	// 게시글 수정
	void update(BoardDto dto);

	// 게시글 삭제
	boolean delete(BoardDto dto);

	// 총 글 수 가져오기
	int totalList(BoardDto dto);

	// 추천수 업데이트 하기
	void updateLike(BoardDto dto);

	// 이전글 다음글 가져오기
	BoardDto getNextPre(BoardDto dto);
}
