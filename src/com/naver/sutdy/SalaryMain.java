package com.naver.sutdy;

import java.util.Scanner;

public class SalaryMain {
	public static void main(String[] args) {
		// 멤버를 사용하려면 객체를 먼저 생성 해야한다.
		// 변수 선언 객체 생성
		//클래스는 데이터타입
		Scanner sc= new Scanner(System.in);
		
		Salary sal= new Salary();
		System.out.println("급여를 입력하세요");
		int s = sc.nextInt();
		
		sal.make(s,true);
		
		System.out.println("세전 급여 : "+ s);
		
		int[]num = {1,2,3};
		
		sal.test(num);
		
		System.out.println(num[0]);
		
		//멤버 사용
		//멤버 변수 사용
		//참조변수명.멤버 변수명
		//멤버메서드 사용법
		//참조변수명.멤버메소드명()
	
		
	}

}

