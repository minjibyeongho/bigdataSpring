package com.itbank.mvc09;

public class GeneralDoor implements Door {

	@Override
	public void doorOpen() {
		System.out.println("일반문 열려요");
	}

	@Override
	public void doorClose() {
		System.out.println("일반문 닫혀요");
	}

}
