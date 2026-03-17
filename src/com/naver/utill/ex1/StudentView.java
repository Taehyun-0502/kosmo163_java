package com.naver.utill.ex1;

public class StudentView {

	public void view(StudentDTO [] ar) {
		for(int i=0; i<ar.length;i++) {
			this.view(ar[i]);
				
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
