package com.hoseo.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	// ����� DB ���� ���ڿ�
	static final String connString = "jdbc:oracle:thin:@112.166.83.83:1521:xe";
	static final String id = "myhome";
	static final String pw = "myhome1234";
	Connection conn;

	// ������ - ����̹� �ε�
	public DBConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc driver load fail");
		}
	}

	// DB���� �ʿ��� ������ �Է¹޾Ƽ� �� �����
	// Arraylist �� ��� ��ȯ
	// �� sql���� �Ű������� �޾� �������� ��ȯ�ϴ� �Լ��̴�.
	public Connection getConnection() {
		try {
			conn = DriverManager.getConnection(connString, id, pw);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
