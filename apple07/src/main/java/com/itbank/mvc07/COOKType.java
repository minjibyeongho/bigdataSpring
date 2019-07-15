package com.itbank.mvc07;

public abstract class COOKType implements COOK {

	public abstract void supplyElements();
	
	@Override
	public void cooking() {
		System.out.println("요리를 하다");
	}

	@Override
	public void sellFood() {
		System.out.println("손님에게 음식을 팔다");
	}

	@Override
	public void prepare() {
		System.out.println("재료를 손질하다");
	}

	
	
}
