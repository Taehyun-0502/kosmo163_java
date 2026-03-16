package com.naver.sutdy.student;

public class StudenView {

	
	//view
	//학생의 정보를 출력
	//이름, 국어, 영어, 수학, 총점, 평균
	
	
	public void view(Student t) {
		
		
		
	System.out.println
	("이름\t국어\t영어\t수학\t총점\t평균");
	System.out.print(t.name+"\t");
	System.out.print(t.kor+"\t");
	System.out.print(t.eng+"\t");	
	System.out.print(t.math+"\t");
	System.out.print(t.total+"\t");
	System.out.print(t.avg);
	
	}
}
