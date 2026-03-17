package com.naver.utill.ex1;

import java.util.Scanner;

public class StudnetController {
	
	public StudnetController() {}
		
	
	public void start() {
		Scanner sc=new Scanner(System.in);
		boolean flag =true;
		StudentService sv=new StudentService();
		StudentDTO [] ar = null;
		StudentView si = new StudentView();
		while(flag) {
		System.out.println("1.학생정보 초기화 2. 학생정보 출력 3.학생정보 검색 4.종료");
		int i =sc.nextInt();
		
		if(i==1) {
			
			sv.init();
		}else if(i==2) {
			si.view(ar);
			
		}else if(i==3) {
			flag=false;
			break;
			
		}
		}
		
		
	}
	
	
	
	
}
