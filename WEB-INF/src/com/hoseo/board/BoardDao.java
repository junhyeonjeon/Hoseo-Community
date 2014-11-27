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

	// DB ������ ���� ��ü ����
	@Autowired
	SqlMapClientTemplate sm;

	// �����̾� �Խñ� ��������
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

	// ��� �Խñ� ��������
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

	// �� ���� ��������
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

	// �� �� �� ��������
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

	// �󼼺��� �� �ش� �� ��ȸ�� ������Ʈ
	@Override
	public void updateHit(int seq) {

		try {
			sm.update("Board.updateHit", seq);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ��� �����ϱ�
	@Override
	public void insertReple(BoardDto dto) {

		try {
			sm.insert("Board.insertReple", dto);
			sm.update("Board.updateAdd", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ��� ���� ��������
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

	// ��� ��������
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

	// �� �����ϱ�
	@Override
	public void insert(BoardDto dto) {
		try {
			sm.insert("Board.insert", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �� �����ϱ�
	@Override
	public void update(BoardDto dto) {
		try {
			sm.update("Board.update", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �Խñ� �����ϱ�
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

	// ��õ�� ������Ʈ
	@Override
	public void updateLike(BoardDto dto) {
		try {
			sm.update("Board.updateLike", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ��� �����ϱ�
	@Override
	public void deleteReple(int reple_seq) {
		try {
			// �ش� �Խñ��� ��� ���� ����
			sm.update("Board.deleteRepleForBoard", reple_seq);
			// ��� ����
			sm.update("Board.deleteReple", reple_seq);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ������ ������ ��������
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