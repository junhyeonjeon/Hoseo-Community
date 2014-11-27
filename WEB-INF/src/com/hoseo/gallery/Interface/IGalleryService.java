package com.hoseo.gallery.Interface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hoseo.gallery.GalleryDto;
import com.hoseo.page.Pager;

@Service
public interface IGalleryService {
	List getList(Pager pgDto); // 게시글 가져오기
	int totalList(); // 게시글 총 갯수 가져오기
	void gallery_upload(GalleryDto dto); // 사진 업로드
	boolean gallery_delete(GalleryDto dto); // 삭제 전 암호 일치 여부 확인
}
