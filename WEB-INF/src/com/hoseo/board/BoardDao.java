package com.hoseo.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.hoseo.board.Interface.IBoardDao;
import com.hoseo.member.MemberDto;
import com.hoseo.page.Pager;

@Repository
public class BoardDao implements IBoardDao {

	// DB 접근을 위한 객체 참조
	@Autowired
	SqlMapClientTemplate sm;

	// 프리미엄 게시글 가져오기
	@Override
	public List getPremium(BoardDto dto) {
		List boardList = null;

		try {
			boardList = sm.queryForList("Board.getPremium", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return boardList;
	}

	// 모든 게시글 가져오기
	@Override
	public List getList(BoardDto dto, Pager pgDto) {
		List boardList = null;

		Map map = new HashMap();
		map.put("category", dto.getCategory());
		map.put("pg", (Integer) pgDto.getPg());
		map.put("pageSize", (Integer) pgDto.getPageSize());
		map.put("searchKey", dto.getSearchKey());
		map.put("keyword", dto.getKeyword());

		try {
			boardList = sm.queryForList("Board.getList", map);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return boardList;
	}

	// 글 내용 가져오기
	@Override
	public BoardDto getContents(BoardDto dto) {

		BoardDto getdto = new BoardDto();

		try {
			getdto = (BoardDto) sm.queryForObject("Board.getContents", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return getdto;
	}

	// 총 글 수 가져오기
	@Override
	public int totalList(BoardDto dto) {

		int total = 0;

		try {
			total = (Integer) sm.queryForObject("Board.totalList", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return total;
	}

	// 상세보기 시 해당 글 조회수 업데이트
	@Override
	public void updateHit(int seq) {

		try {
			sm.update("Board.updateHit", seq);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 댓글 저장하기
	@Override
	public void insertReple(BoardDto dto) {

		try {
			sm.insert("Board.insertReple", dto);
			sm.update("Board.updateAdd", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 댓글 갯수 가져오기
	@Override
	public int getRepleCount(BoardDto dto) {

		int count = 0;

		try {
			count = (Integer) sm.queryForObject("Board.repleCount", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return count;
	}

	// 댓글 가져오기
	@Override
	public List getRepleList(BoardDto dto) {

		List repleList = null;

		try {
			repleList = sm.queryForList("Board.getRepleList", dto);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return repleList;
	}

	// 글 저장하기
	@Override
	public void insert(BoardDto dto) {
		try {
			sm.insert("Board.insert", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 글 수정하기
	@Override
	public void update(BoardDto dto) {
		try {
			sm.update("Board.update", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 게시글 삭제하기
	@Override
	public boolean delete(BoardDto dto) {

		try {
			if ((Integer) sm.queryForObject("Board.seqCheck", dto) > 0) {
				MemberDto mdto = new MemberDto();
				mdto.setUserid(dto.getUserid());
				mdto.setPw1(dto.getPw());
				if ((Integer) sm.queryForObject("Member.login", mdto) > 0) {
					sm.update("Board.delete", dto);
					sm.update("Board.delete_cascade", dto);
					return true;
				}
			}
		} catch (Exception e) {
			return false;
		}

		return false;
	}

	// 추천수 업데이트
	@Override
	public void updateLike(BoardDto dto) {
		try {
			sm.update("Board.updateLike", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 댓글 삭제하기
	@Override
	public void deleteReple(int reple_seq) {
		try {
			// 해당 게시글의 댓글 갯수 감소
			sm.update("Board.deleteRepleForBoard", reple_seq);
			// 댓글 삭제
			sm.update("Board.deleteReple", reple_seq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 이전글 다음글 가져오기
	@Override
	public BoardDto getNextPre(BoardDto dto) {

		BoardDto nextpre = new BoardDto();

		try {
			nextpre = (BoardDto)sm.queryForObject("Board.next_prev", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return nextpre;
	}
}