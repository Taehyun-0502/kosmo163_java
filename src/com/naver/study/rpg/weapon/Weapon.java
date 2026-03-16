package com.naver.study.rpg.weapon;

public class Weapon implements Action {
	
	String name;
	int damage;
	int level;
	
	public void attack() {
        System.out.println("무기 공격");
    }
	
	
	
		
}
