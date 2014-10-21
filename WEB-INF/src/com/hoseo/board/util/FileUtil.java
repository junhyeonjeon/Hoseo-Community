package com.hoseo.board.util;

import java.io.File;

public class FileUtil {
	public static String getFileName(String path, String filename){
		
				File f = new File(path);
				if(!f.exists())
					f.mkdir(); //���丮 �����
				
				// ���ϸ�� Ȯ���� �и��ϱ�
				int pos = filename.lastIndexOf('.');
				String fname = filename.substring(0, pos);
				String ext = filename.substring(pos+1, filename.length());
				
				System.out.println("���ϸ� : " + fname);
				System.out.println("Ȯ���� : " + ext);
				
				// �̹� �����ϴ� ���� �̸��̸� ���ϸ�ڿ� (1) �̷������� �̸��� ���̰� �����Ѵ�.
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
