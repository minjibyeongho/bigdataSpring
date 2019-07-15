package com.itbank.mvc08;

public class CookManager {
	ICook i = null;
	
	public CookManager(){
		
	}
	
	public CookManager(ICook icook){
		i = icook;
	}
	
	void orderRice(){
		i.makeRice();
	}
	

	void orderSoup(){
		i.makeSoup();
	}
	
	
}
