package com.itbank.mvc08;

public class KoreanCook implements ICook {

	@Override
	public void makeRice() {
		System.out.println("한국 밥을 만들자");
	}

	@Override
	public void makeSoup() {
		System.out.println("한국 수프 만들기");
	}

	@Override
	public void makeSalad() {
		System.out.println("한국 샐러드를 만들자");
	}

	@Override
	public void makeSource() {
		System.out.println("한국 소스를 만들자");
	}

}
