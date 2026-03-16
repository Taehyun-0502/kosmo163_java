package com.naver.sutdy;

public class Salary {
    public void test(int [] num) {
    	num = new int[2];
    	num[0]=9;
    	System.out.println(num[0]);
    	
    }
	
	//급여계산
	//건강 0.03, 고용0.02 , 국민0.01 , 산재0.01 
	//make 
	//0.033
	
	public void  make(int s,boolean check) {
	 System.out.println("급여 계산");
	 
	 if(check) {
	 double t1=s*0.03;
	 double t2=s*0.02;
	 double t3=s*0.01;
	 double t4=s*0.01;
	 double result= s-t1-t2-t3-t4;
	 System.out.println("실 급여 : "+result);
	 }else  {double result=s-s*0.033;
	 System.out.println("실 급여 : "+result);
	 }
	 
	 s=0;
	 	
	
	 
	 
	 
	 
	 
	}
	
	
	
}
