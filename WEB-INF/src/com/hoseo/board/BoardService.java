package com.hoseo.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoseo.board.Interface.IBoardDao;
import com.hoseo.board.Interface.IBoardService;
import com.hoseo.page.Pager;

@Service
public class BoardService implements IBoardService {

	// ���� ��ü ����(dao)
	@Autowired
	IBoardDao dao;

	@Override
	public int totalList(BoardDto dto) {
		return dao.totalList(dto);
	}

	// �����̾� �Խñ� ��������
	@Override
	public List getPremium(BoardDto dto) {
		List boardList = dao.getPremium(dto);
		return boardList;
	}

	// �Ϲ� �Խñ� ��������
	@Override
	public List getList(BoardDto dto, Pager pgDto) {
		List boardList = dao.getList(dto, pgDto);
		return boardList;
	}

	// �󼼺��� �� �ش� �� ��ȸ�� ������Ʈ
	@Override
	public void updateHit(int seq) {
		dao.updateHit(seq);
	}

	// �� ���� ��������
	@Override
	public BoardDto getContents(BoardDto dto) {
		return dao.getContents(dto);
	}

	// ��� �����ϱ�
	@Override
	public void insertReple(BoardDto dto) {
		dao.insertReple(dto);
	}

	// ��� ���� ��������
	@Override
	public int getRepleCount(BoardDto dto) {
		return dao.getRepleCount(dto);
	}

	// ��� ��������
	@Override
	public List getRepleList(BoardDto dto) {
		return dao.getRepleList(dto);
	}

	// �� �����ϱ�
	@Override
	public void insert(BoardDto dto) {
		dao.insert(dto);
	}

	// �� �����ϱ�
	@Override
	public void update(BoardDto dto) {
		dao.update(dto);
	}

	// �Խñ� �����ϱ�
	@Override
	public boolean delete(BoardDto dto) {
		return dao.delete(dto);
	}

	// ��õ�� ������Ʈ
	@Override
	public void updateLike(BoardDto dto) {
		dao.updateLike(dto);
	}

	// ��� �����ϱ�
	@Override
	public void deleteReple(int reple_seq) {
		dao.deleteReple(reple_seq);
	}

	// ������ ������ ��������
	@Override
	public BoardDto getNextPre(BoardDto dto) {
		return dao.getNextPre(dto);
	}

}
