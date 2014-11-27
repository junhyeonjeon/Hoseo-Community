package com.hoseo.gallery.Interface;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hoseo.gallery.GalleryDto;
import com.hoseo.page.Pager;

@Repository
public interface IGalleryDao {

	List getList(Pager pgDto); //�� ��������
	int totalList(); // �Խñ� �� ���� ��������
	void gallery_upload(GalleryDto dto); // ���� ���ε�
	boolean gallery_delete(GalleryDto dto); // ����
}
