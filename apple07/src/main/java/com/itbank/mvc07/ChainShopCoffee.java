package com.itbank.mvc07;

public class ChainShopCoffee extends ShopCoffee {

	@Override
	public void prepare() {
		System.out.println("체인 본점에서 물건을 가져다 준다!");
	}

	// 일반메소드인 make(), pay()는 자동으로 뜨지 않는다!!
	
}
