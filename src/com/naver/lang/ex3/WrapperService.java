package com.naver.lang.ex3;

import java.util.Scanner;

public class WrapperService {
	
	public void juminCheck2(Scanner sc) {
		System.out.println("주민번호 입력 : xxxxxx-xxxxxxx");
		String  data= sc.next();
		
		for(int i=0; i<data.length()-1;i++) {
			char ch = data.charAt(i);
			Integer.parseInt(String.valueOf(ch));	
		}
	}
	
	
	
	public void juminCheck(Scanner sc) {
		System.out.println("주민번호 입력 : xxxxxx-xxxxxxx");
		String  data= sc.next();
		int num=2;
		int sum=0;
		
		for(int i=0;i<data.length()-1;i++) {
			if(i==6) {
				continue;
			}
		String s =  data.substring(i, i+1);
		int c=Integer.parseInt(s);
			sum= sum+c*num;
			num++;if(num==10) {
				num=2;
			}
		}
		System.out.println(sum);
		sum=sum%11;
		sum=11-sum;
		if(sum>9) {
			sum=sum%10;
		}
		int check = Integer.parseInt( data.substring(data.length()-1)); 
		
		if(sum==check) {
		System.out.println("맞는 번호");
		}
	}
	
	

	public void ageCount2(Scanner sc) {
		System.out.println("주민번호 입력 : xxxxxx-xxxxxxx");
		String data= sc.next();
		String  st = data.substring(7, 8);
		String str = data.substring(0,2);
		int year = 2026;
		int s = Integer.parseInt(st);
		int sr = Integer.parseInt(str);
		if(s<3) {
			sr=sr+1900;
		}else if(s>2) {
			sr=sr+2000;
		}
		year=year-sr;
		System.out.println(year);
	}
	
	
	
	public void ageCount(Scanner sc) {
		
		System.out.println("생년월일을 입력 : xxxx-xx-xx");
		String data= sc.next();
		String r = data.substring(0, 4);

		System.out.println(data);
		System.out.println(r);
		//String [] ar =data.split("-");
		//System.out.println(ar[0]);		
		int year = 2026;
		
		int y = Integer.parseInt(r);
		year=year-y;
		System.out.println(year);
		
		
		
	}
}
