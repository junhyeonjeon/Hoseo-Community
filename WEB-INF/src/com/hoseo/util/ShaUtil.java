package com.hoseo.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ShaUtil {
	public static String hasing(String password) {

		/* ��й�ȣ ��ȣȭ */
		// String �� Byte�� �����´�.
		byte[] byteArray = password.getBytes();

		MessageDigest md = null;

		try {
			// ��ȣȭ ��� ����
			md = MessageDigest.getInstance("SHA1");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		md.reset();
		md.update(byteArray);

		// ��ȣȭ
		byte digest[] = md.digest();

		StringBuffer buffer = new StringBuffer();

		// ��� ������ ����
		for (int i = 0; i < digest.length; i++) {
			buffer.append(Integer.toHexString(0xFF & digest[i]));
		}

		return buffer.toString();
	}
}
