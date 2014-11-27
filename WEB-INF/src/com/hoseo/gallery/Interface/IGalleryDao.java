package com.hoseo.gallery.Interface;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hoseo.gallery.GalleryDto;
import com.hoseo.page.Pager;

@Repository
public interface IGalleryDao {

	List getList(Pager pgDto); //글 가져오기
	int totalList(); // 게시글 총 갯수 가져오기
	void gallery_upload(GalleryDto dto); // 사진 업로드
	boolean gallery_delete(GalleryDto dto); // 삭제
}
