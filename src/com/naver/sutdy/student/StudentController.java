package com.naver.sutdy.student;

import java.util.Scanner;

public class StudentController {

	
	public void start(Student sat,StudenView v,StudentTestJumus t,StudentInput i) {
		Scanner sc=new Scanner(System.in);
		StudenView vi=v;
		StudentTestJumus tj= t;
		Student st=sat;
		StudentInput ip= i;
		boolean go=true;
		
		while(go){ 
			System.out.println("1.학생정보입력 2.학생정보출력 3.프로그램 종료");
			
			int a= sc.nextInt();
			if(a==1) { 
				ip.input(st);
				
			}else if(a==2) {
				tj.t(st);
				vi.view(st);
				System.out.println("\t");	
				
			}else if(a==3) {
				break;
			}
		
		
		}
		
		
		}
		
	}

