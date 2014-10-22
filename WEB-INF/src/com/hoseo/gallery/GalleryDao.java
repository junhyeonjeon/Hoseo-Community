package com.hoseo.gallery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.hoseo.gallery.Interface.IGalleryDao;

@Repository
public class GalleryDao implements IGalleryDao {

	// DB 접근을 위한 객체 참조
	@Autowired
	SqlMapClientTemplate sm;

	// Gallery 글 가져오기
	@Override
	public List getList(int pg) {
		
		List list = null;
		
		try{
			list = sm.queryForList("Gallery.getlist", pg);
		}catch(Exception e){
			e.printStackTrace();
		}		
		
		return list;
	}

	@Override
	public int totalList() {
		
		int total = 0;
		
		try{
			total = (Integer)sm.queryForObject("Gallery.totalList");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return total;
	}

	@Override
	public void gallery_upload(GalleryDto dto) {
		
		System.out.println(dto.getFilename());
		try{
			sm.insert("Gallery.upload", dto);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
