package com.hoseo.board;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class BoardDto {
	private int pg; // 현재 페이지 번호
	private int page_group; // 
	private String searchKey; // 제목, 내용, 작성자 등 검색 옵션
	private String keyword; // 검색어

	private int hit; // 조회수
	private int group_id; // 부모페이지 그룹
	private int depth; // 
	private int level_order; // 
	private String ip; // 작성자 아이피

	private int num; // 게시글 리스트 번호
	private int seq; // 게시글의 실제 고유번호
	private String title; // 제목
	private String contents; // 내용
	private String writer; // 작성자
	private String wdate; // 작성일
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
	public int getPg() {
		return pg;
	}
	public void setPg(int pg) {
		this.pg = pg;
	}
	public int getPage_group() {
		return page_group;
	}
	public void setPage_group(int page_group) {
		this.page_group = page_group;
	}
	public String getSearchKey() {
		return searchKey;
	}
	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public int getGroup_id() {
		return group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public int getLevel_order() {
		return level_order;
	}
	public void setLevel_order(int level_order) {
		this.level_order = level_order;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
}
