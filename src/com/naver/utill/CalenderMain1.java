package com.naver.utill;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalenderMain1 {

	public static void main(String[] args) {
		
		
		Calendar calendar =Calendar.getInstance();
//		calendar.set(Calendar.YEAR, 2030);
//		calendar.set(Calendar.MARCH, 3);
		Calendar out = Calendar.getInstance();
		out.set(Calendar.HOUR, 11);
		
		
		Date date = calendar.getTime();
		
		System.out.println(date);
		
		
		int h=calendar.get(Calendar.HOUR_OF_DAY);
		int s=calendar.get(Calendar.SECOND);
		int year=calendar.get(Calendar.YEAR);
		int m =calendar.get(Calendar.MARCH);
		System.out.println(h);
		System.out.println(s);
		System.out.println(year);
		System.out.println(m);
		
		//들어간 시간 
		long in =calendar.getTimeInMillis();
		long ou = out.getTimeInMillis();
		long result = ou-in;
		result= result/1000;
		System.out.println(result);
		result= result/60;
		System.out.println(result);
		result= result/60;
		System.out.println(result);
		
	}

}
