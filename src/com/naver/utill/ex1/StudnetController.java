package com.naver.utill.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudnetController {
	
	public StudnetController() {}
		
	
	public void start() {
		Scanner sc=new Scanner(System.in);
		boolean flag =true;
		StudentService sv=new StudentService();
		ArrayList<StudentDTO> ar = null;
		StudentView si = new StudentView();
		while(flag) {
		System.out.println("1.학생정보 초기화 2. 학생정보 출력 3.학생정보 검색 4.학생정보 추가 5.학생 정보 삭제6.학생 정보를 백업 7.종료");
		int i =sc.nextInt();
		
		if(i==1) {
			
			ar=sv.initold();
		}else if(i==2) {
			
			si.view(ar);
			
		}else if(i==3) {
			
			StudentDTO dto =sv.search(sc, ar);
			if(dto!=null) {
				si.view(dto);
			}
			
		}else if(i==4) {
			sv.add(sc, ar);
		
		}else if(i==5) {
			sv.delete(sc, ar);
		}else if(i==6) {
			sv.backup(ar);
			
		}
		
		
		
		else if(i==7) {
			System.out.println("찾는 학생이 없다");
			flag=false;
			break;
			
		}
		}
		
		
	}
	
	
	
	
}
