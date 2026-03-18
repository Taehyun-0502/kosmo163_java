package com.naver.utill;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		HashMap<String, Integer> map= new HashMap<>();
		map.put("sth", 502);
		map.put("a2", 7);
		
		
		
		System.out.println(map.get("sth"));
		System.out.println(map.size());
		
		//반복문은로 돌릴 경우 
	   Set<String> set= map.keySet();
	           Iterator<String>it =set.iterator();
		while(it.hasNext()) {
			String k = it.next();
			System.out.println("Key : " +k);
			System.out.println(map.get(k));
		}
		
		

	}

}
