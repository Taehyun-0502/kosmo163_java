package com.naver.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Marine m3 = new Marine();
		m1.name ="1호";
		m2.name = "2호";
		m3.name = "3호";
		m1.hp = 100;
		m2.hp = 100;
		m3.hp = 100;
		m1.str=20;
		m2.str=20;
		m3.str=20;
		m1.mp=5;
		m2.mp=5;
		m3.mp=5;
		System.out.println(m1.hp);
		
		System.out.println("1.공격 2.이동");
		int a= sc.nextInt();
		if(a==1) {m1.attck();}
		else if (a==2) {m2.run();}
	
		
		
		

	}

}
