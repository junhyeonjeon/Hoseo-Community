package com.hoseo.gallery;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class GalleryDto {

	private int seq; // 번호
	private String title; // 제목
	private String url; // 사진 경로
	private String writer; // 작성자
	private String wdate; // 작성일
	private String username; // 작성자 닉네임

	// 사진 삭제용 정보
	private String userid; // 사용자 id
	private String pw; // 암호

	private String filename[] = new String[3]; // 파일명
	List<MultipartFile> files; // 여러개의 파일을 받을 경우

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
