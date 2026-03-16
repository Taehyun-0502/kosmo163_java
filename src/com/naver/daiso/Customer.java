package com.naver.daiso;

public class Customer {

		int don;
		int point;
		
		public void buy(Item [] item) {
			
			for(int i=0;i<item.length;i++) {
				this.don=this.don - item[i].price;
				this.point=this.point + item[i].point;
			}
		 System.out.println("잔액"+this.don);
		 System.out.println("포인트"+this.point);
			
		}
		
		
		
		public void buy(Item item) {
			//가진 돈에서 제품가격 빼고
			//자기가 가진 포이튼에서 제품의 포인트를 더한다.
		this.don =this.don -item.price;
		this.point=this.point + item.point;
			System.out.println("잔액"+this.don);
			System.out.println("포인트"+this.point);
			//구매후 남은돈과 포인트 출력
		}
		
		
		
		
		
}
