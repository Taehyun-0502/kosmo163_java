package com.naver.db;

public class MemberMain {

	public static void main(String[] args) {
		String name="홍길동";
		String id="hong";
		String pw="1234";
		Member m= new Member();
		m.name="홍길동";
		m.id="hong";
		m.pw="1234";
		
			
			MemberDAO dao=new MemberDAO();
		 dao.addMember(new Member());
		
		
		
	}
}
