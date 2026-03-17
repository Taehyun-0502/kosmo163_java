package com.naver.lang;

public class StringMain3 {

	public static void main(String[] args) {
		String n1 ="abc";
		String n2 ="abc";
		String n3 =new String("abc");
		String n4 = new String("abc");
		System.out.println(n1);
		System.out.println(n3);
		System.out.println(n1==n2);
		System.out.println(n3==n4);
		System.out.println(n1==n3);
		
		n3=n3+" : "+n4;
		
		n3.trim();
		
		StringBuffer sb = new StringBuffer();
		sb.append("1");
		sb.append(2);
		
		System.out.println(sb);
		
		
		
		
	}

}
