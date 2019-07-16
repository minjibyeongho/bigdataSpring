package com.itbank.mvc09;

public class SuperCar implements Car {

	Window window1;
	Door door;
	String doorDurabilit;
	int doorPrice;

	// 생성자들
	public SuperCar() {	}

	public SuperCar(Window window1, Door door) {
		this.window1 = window1;
		this.door = door;
	}

	// 파라미터 있는 생성자
	public SuperCar(Window window1, Door door, String doorDurabilit, int doorPrice) {
		super();
		this.window1 = window1;
		this.door = door;
		this.doorDurabilit = doorDurabilit;
		this.doorPrice = doorPrice;
	}

	//setter 메소드
	public void setSuperCar(Window window1, Door door) {
		System.out.println("window set메소드 호출!");
		this.window1 = window1;
		this.door = door;
	}

	public void setWindow1(Window window1) {
		System.out.println("window set메소드 호출!");
		this.window1 = window1;
	}

	public void setDoorDurabilit(String doorDurabilit) {
		this.doorDurabilit = doorDurabilit;
	}

	public void setDoorPrice(int doorPrice) {
		this.doorPrice = doorPrice;
	}

	public void setDoor(Door door) {
		System.out.println("door set메소드 호출!");
		this.door = door;
	}

	@Override
	public void open() {
		// System.out.println("슈퍼카를 열어요");
		window1.open();
		door.doorOpen();
		System.out.println("문의 내구성 : " + doorDurabilit);
		System.out.println("문짝의 가격 : " + doorPrice);
	}

	@Override
	public void close() {
		// System.out.println("슈퍼카를 닫아요");
		window1.close();
		door.doorClose();
	}

	@Override
	public void operate() {
		// System.out.println("슈퍼카를 작동시켜요");
	}

}
