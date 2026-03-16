package com.naver.study.rpg.unit;


//추상 클래스라고 부른다 : 객체로 만들 수 없는 클래스 
public abstract class Character {
	String name;
	int hp;
	int mp;
	int damage;
	int gold=0;
	int level;
	
	//추상 메서드 : 자식 클래스에서 반드시 구현해야 하는 메서드
	public abstract void attack();
	
	public void info() {
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.damage);
		System.out.println("hp : " + hp);
	}
	
	
}
