package com.naver.mod;

public class Phone {
	
	public static String company;
	String name;
	int price;
	static{
		
		Phone.company = "애플";
	}
	
	
	public void call() {
		System.out.println(Phone.company);
		System.out.println(this.name);
		Phone.info();
	}
	
	public static void info() {
	System.out.println(Phone.company);
	// 오류  System.out.println(this.name);
	
	}
	
	
}
