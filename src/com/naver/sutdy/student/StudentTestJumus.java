package com.naver.sutdy.student;

public class StudentTestJumus {

	//학생의 점수를 받아 총점/ 평균을 구하는
	public void t(Student st) {
		st.total = st.kor + st.eng + st.math;
		st.avg = st.total/3.0;
		
		
		
	}
	public void t2(Student st) {
		st= new Student();
		st.total=90;
		st.avg=30.0;
	}
	
	
	
	
}
