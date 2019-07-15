package com.itbank.mvc07;

public class CherryTv implements Tv {

	@Override
	public void powerOn() {
		System.out.println("체리TV On");
	}
	
	@Override
	public void powerOff() {
		System.out.println("체리TV Off");
	}

	@Override
	public void volumeUp() {
		System.out.println("체리TV Volume up");
	}

	@Override
	public void volumnDown() {
		System.out.println("체리TV Volume Down");
	}

}
