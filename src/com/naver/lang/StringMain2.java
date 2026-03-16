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
		
		String st= "한화,기아,삼성,롯데,키움,ssg,두산,LG,nc,kt";
		String[] temas = st.split(",");
		for(int i=0;i<temas.length;i++) {
			System.out.println(temas[i]);
		}
	System.out.println(temas[1].trim().equals("기아"));
		
		
	}

}
