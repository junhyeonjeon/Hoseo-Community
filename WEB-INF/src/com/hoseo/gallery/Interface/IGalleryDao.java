package com.hoseo.gallery.Interface;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hoseo.gallery.GalleryDto;

@Repository
public interface IGalleryDao {

	List getList(int pg); //글 가져오기
	int totalList(); // 게시글 총 갯수 가져오기
	void gallery_upload(GalleryDto dto);
}
