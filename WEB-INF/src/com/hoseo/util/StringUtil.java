package com.hoseo.util;

public class StringUtil {

	public static String textToDb(String str) {
		str = str.replaceAll("&", "&amp;");
		str = str.replaceAll("%", "&#37;");
		str = str.replaceAll("'", "''");
		str = str.replaceAll("<", "&lt;");
		str = str.replaceAll(">", "&gt;");
		str = str.replaceAll("\r\n", "<BR/>");
		str = str.replaceAll("\n", "<BR/>");
		return str;
	}

	public static String dbToText(String str) {

		str = str.replaceAll("<BR/>", "\n");
		str = str.replaceAll("&amp;", "&");
		str = str.replaceAll("&#37;", "%");
		str = str.replaceAll("''", "'");
		str = str.replaceAll("&lt;", "<");
		str = str.replaceAll("&gt;", ">");

		return str;
	}

	public static String convNull(String str) {
		if (isNull(str))
			return "";
		return str;
	}

	public static String convNull(Object str, String def) {
		if (isNull(str))
			return def;
		return str.toString();
	}

	public static boolean isNull(Object s) {
		if (s == null)
			return true;

		String str = s.toString();
		return (str == null || str.trim().length() < 1);
	}
}
