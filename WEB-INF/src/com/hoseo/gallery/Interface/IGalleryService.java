package com.hoseo.gallery.Interface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hoseo.gallery.GalleryDto;

@Service
public interface IGalleryService {
	List getList(int pg); // 게시글 가져오기
	int totalList(); // 게시글 총 갯수 가져오기
	void gallery_upload(GalleryDto dto);
}
