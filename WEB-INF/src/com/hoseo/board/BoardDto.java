package com.hoseo.board;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class BoardDto {
	private int pg; // ���� ������ ��ȣ
	private String searchKey; // ����, ����, �ۼ��� �� �˻� �ɼ�
	private String keyword; // �˻���

	private String userid; // �Խñ� ������ ����� ���̵�
	private String pw; // �Խñ� ������ ����� ��ȣ

	private int hit; // ��ȸ��
	private int group_id; // �θ������� �׷�
	private int depth; //
	private int level_order; //
	private String ip; // �ۼ��� ������

	private int num; // �Խñ� ����Ʈ ��ȣ
	private int seq; // �Խñ��� ���� ������ȣ
	private int premium; // �����̾� ����
	private String title; // ����
	private String contents; // ����
	private String writer; // �ۼ���
	private String username; // �ۼ��� �̸�
	private String wdate; // �ۼ���
	private String category; // ī�װ�
	private int replecount; // ��� ����
	private int likecount; // ��õ��

	private int reple_seq; // ���� ��ȣ

	private int next_seq; // ������ ��ȣ
	private int pre_seq; // ������ ��ȣ
	private String next_title; // ������ ����
	private String pre_title; // ������ ����

	private String filename[] = new String[5]; // ���ϸ�

	List<MultipartFile> files; // �������� ������ ���� ���

	private String filename1;
	private String filename2;
	private String filename3;
	private String filename4;
	private String filename5;

	public String getFilename1() {
		return filename1;
	}

	public void setFilename1(String filename1) {
		this.filename1 = filename1;
	}

	public String getFilename2() {
		return filename2;
	}

	public void setFilename2(String filename2) {
		this.filename2 = filename2;
	}

	public String getFilename3() {
		return filename3;
	}

	public void setFilename3(String filename3) {
		this.filename3 = filename3;
	}

	public String getFilename4() {
		return filename4;
	}

	public void setFilename4(String filename4) {
		this.filename4 = filename4;
	}

	public String getFilename5() {
		return filename5;
	}

	public void setFilename5(String filename5) {
		this.filename5 = filename5;
	}

	public int getPremium() {
		return premium;
	}

	public void setPremium(int hot) {
		this.premium = hot;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getReplecount() {
		return replecount;
	}

	public void setReplecount(int replecount) {
		this.replecount = replecount;
	}

	public int getLikecount() {
		return likecount;
	}

	public void setLikecount(int likecount) {
		this.likecount = likecount;
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

	public int getReple_seq() {
		return reple_seq;
	}

	public void setReple_seq(int reple_seq) {
		this.reple_seq = reple_seq;
	}

	public int getNext_seq() {
		return next_seq;
	}

	public void setNext_seq(int next_seq) {
		this.next_seq = next_seq;
	}

	public int getPre_seq() {
		return pre_seq;
	}

	public void setPre_seq(int pre_seq) {
		this.pre_seq = pre_seq;
	}

	public String getNext_title() {
		return next_title;
	}

	public void setNext_title(String next_title) {
		this.next_title = next_title;
	}

	public String getPre_title() {
		return pre_title;
	}

	public void setPre_title(String pre_title) {
		this.pre_title = pre_title;
	}

}
