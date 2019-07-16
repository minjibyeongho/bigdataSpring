package com.itbank.mvc09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CarUser {

	public static void main(String[] args) {
		
		ApplicationContext factory = new GenericXmlApplicationContext("context.xml");	// src/main/resources가 default 경로로 잡혀 있음
		
		Car car = (Car)factory.getBean("car");
		
		car.open();
		car.close();
		
		System.out.println("=========================================");
		
		Car car1 = (Car)factory.getBean("car1");
		car1.open();
		car1.close();
		
		
	}
}
