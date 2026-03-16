package com.naver.study.rpg.unit;

import com.naver.study.rpg.weapon.Action;

public class CharacterMain {

	public static void main(String[] args) {
		Mage m1= new Mage();
		m1.name="메이지1";
		Warrior w1= new Warrior();
		
		//다형성
		
		
		Character [] mages= new Character[3];
		
		
		Character c1= w1;
		System.out.println(c1.name);
		Warrior w2= (Warrior)c1;
		
		System.out.println(w1.weapon);
		Action a1= w1.weapon;
		
		
	}

}
