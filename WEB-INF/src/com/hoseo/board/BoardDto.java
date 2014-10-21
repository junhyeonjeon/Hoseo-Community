package com.hoseo.board;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class BoardDto {
	private int pg; // ���� ������ ��ȣ
	private int page_group; // 
	private String searchKey; // ����, ����, �ۼ��� �� �˻� �ɼ�
	private String keyword; // �˻���

	private int hit; // ��ȸ��
	private int group_id; // �θ������� �׷�
	private int depth; // 
	private int level_order; // 
	private String ip; // �ۼ��� ������

	private int num; // �Խñ� ����Ʈ ��ȣ
	private int seq; // �Խñ��� ���� ������ȣ
	private String title; // ����
	private String contents; // ����
	private String writer; // �ۼ���
	private String wdate; // �ۼ���
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
