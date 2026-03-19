package com.naver.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IoMain1 {

	public static void main(String[] args) {
			
		InputStream is=System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br= new BufferedReader(ir);
		System.out.println("입력");
		String str;
		try {
			str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
