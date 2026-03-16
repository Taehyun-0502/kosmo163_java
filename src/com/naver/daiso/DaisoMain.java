package com.naver.daiso;

public class DaisoMain {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		Mouse mouse = new Mouse();
		Keyboard keyboard = new Keyboard();
		Laptop laptop = new Laptop();
		
		Customer customer = new Customer();
		
		customer.don=100000000;
		customer.point=100;
		
		Item [] items = {tv,mouse,keyboard,laptop};
		
		customer.buy(items);
		
		
		
		
		
	}

}
