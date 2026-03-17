package com.naver.utill.ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentService {
		
	
	private String data;
	
	
	public void search(Scanner sc,StudentDTO d) {
		Scanner sc1=new Scanner(System.in);
		int i=sc1.nextInt();
		String name=sc1.next();
		StudentDTO dto= new StudentDTO();
		
		
		
		if(i==3 &&name.equals(dto.getName()) ) {
			
			StudentView si= new StudentView();
			
			
			
		}
	}
	
	
	
	
	
	
	
	public StudentService() {
		this.data = "iu-50-68-90-winter-87-85-76-suji-87-67-95";
		
		
	}
	public StudentDTO [] init () {
		
		StringTokenizer st =new StringTokenizer(this.data,"-");
		StudentDTO [] ar = new StudentDTO[3];
		int index=0;
		while(st.hasMoreTokens()) {
			
			StudentDTO dto = new StudentDTO();
			String name = st.nextToken();
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());
			
			dto.setName(name);
			dto.setKor(kor);
			dto.setEng(eng);
			dto.setMath(math);
			
			ar[index]=dto;
			index++;
			
		} return ar;
		
		
		
	}
	
	
	
	
}
