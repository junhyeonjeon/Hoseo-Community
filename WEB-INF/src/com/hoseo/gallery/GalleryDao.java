package com.hoseo.gallery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.hoseo.gallery.Interface.IGalleryDao;
import com.hoseo.member.MemberDto;
import com.hoseo.page.Pager;

@Repository
public class GalleryDao implements IGalleryDao {

	// DB ������ ���� ��ü ����
	@Autowired
	SqlMapClientTemplate sm;

	// Gallery �� ��������
	@Override
	public List getList(Pager pgDto) {

		List list = null;

		try {
			list = sm.queryForList("Gallery.getlist", pgDto);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	// ������ �Խñ� ���� ��������
	@Override
	public int totalList() {

		int total = 0;

		try {
			total = (Integer) sm.queryForObject("Gallery.totalList");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return total;
	}

	// �Խñ� ���ε��ϱ�
	@Override
	public void gallery_upload(GalleryDto dto) {

		dto.setUrl(dto.getFilename()[0]);

		try {
			sm.insert("Gallery.upload", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �Խñ� ����
	@Override
	public boolean gallery_delete(GalleryDto dto) {
		
		try {
			if ((Integer) sm.queryForObject("Gallery.seqCheck", dto) > 0) {
				MemberDto mdto = new MemberDto();
				mdto.setUserid(dto.getUserid());
				mdto.setPw1(dto.getPw());
				if ((Integer) sm.queryForObject("Member.login", mdto) > 0){
					sm.update("Gallery.delete", dto);
					return true;
				}
				
			}
		} catch (Exception e) {
			return false;
		}

		return false;
	}
}
