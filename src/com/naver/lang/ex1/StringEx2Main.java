package com.naver.lang.ex1;

import java.util.Scanner;

public class StringEx2Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("파일명을 입력하세요");
		
		String fileName=sc.next();
		
		//파일명 -> 이름.확장자
		//이미지파일인지 체크, jpg, png, gif, jpeg
		// 이미지 파일입니다. 이미지 파일이 아닙니다. 
		boolean flag=true;
		
		int idx = fileName.lastIndexOf(".");
		System.out.println(idx);
		String name=fileName.substring(idx+1);
		System.out.println(name);
		
		
		if(name.equalsIgnoreCase("png")) {
			System.out.println("이미지다");
			
		}else if(name.equalsIgnoreCase("jpg")) {
			System.out.println("이미지다");
		}else if(name.equalsIgnoreCase("gif")) {
			System.out.println("이미지다");
		}else if(name.equalsIgnoreCase("jpeg")) {
			System.out.println("이미지다");
		} else {System.out.println("이미지가 아니다");
		}
		
		
		
		String[] files = {"jpg","gif","jpeg","png"};
		String result = "이미지 파일이 아니다";
		for(int i=0;i<files.length;i++) {
			if(name.equalsIgnoreCase(files[i])) {
				result = "이미지 파일 입니다";
				break;
			}
			
			
		}System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
