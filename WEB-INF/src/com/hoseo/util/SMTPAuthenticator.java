package com.hoseo.util;

import javax.mail.PasswordAuthentication;

public class SMTPAuthenticator extends javax.mail.Authenticator{	
	public PasswordAuthentication getPasswordAuthentication(){
		// ���̹��� Gmail ����� ���� ����
		// Gmail�� ��� @gmail.com�� ������ ���̵� �Է��Ѵ�.
		return new PasswordAuthentication("hoseo_cmu@naver.com", "test5678");
	}
}