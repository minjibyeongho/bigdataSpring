package com.itbank.mvc09;

public class SportCar implements Car {

	Window window;
	String color;
	int speed;
	
	//생성자들
	public SportCar(Window window, String color, int speed) {
		this.window = window;
		this.color = color;
		this.speed = speed;
		// 순차적으로 .xml constructor-arg에 넣어주어야한다
	}

	public SportCar() {	//기본생성자
		//window = new StrongWindow();	//객체를 새로 생성한 prototype 형태
		
	}
	
	// window를 넣을 수 있는 방법 2가지 : 생성자 이용, setter 메소드 이용
	// xml방법부터
	
	public SportCar(Window window) {	//파라미터 있는 생성자
		this.window = window;
	}
	
	// setter 메소드 사용시 color, speed는 setter가 필요하다
	public void setColor(String color) {
		this.color = color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setWindow(Window window){	//setter 메소드
		System.out.println("setter 메소드 호출!");
		this.window = window;
	}
	
	@Override
	public void open() {
		//System.out.println("스포츠카를 열어요");
		window.open();
		System.out.println("차 색은 : "+color);
		System.out.println("차 속도는 : "+speed);
	}

	@Override
	public void close() {
		//System.out.println("스포츠카를 닫아요");
		window.close();
	}

	@Override
	public void operate() {
		//System.out.println("스포츠카를 작동시켜요");
	}

}
