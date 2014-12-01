package com.hoseo.page;

public class Pager {
	// 페이징(프로젝트명, 주소, 페이지당 글의 개수, 블럭당 페이지 개수)
	// ex) makeTag(commonURL+"/gallery", 10)
	public static String makeTag(String url, int blockToPage, String searchKey,	String keyword) {

		// 결과 문자열
		String Tag = "";

		// 페이지 개수 구하기(데이터개수, 한페이지당 글의 갯수)
		int pageCount = pageCount(rowCount, pageSize);

		// 총 블럭 개수(블럭 당 페이지 개수, 총 페이지 개수)
		int blockTotal = blockTotal(blockToPage, pageCount);

		/* 페이징 시작 */
		StringBuffer sb = new StringBuffer();

		// 이전 블럭 ◀
		sb.append("<ul>");
		if (block > 1) {
			sb.append("<li>" + "<a href='" + url + "pg="
					+ ((block - 2) * blockToPage + 1) + "&block=" + (block - 1)
					+ "&searchKey=" + searchKey + "&keyword=" + keyword
					+ "'>◀</a></li>");
		}

		// 페이징
		String pg_select; // a태그 class 지정(CSS)
		for (int i = (block - 1) * blockToPage + 1; block * blockToPage >= i; i++) {
			pg_select = "";
			if (i <= pageCount) {

				// i가 현재페이지일 경우 class에 pg_select를 적용 시켜 css가 적용되게 한다.
				if (i == pg)
					pg_select = "pg_select";

				sb.append("<li><a href='" + url + "pg=" + i + "&block=" + block
						+ "&searchKey=" + searchKey + "&keyword=" + keyword
						+ "' class='" + pg_select + "'>" + i + "</a></li>");
			}
		}

		// 이전 블럭 ▶
		if (block < blockTotal) {
			sb.append("<li><a href='" + url + "pg="
					+ ((block) * blockToPage + 1) + "&block=" + (block + 1)
					+ "&searchKey=" + searchKey + "&keyword=" + keyword
					+ "'>▶</a></li>");
		}

		sb.append("</ul>");

		// StringBuffer에 만든 문자열을 Tag에 저장
		Tag = sb.toString();

		return Tag;
	}

	// 페이지 개수 (총 글 갯수, 페이지당 보여줄 글의 개수)
	public static int pageCount(int rowCount, int page) {

		// 페이지 개수 계산
		int pageCount = rowCount / page;

		// 나머지 글에 대한 처리
		if (rowCount % page > 0)
			pageCount++;

		return pageCount;
	}

	// 총 블럭 개수(블럭 당 페이지 개수, 총 페이지 개수)
	public static int blockTotal(int blockToPage, int pageCount) {

		// 블럭 = 총 페이지 / 블럭 당 페이지
		int blockTotal = pageCount / blockToPage;

		// 남는 페이지에 대한 처리
		if (pageCount % blockToPage != 0)
			blockTotal++;

		return blockTotal;
	}

	private static int pg; // 페이지 번호
	private static int block; // 블록 번호
	private static int rowCount; // 총 글 수
	private static int pageSize; // 페이지당 글 갯수

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
