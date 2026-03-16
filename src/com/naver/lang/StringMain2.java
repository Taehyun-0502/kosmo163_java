package com.naver.lang;

public class StringMain2 {

	public static void main(String[] args) {
		String str="Hello World";
		char ch = str.charAt(0);
		
		int idx = str.indexOf("d");
		System.out.println(idx);
		idx=str.lastIndexOf("l");
		System.out.println(idx);
		
		//ㅣ이 총 몇개인지 구하자.
		
		int count =0;
		boolean flag=true;
		int index = -1;
		
		while(flag) {
			index = str.indexOf("l",index+1);
			if(index != -1) {
				count++;
			}else {
				flag=false;
				break;
			}
			
		}
		System.out.println(count);
		
		
		
		
		
	}

}
