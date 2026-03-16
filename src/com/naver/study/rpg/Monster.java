package com.naver.study.rpg;

import com.naver.study.rpg.weapon.Staff;

public class Monster {
	
	
	String name;
	int hp;
	int damage;
	int exp;
	Staff staff;
	int gold=20;
    
	public Monster() {
		System.out.println("몬스터가 생성되었습니다.");
		this.name="슬라임";
		
	}
		
	public int check() {
		if(this.hp<=0) {
			System.out.println("꾸어억");
		
			return gold;
		}
		return 0;
		
	}
	public void t() {
		
		return;
	}
	
	
	
}
