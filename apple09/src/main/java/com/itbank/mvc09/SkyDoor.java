package com.itbank.mvc09;

public class SkyDoor implements Door {

	@Override
	public void doorOpen() {
		System.out.println("SkyDoor 열려요");
	}

	@Override
	public void doorClose() {
		System.out.println("SkyDoor 닫혀요");
	}

}
