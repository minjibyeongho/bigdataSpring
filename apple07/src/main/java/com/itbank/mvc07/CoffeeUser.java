package com.itbank.mvc07;

public class CoffeeUser {

	public static void main(String[] args) {
		// 추상클래스는 업캐스팅의 대상이 된다.
		// 인터페이스는 업캐스팅의 대상이 된다.
		// 추상클래스와 인터페이스는 타입으로 쓸 수 있다.
		// 의존성(결합도)를 낮추기 위해
		// 형변환 사용
		
//		ShopCoffee shop = new ShopCoffee();	//추상클래스는 객체 생성이 안되기에 에러가 생성됨!
		ShopCoffee shop = new ChainShopCoffee();	//추상클래스를 일반 클래스로 바꿔줌
//		Coffee shop = new ChainShopCoffee();	// upupcasting도 가능하다 하지만 Coffee Interface는 prepare() 메소드를 가지고 있지 않다.

		
		shop.make();
		shop.pay();
		shop.prepare();
		
		TruckCoffee truck = new TruckCoffee();
		
		truck.make();
		truck.pay();
		
	}
	
}
