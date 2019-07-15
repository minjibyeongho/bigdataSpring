package com.itbank.mvc07;

public interface Coffee {

	// 강제성을 가지는 인터페이스!
	// 퍼블릭 앱스트릭이 기본값
	// 추상메소드를 통해서 만든다
	// 변수 정의 불가능, 객체 생성 불가능
	// 타입으로는 만들 수 있다(upcasting이 가능하다)
	// 기술면접 대비 인터페이스가 무엇인지, 어떤식의 한계점을 가지는지 정리가 필요!
	
	
	//만들다
	void make();
	
	//계산하다
	void pay();
	
	
	
}
