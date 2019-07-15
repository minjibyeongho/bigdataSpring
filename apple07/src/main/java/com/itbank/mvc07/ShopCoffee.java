package com.itbank.mvc07;

public abstract class ShopCoffee implements Coffee {
	// 상위에 abstract class(추상 클래스)임을 같이 선언해주어야 한다.
	// 추상클래스는 interface와 달리 변수를 선언할 수 있다.
	// 객체 생성은 인터페이스나 추상클래스나 둘다 객체 생성이 불가능하다
	
	public abstract void prepare();	//어떻게 해야할지 모르기때문에 비워둠(상속 받은 곳에서 구현하게끔, abstract(추상)키워드를 붙여줌)
	// 추상 메소드가 1개라도 이상 들어가면 이 클래스는 추상클래스가 됨.
	
	//하위 것 처럼 할 수도 있지 않나? 강제성이 없음..(오버라이드 안하면 그만..)
//	public void prepare(){
//		
//	};
	
	@Override
	public void make() {
		System.out.println("가게에서 커피를 만들다");
	}

	@Override
	public void pay() {
		System.out.println("가게에서 post기로 계산하다");
	}


}
