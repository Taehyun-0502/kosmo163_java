package com.naver.car;

public class Car {

String company="kia";
String model;
int price;
boolean manual; //true 수동, false 자동
//이것이 인스턴스 초기화 블럭
{
	System.out.println("인스턴스블럭 : "+this.company);
	this.company="현대자동차";
	}
//생성자
	
public Car() {
	this("그랜져");
    
}
public Car(String model) {
	System.out.println("생성자 : "+this.company);
	this.company="르노 자동차";
	this.model=model;
	this.price=50000000;
	this.manual=false;
	
}

public Car(String model, int price) {
	this(model, price, false);

}

public Car(String model, int price, boolean manual) {
	this.company = "현대자동차";
	this.model = model;
	this.price = price;
	this.manual = manual;

}

public void info() {
	
	System.out.println("제조사 : "+this.company);
	System.out.println("모델명 : "+this.model);
	System.out.println("가격 : "+this.price);
	System.out.println("수동여부 : "+this.manual);
}
	
	
}
