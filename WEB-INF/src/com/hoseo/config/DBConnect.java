package com.hoseo.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	// 상수로 DB 연결 문자열
	static final String connString = "jdbc:oracle:thin:@112.166.83.83:1521:xe";
	static final String id = "myhome";
	static final String pw = "myhome1234";
	Connection conn;

	// 생성자 - 드라이버 로드
	public DBConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc driver load fail");
		}
	}

	// DB에서 필요한 쿼리를 입력받아서 그 결과를
	// Arraylist 에 담아 반환
	// 즉 sql문을 매개변수로 받아 실행결과를 반환하는 함수이다.
	public Connection getConnection() {
		try {
			conn = DriverManager.getConnection(connString, id, pw);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
