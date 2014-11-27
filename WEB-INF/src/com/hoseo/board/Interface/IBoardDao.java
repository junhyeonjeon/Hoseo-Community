package com.hoseo.board.Interface;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hoseo.board.BoardDto;
import com.hoseo.page.Pager;

@Repository
public interface IBoardDao {

	// �����̾� �Խñ� ��������
	List getPremium(BoardDto dto);

	// ��� �Ϲݱ� ��������
	List getList(BoardDto dto, Pager pgDto);

	// �󼼺��� �� �ش� �Խñ� ��ȸ�� ������Ʈ
	void updateHit(int seq);

	// �� ���� ��������
	BoardDto getContents(BoardDto dto);

	// ��� �����ϱ�
	void insertReple(BoardDto dto);

	// ��� �����ϱ�
	void deleteReple(int reple_seq);

	// ��� ���� ��������
	int getRepleCount(BoardDto dto);

	// ��� ��������
	List getRepleList(BoardDto dto);

	// �Խñ� �Է�
	void insert(BoardDto dto);

	// �Խñ� ����
	void update(BoardDto dto);

	// �Խñ� ����
	boolean delete(BoardDto dto);

	// �� �� �� ��������
	int totalList(BoardDto dto);

	// ��õ�� ������Ʈ �ϱ�
	void updateLike(BoardDto dto);

	// ������ ������ ��������
	BoardDto getNextPre(BoardDto dto);
}
