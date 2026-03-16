package com.naver.study.rpg.unit;

import com.naver.study.rpg.weapon.Staff;

public class Mage extends Character {
	
	
	Staff staff;
	public Mage() {
		super();
		
	}
	public void attack() {
		System.out.println("마법 공격");
	}
	public void info() {
		super.info();
		System.out.println(this.staff);
		
		
		
	}
	
	
	public void a() {
		System.out.println(this.name);
	}

	
}
