package com.hoseo.gallery;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class GalleryDto {
	private int pg;
	private int seq; // ��ȣ
	private String title; // ����
	private String contents; // ����
	private String url; // ���� ���

	private String filename[] = new String[3]; // ���ϸ�
	List<MultipartFile> files; // �������� ������ ���� ���

	public String[] getFilename() {
		return filename;
	}

	public void setFilename(String[] filename) {
		this.filename = filename;
	}

	public List<MultipartFile> getFiles() {
		return files;
	}

	public void setFiles(List<MultipartFile> files) {
		this.files = files;
	}

	public int getPg() {
		return pg;
	}

	public void setPg(int pg) {
		this.pg = pg;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
