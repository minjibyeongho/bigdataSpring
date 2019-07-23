package com.itbank.mvc11;

import org.springframework.stereotype.Component;

//@Component("e")	//alias 가능("c")	aopcontext.xml에서 <bean>으로 지정
public class CSite {

	public void orderInfo() {
		System.out.println("주문정보보기");
	}
	
	public void orderCheck() {
		System.out.println("확인");
	}
}
