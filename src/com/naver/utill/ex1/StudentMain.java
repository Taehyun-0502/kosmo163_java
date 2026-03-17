package com.naver.utill.ex1;

public class StudentMain {

	public static void main(String[] args) {
		StudentService sv=new StudentService();
		StudentView s = new StudentView();
		StudentDTO[]ar = sv.init();
		StudnetController sta = new StudnetController();
		sta.start();
		//s.view(ar);
		
		
	}

}
