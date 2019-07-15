package com.itbank.mvc07;

public class BananaTv implements Tv {

	@Override
	public void powerOn() {
		System.out.println("바나나TV On");
	}
	
	@Override
	public void powerOff() {
		System.out.println("바나나TV Off");
	}

	@Override
	public void volumeUp() {
		System.out.println("바나나TV Volume up");
	}

	@Override
	public void volumnDown() {
		System.out.println("바나나TV Volume Down");
	}

}
