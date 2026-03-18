package com.naver.utill;

import java.util.ArrayList;

public class ListMain1 {

	public static void main(String[] args) {
		//ArryList 객체 생성
		ArrayList list =new ArrayList();
		
		list.add(1);
		list.add("two");
		list.add(3);
		list.add(3);
		//list.remove(1);
		list.add(1, 0);
		list.set(0, 100);
		
		for(int i= 0; i<list.size();i++) {
		
		System.out.println(list.get(i));
		
		}
		list.clear();
		System.out.println(list.size());
		
		
		
	}

}
