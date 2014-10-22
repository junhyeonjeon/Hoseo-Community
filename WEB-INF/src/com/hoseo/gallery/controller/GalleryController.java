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
import com.hoseo.gallery.util.CommonFinals;
import com.hoseo.gallery.util.FileUtil;

@Controller
public class GalleryController {

	@Autowired
	IGalleryService service;

	// gallery ������ �̵�
	@RequestMapping(value = "/gallery")
	public ModelAndView gallery(GalleryDto dto) {
		ModelAndView mv = new ModelAndView();

		int rowCount = service.totalList(); // �� �� ��

		// ������ ����
		int pageCount = rowCount / 10;
		if (rowCount % 10 > 0)
			pageCount++;

		// ������ ��
		int block = pageCount / 10;
		if (pageCount % 10 != 0)
			block++;

		mv.setViewName("gallery"); // ������ �̸�
		mv.addObject("pg", dto.getPg()); // ������ ��ȣ
		mv.addObject("pageCount", pageCount); // ������ ����
		mv.addObject("block", block); // ������ ����
		mv.addObject("layout", "gallery"); // ��� �޴� gallery select
		mv.addObject("list", service.getList(dto.getPg())); // �� ��������

		return mv;
	}

	// gallery upload �̵�
	@RequestMapping(value = "/gallery_upload")
	public ModelAndView gallery_upload() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("gallery_upload");
		mv.addObject("layout", "gallery");

		return mv;
	}

	// gallery insert �ϱ�
	@RequestMapping(value = "/gallery_upload_ok")
	public String write(GalleryDto dto) {

		// ���� �޾ƿͼ� �����ϱ�
		List<MultipartFile> files = dto.getFiles();
		for (int i = 0; i < files.size(); i++) {

			// �����̸� ����
			if (!files.get(i).getOriginalFilename().equals("")) {
				// ���� �����ϱ�(��ġ ����)
				String path = CommonFinals.uploadPath;
				String filename = path + "/" + FileUtil.getFileName(path, files.get(i).getOriginalFilename());

				// ���� ������� ���ϸ����� �����ؾ� �Ѵ�.
				// ������ null���� ��.
				dto.getFilename()[i] = filename;
				File f = new File(filename);

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
		return "redirect:gallery.do?pg=1";
	}
}
