package com.naver.utill.ex2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		
		Random random = new Random();
		HashSet<Integer> rottoo =new HashSet<>();
		
		
		
		boolean flag =true;
		while(flag) {
			int n = random.nextInt(45)+1;
			rottoo.add(n);
			if(rottoo.size()==6) {
				break;
				
			}

		}
		Iterator<Integer> it = rottoo.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		System.out.println(rottoo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
