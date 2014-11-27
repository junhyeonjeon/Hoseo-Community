package com.hoseo.gallery.Interface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hoseo.gallery.GalleryDto;
import com.hoseo.page.Pager;

@Service
public interface IGalleryService {
	List getList(Pager pgDto); // �Խñ� ��������
	int totalList(); // �Խñ� �� ���� ��������
	void gallery_upload(GalleryDto dto); // ���� ���ε�
	boolean gallery_delete(GalleryDto dto); // ���� �� ��ȣ ��ġ ���� Ȯ��
}
