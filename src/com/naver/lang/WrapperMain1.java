package com.naver.lang;

public class WrapperMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n ="123";
		Integer integer = new Integer(n);
		integer = Integer.valueOf(n);
		Long l = Long.valueOf(n);
		
		System.out.println(integer+1);
		
		int num =3;
		integer = num;
		
		Integer.parseInt("123");
		
		
		
	}

}
