package com.naver.utill.ex1;

import java.util.ArrayList;

public class StudentView {

	public void view(ArrayList <StudentDTO> list ) {
		for(int i=0; i<list.size();i++) {
			this.view(list.get(i));
				
		}	
	}
	
	public void view(StudentDTO dto) {
		
		
		System.out.println("=====================");
		System.out.println(dto.getName());
		System.out.println(dto.getKor());
		System.out.println(dto.getEng());
		System.out.println(dto.getMath());
		
		
	}
	
	
}
