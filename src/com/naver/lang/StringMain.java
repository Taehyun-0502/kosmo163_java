package com.naver.lang;

import java.util.Scanner;

public class StringMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		String a=new String("winter");
		Object obj=new Object();
		String s1=obj.toString();
		
		
		
		
		a.charAt(3);
		char ch = a.charAt(3);
		String s2= a.toString();
		
		System.out.println(obj);
		
		System.out.println(a.charAt(3));
		System.out.println(s2);
		System.out.println(a);
		
		String s3=sc.toString();
		System.out.println(s3);
		
		Object obj2=new Object();
		boolean c = obj2.equals(obj);
		System.out.println(c);
		String name2="winter";
		c = a.equals(name2);
		System.out.println(c);
		name2=" Winter";
		c =a.equals(name2);
		System.out.println(c);
		c=a.equalsIgnoreCase(name2);
		System.out.println(c);
		
		
		
		
		
		
	}

}
