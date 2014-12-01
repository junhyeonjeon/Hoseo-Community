package com.hoseo.page;

public class Pager {
	// ����¡(������Ʈ��, �ּ�, �������� ���� ����, ���� ������ ����)
	// ex) makeTag(commonURL+"/gallery", 10)
	public static String makeTag(String url, int blockToPage, String searchKey,	String keyword) {

		// ��� ���ڿ�
		String Tag = "";

		// ������ ���� ���ϱ�(�����Ͱ���, ���������� ���� ����)
		int pageCount = pageCount(rowCount, pageSize);

		// �� �� ����(�� �� ������ ����, �� ������ ����)
		int blockTotal = blockTotal(blockToPage, pageCount);

		/* ����¡ ���� */
		StringBuffer sb = new StringBuffer();

		// ���� �� ��
		sb.append("<ul>");
		if (block > 1) {
			sb.append("<li>" + "<a href='" + url + "pg="
					+ ((block - 2) * blockToPage + 1) + "&block=" + (block - 1)
					+ "&searchKey=" + searchKey + "&keyword=" + keyword
					+ "'>��</a></li>");
		}

		// ����¡
		String pg_select; // a�±� class ����(CSS)
		for (int i = (block - 1) * blockToPage + 1; block * blockToPage >= i; i++) {
			pg_select = "";
			if (i <= pageCount) {

				// i�� ������������ ��� class�� pg_select�� ���� ���� css�� ����ǰ� �Ѵ�.
				if (i == pg)
					pg_select = "pg_select";

				sb.append("<li><a href='" + url + "pg=" + i + "&block=" + block
						+ "&searchKey=" + searchKey + "&keyword=" + keyword
						+ "' class='" + pg_select + "'>" + i + "</a></li>");
			}
		}

		// ���� �� ��
		if (block < blockTotal) {
			sb.append("<li><a href='" + url + "pg="
					+ ((block) * blockToPage + 1) + "&block=" + (block + 1)
					+ "&searchKey=" + searchKey + "&keyword=" + keyword
					+ "'>��</a></li>");
		}

		sb.append("</ul>");

		// StringBuffer�� ���� ���ڿ��� Tag�� ����
		Tag = sb.toString();

		return Tag;
	}

	// ������ ���� (�� �� ����, �������� ������ ���� ����)
	public static int pageCount(int rowCount, int page) {

		// ������ ���� ���
		int pageCount = rowCount / page;

		// ������ �ۿ� ���� ó��
		if (rowCount % page > 0)
			pageCount++;

		return pageCount;
	}

	// �� �� ����(�� �� ������ ����, �� ������ ����)
	public static int blockTotal(int blockToPage, int pageCount) {

		// �� = �� ������ / �� �� ������
		int blockTotal = pageCount / blockToPage;

		// ���� �������� ���� ó��
		if (pageCount % blockToPage != 0)
			blockTotal++;

		return blockTotal;
	}

	private static int pg; // ������ ��ȣ
	private static int block; // ��� ��ȣ
	private static int rowCount; // �� �� ��
	private static int pageSize; // �������� �� ����

	public static int getPageSize() {
		return pageSize;
	}

	public static void setPageSize(int pageSize) {
		Pager.pageSize = pageSize;
	}

	public static int getPg() {
		return pg;
	}

	public static void setPg(int pg) {
		Pager.pg = pg;
	}

	public static int getBlock() {
		return block;
	}

	public static void setBlock(int block) {
		Pager.block = block;
	}

	public static int getRowCount() {
		return rowCount;
	}

	public static void setRowCount(int rowCount) {
		Pager.rowCount = rowCount;
	}
}
