package com.naver.io.ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriltemain {

	public static void main(String[] args) {
		//키보드로 부터 입력 받은 메세지를 
		//sub2//msg.txt 파일에 저장
		//입력시 exit를 입력하면 종료
		Scanner sc= new Scanner(System.in);
		File file = new File("C:\\Taehyun\\sub1\\sub2\\msg.txt");
		
		boolean flag =true;
		
		while(flag) {
			System.out.println("이름을 입력하세요");
			String str = sc.next();
			
			if(str.equals("exit")) {
				break;
			}
			try {
				FileWriter fw = new FileWriter(file,true);
				
				fw.write(str+"\n");
				fw.flush();
				
			
			}
			 catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		

	}

}
