package com.naver.lang.ex2;

public class WeatherMaker {

	
	private String info;
	
	public WeatherMaker() {
		this.info = "서울-12-25.2-대전-3-65.2-대구-56-85.9";
		
		
	}
	public WeatherDTO[] init() {
		//info에 데이터를 파싱해서 결과물을 리턴해준다.
		String [] ar=this.info.split("-");
		WeatherDTO [] weathers=new WeatherDTO[6];		
		
		for(int i=0;i<ar.length;i++) {
			
			
			weathers[i] =new WeatherDTO();
			weathers[i].setCityName(ar[i]);
					
			
		}
		return weathers;
		
		
		
	}
	
}
