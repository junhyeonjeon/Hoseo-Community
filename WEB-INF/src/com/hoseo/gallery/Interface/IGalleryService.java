package com.hoseo.gallery.Interface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hoseo.gallery.GalleryDto;

@Service
public interface IGalleryService {
	List getList(int pg); // �Խñ� ��������
	int totalList(); // �Խñ� �� ���� ��������
	void gallery_upload(GalleryDto dto);
}
