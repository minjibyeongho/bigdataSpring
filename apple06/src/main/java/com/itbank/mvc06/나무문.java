package com.itbank.mvc06;

public class 나무문 implements Door {

	@Override
	public void open() {
		System.out.println("나무문 open");
	}

	@Override
	public void close() {
		System.out.println("나무문 Close");

	}

	@Override
	public void key() {
		System.out.println("나무문 key");

	}

	@Override
	public void made() {
		System.out.println("나무문 made");

	}

}
