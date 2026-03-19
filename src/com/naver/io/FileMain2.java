package com.naver.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMain2 {

	public static void main(String[] args) {
		String name = "suji";
		File file = new File("C:\\Taehyun\\sub1\\sub2\\info.txt");
		System.out.println(file.exists());
		try {
			FileWriter filewriter = new FileWriter(file,true);
			filewriter.write(name+"\n");
			filewriter.flush();// buffer를 강제로 비우기 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("종료");
		
	}

}
