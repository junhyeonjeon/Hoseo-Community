package com.hoseo.gallery.Interface;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hoseo.gallery.GalleryDto;

@Repository
public interface IGalleryDao {

	List getList(int pg); //�� ��������
	int totalList(); // �Խñ� �� ���� ��������
	void gallery_upload(GalleryDto dto);
}
