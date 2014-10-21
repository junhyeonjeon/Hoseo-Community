package com.hoseo.board.util;

import java.io.File;

public class FileUtil {
	public static String getFileName(String path, String filename){
		
				File f = new File(path);
				if(!f.exists())
					f.mkdir(); //디렉토리 만들기
				
				// 파일명과 확장자 분리하기
				int pos = filename.lastIndexOf('.');
				String fname = filename.substring(0, pos);
				String ext = filename.substring(pos+1, filename.length());
				
				System.out.println("파일명 : " + fname);
				System.out.println("확장자 : " + ext);
				
				// 이미 존재하는 파일 이름이면 파일명뒤에 (1) 이런식으로 이름을 붙이고 저장한다.
				String returnName = fname + "." + ext;
				String temp = path + "/" + returnName;
				
				f = new File(temp);
				int k=1;
				while(f.exists())
				{
					returnName = fname + "(" + k + ")." + ext;
					temp = path + "/" + returnName;
					f = new File(temp);
					k++;
				}
				
				return returnName;
	}
}
