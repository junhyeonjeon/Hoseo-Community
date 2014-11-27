package com.hoseo.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ShaUtil {
	public static String hasing(String password) {

		/* 비밀번호 암호화 */
		// String 을 Byte로 가져온다.
		byte[] byteArray = password.getBytes();

		MessageDigest md = null;

		try {
			// 암호화 방법 선택
			md = MessageDigest.getInstance("SHA1");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		md.reset();
		md.update(byteArray);

		// 암호화
		byte digest[] = md.digest();

		StringBuffer buffer = new StringBuffer();

		// 헥사 값으로 저장
		for (int i = 0; i < digest.length; i++) {
			buffer.append(Integer.toHexString(0xFF & digest[i]));
		}

		return buffer.toString();
	}
}
