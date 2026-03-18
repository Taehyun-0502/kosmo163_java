package com.naver.utill.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentService {
		
	
	private String data;
	
	public StudentService() {
		this.data = "iu-50-68-90-winter-87-85-76-suji-87-67-95";
		
		
	}
	public ArrayList<StudentDTO> init () {
		
		StringTokenizer st =new StringTokenizer(this.data,"-");
		ArrayList <StudentDTO>list = new ArrayList<>();
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
			
			list.add(dto);
			
			
		} return list;
		
		
		
	}
	public StudentDTO search(Scanner sc,ArrayList<StudentDTO>list) {
		System.out.println("학생이름을 입력");
		String name =sc.next();
		
		
		for(int i =0; i<list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				return list.get(i);
				
			}
		}
			
		return null;	
			
		
	}
	public void add(Scanner sc,ArrayList<StudentDTO>list){
		StudentDTO dto=new StudentDTO();
		System.out.println("이릅을 입력하세오");
		String name =sc.next();
		System.out.println("국어을 입력하세오");
		int kor = sc.nextInt();
		System.out.println("영어을 입력하세오");
		int eng = sc.nextInt();
		System.out.println("수학을 입력하세오");
		int math = sc.nextInt();
	
		dto.setName(name);
		dto.setKor(kor);
		dto.setEng(eng);
		dto.setMath(math);
		list.add(dto);
		
	}
	//학생의 이름을 입력해서 일치하는 학생의 정보를 삭제 
	// 메서드 명은 delete 
	public void delete(Scanner sc,ArrayList<StudentDTO>ar) {
		System.out.println("정보를 삭제할 학생 이름을 입력하세요");
		String name = sc.next();
				
		for(int i=0; i<ar.size();i++) {
			String name2 =ar.get(i).getName();
			if(name.equals(name2)) {
				ar.remove(i);
			}else {
				break;
			} 
		}
		
		
			
		
	}
	
	
	
}
