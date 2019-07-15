package com.itbank.mvc08;

public class ChineseCook implements ICook {

	@Override
	public void makeRice() {
		System.out.println("중국 밥 만들자");
	}

	@Override
	public void makeSoup() {
		System.out.println("중국 수프를 만들자");
	}

	@Override
	public void makeSalad() {
		System.out.println("중국 샐러드를 만들자");
	}

	@Override
	public void makeSource() {
		System.out.println("중국소스를 만들자");
	}

}
