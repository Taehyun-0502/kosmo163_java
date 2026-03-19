package com.naver.utill.ex1;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		StudentService sv=new StudentService();
		StudentView s = new StudentView();
		ArrayList<StudentDTO> ar = sv.initold();
		StudnetController sta = new StudnetController();
		sta.start();
		//s.view(ar);
		
		
	}

}
