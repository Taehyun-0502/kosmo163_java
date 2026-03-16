package com.naver.sutdy.student;

import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		
//		TestJumus tj = new TestJumus();
//		StudenView sv= new StudenView();
//		Student st = new Student();
//		// 메서드를 호출
//		StudentInput si= new StudentInput();
//		si.input(st);
//		
//		
//		tj.t(st);
//		
//		sv.view(st);
		StudentController sta=new StudentController();
		StudenView v=new StudenView();
		Student st=new Student();
		StudentTestJumus tj=new StudentTestJumus();
		StudentInput i=new StudentInput();
		sta.start(st, v,tj,i);
		
		
		
		
		
		
		
		
		
	}
}
