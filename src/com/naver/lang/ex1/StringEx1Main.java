package com.naver.lang.ex1;

public class StringEx1Main {

	public static void main(String[] args) {
		String str= "Hello World";
		str.length();
		int strl = str.length();
		
		System.out.println(strl);
		
		for(int i=0; i<str.length();i++) {
		char ch =str.charAt(i);
		System.out.println(ch);
		
		String s =String.valueOf(false);
		System.out.println(s);
		}
		
		
		
		
		
	}

}
