package com.itbank.mvc11;

import org.springframework.stereotype.Component;

@Component("b")
public class BSite {

	public void productSearch() {
		System.out.println("물건 검색");
	}
	
	public void productBasket() {
		System.out.println("장바구니");
	}
	
	public void productOrder() {
		System.out.println("주문");
	}
	
}
