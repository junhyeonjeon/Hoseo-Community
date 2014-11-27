package com.hoseo.gallery.controller;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.hoseo.gallery.GalleryDto;
import com.hoseo.gallery.Interface.IGalleryService;
import com.hoseo.page.Pager;
import com.hoseo.util.CommonFinals;
import com.hoseo.util.FileUtil;
import com.hoseo.util.ShaUtil;

@Controller
public class GalleryController {

	@Autowired
	IGalleryService service;

	// gallery ������ �̵�
	@RequestMapping(value = "/gallery/list")
	public ModelAndView gallery(Pager pgDto) {
		ModelAndView mv = new ModelAndView();

		pgDto.setRowCount(service.totalList()); // �� �� �� ��������
		pgDto.setPageSize(8); // �������� �� ���� ����

		mv.setViewName("gallery/gallery"); // ������ �̸�
		mv.addObject("layout", "gallery"); // ��� �޴� gallery select
		mv.addObject("list", service.getList(pgDto)); // �� ��������

		return mv;
	}

	// gallery upload �̵�
	@RequestMapping(value = "/gallery/upload")
	public ModelAndView gallery_upload() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("gallery/gallery_upload");
		mv.addObject("layout", "gallery");

		return mv;
	}

	// gallery delete �̵�
	@RequestMapping(value = "/gallery/delete")
	public ModelAndView gallery_delete() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("gallery/gallery_delete");
		mv.addObject("layout", "gallery");

		return mv;
	}

	// gallery delete ����
	@RequestMapping(value = "/gallery/delete_check.do")
	public ModelAndView gallery_delete_check(GalleryDto dto) {
		ModelAndView mv = new ModelAndView();
		
		// ��й�ȣ ��ȣȭ
		dto.setPw(ShaUtil.hasing(dto.getPw()));

		mv.setViewName("gallery/gallery_delete_ok");
		if (service.gallery_delete(dto))
			mv.addObject("result", "Y");

		else
			mv.addObject("result", "N");

		return mv;
	}

	// gallery insert �ϱ�
	@RequestMapping(value = "/gallery/upload_ok")
	public String write(GalleryDto dto) {

		// ���� �޾ƿͼ� �����ϱ�
		List<MultipartFile> files = dto.getFiles();
		for (int i = 0; i < files.size(); i++) {

			// �����̸� ����
			if (!files.get(i).getOriginalFilename().equals("")) {
				
				// ���� �����ϱ�(��ġ ����)
				String path = CommonFinals.uploadPathGallery;
				String filename = FileUtil.getFileName(path, files.get(i).getOriginalFilename());

				// ���� ������� ���ϸ����� �����ؾ� �Ѵ�.
				// ������ null���� ��.
				dto.getFilename()[i] = filename;
				File f = new File(path + "/" + filename);

				// ���� ������ �̸����� ���� ����
				try {
					files.get(i).transferTo(f);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		// insert �� list �������� �̵��Ѵ�.
		// �Ű������� ��ü�� ���ָ� �˾Ƽ� form ��ü�κ��� ���ƿ� �Ķ���͸� BoardDto ��ü�� ����� �ش�.
		service.gallery_upload(dto);

		// insert �� gallery �������� �̵��Ѵ�.
		return "redirect:list.do?pg=1&block=1";
	}
}
