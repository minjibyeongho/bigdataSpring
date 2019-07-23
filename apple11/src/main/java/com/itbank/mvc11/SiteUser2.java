package com.itbank.mvc11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SiteUser2 {

	public static void main(String[] args) {
		GenericXmlApplicationContext factory 
		= new GenericXmlApplicationContext("aopContext.xml");
		// ApplicationContext은 interface로 upcasting 시켜놓았는데 close 메소드가 없어서 위와 같이 정의함.
		/*ApplicationContext factory 
			= new GenericXmlApplicationContext("aopContext.xml");*/	//aopContext.xml에서 만든 설정 값을들 가져옴
		System.out.println("-------------BSiteImp");
		BInterface b2 = (BInterface)factory.getBean("b2");
		b2.productFind("지우개", 1000);
		b2.productOrder();
		b2.basket();
		
		factory.close();
	}
}
