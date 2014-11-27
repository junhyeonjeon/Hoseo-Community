package com.hoseo.gallery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoseo.gallery.Interface.IGalleryDao;
import com.hoseo.gallery.Interface.IGalleryService;
import com.hoseo.page.Pager;

@Service
public class GalleryService implements IGalleryService {

	@Autowired
	IGalleryDao dao;

	@Override
	public List getList(Pager pgDto) {
		return dao.getList(pgDto);
	}

	@Override
	public int totalList() {
		return dao.totalList();
	}

	@Override
	public void gallery_upload(GalleryDto dto) {
		dao.gallery_upload(dto);		
	}

	@Override
	public boolean gallery_delete(GalleryDto dto) {
		return dao.gallery_delete(dto);
	}
}
