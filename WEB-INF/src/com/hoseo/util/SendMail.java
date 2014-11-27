package com.hoseo.util;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

	public static void send(String sender, String receiver, String subject, String content) {

		// 메일 발송을 위한 정보 설정
		// 정보를 담기 위한 객체
		Properties p = new Properties();

		// SMTP 서버의 계정 설정
		// Naver와 연결할 경우 네이버 아이디 지정
		// Google과 연결할 경우 본인의 Gmail 주소
		p.put("mail.smtp.user", sender);

		// SMTP 서버 정보 설정
		// 네이버일 경우 smtp.naver.com
		// Google일 경우 smtp.gmail.com
		p.put("mail.smtp.host", "smtp.naver.com");

		// 아래 정보는 네이버와 구글이 동일하므로 수정하지 마세요.
		p.put("mail.smtp.port", "465");
		p.put("mail.smtp.starttls.enable", "true");
		p.put("mail.smtp.auth", "true");
		p.put("mail.smtp.debug", "true");
		p.put("mail.smtp.socketFactory.port", "465");
		p.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		p.put("mail.smtp.socketFactory.fallback", "false");

		// 발송하기 부분 구현
		try {
			Authenticator auth = new SMTPAuthenticator();
			Session ses = Session.getInstance(p, auth);

			// 메일을 전송할 때 상세한 상황을 콘솔에 출력한다.
			ses.setDebug(true);

			// 메일의 내용을 담기 위한 객체
			MimeMessage msg = new MimeMessage(ses);

			// 제목 설정
			msg.setSubject(subject);

			// 보내는 사람의 메일 주소
			Address fromAddr = new InternetAddress(sender);
			msg.setFrom(fromAddr);

			// 받는 사람의 메일 주소
			Address toAddr = new InternetAddress(receiver);
			msg.addRecipient(Message.RecipientType.TO, toAddr);

			// 메시지 본문의 내용과 형식, 캐릭터 셋 설정
			msg.setContent(content, "text/html;charset=UTF-8");

			// 발송하기
			Transport.send(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
