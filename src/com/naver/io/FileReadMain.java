package com.naver.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReadMain {
		
	public static void main(String[] args) {
			
		File file =new File("C:\\Taehyun\\sub1\\sub2\\msg.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br= new BufferedReader(fr);
			while (true) {
			String a =br.readLine();
			if(a==null) {
				break;
			}
			System.out.println(a);
			
			}
		} catch (Exception e) {
		
			e.printStackTrace();
		
		
		}
			
}
}
