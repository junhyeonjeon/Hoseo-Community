package com.hoseo.message;

public class MessageDto {

	String sendid;
	String receiveid;
	String subject;
	String contents;
	String sdate;
	String delyn;
	
	int count;
	
	
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public String getSendid() {
		return sendid;
	}
	public void setSendid(String sendid) {
		this.sendid = sendid;
	}
	public String getReceiveid() {
		return receiveid;
	}
	public void setReceiveid(String receiveid) {
		this.receiveid = receiveid;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getDelyn() {
		return delyn;
	}
	public void setDelyn(String delyn) {
		this.delyn = delyn;
	} 
	
	
	
	
	
}
