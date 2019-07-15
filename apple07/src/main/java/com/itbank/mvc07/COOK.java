package com.itbank.mvc07;

public interface COOK {

	// 음식점마다 종류가 다름
	// 체인점과 푸드트럭으로 나눠서 설계
	
	void cooking();
	
	void sellFood();
	
	void prepare();
	
}
