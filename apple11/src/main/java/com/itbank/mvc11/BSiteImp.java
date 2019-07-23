package com.itbank.mvc11;

import org.springframework.stereotype.Component;

@Component("b2")
public class BSiteImp implements BInterface {

	@Override
	public String productFind(String name, int price) {
		System.out.println(name + "물건 검색하다");
		System.out.println("가격은 "+price);
		return "검색 완료 ok";
	}

	//error 발생하는 경우
	@Override
	public void basket() {
		int[] num = {1,2};
		num[2] = 3;	//에러 발생
		System.out.println("장바구니에 넣다.");
	}

	@Override
	public void productOrder() {
		System.out.println("물건 주문하다");
	}

}
