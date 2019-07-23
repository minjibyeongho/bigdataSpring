package com.itbank.flower;

import org.springframework.stereotype.Component;

@Component("f")
public class Flower implements FlowerInterface {

	@Override
	public void member(String name) {
		System.out.println(name+"님 회원가입을 환영합니다.");
	}

	@Override
	public void buy(String name, int price) {
		System.out.println(name+"님의 구매금액은 "+price+"원 입니다.");
	}

	@Override
	public void iDonknow() {
		System.out.println("에러에러!");
		int[] a = {1,2};
		a[4] = 4;
	}

	@Override
	public void welcome() {
		System.out.println("환영인사");
	}

	@Override
	public void explorer() {
		System.out.println("탐색탐색");
	}

	
}
