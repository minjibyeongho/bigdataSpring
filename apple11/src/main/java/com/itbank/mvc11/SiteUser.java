package com.itbank.mvc11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SiteUser {

	public static void main(String[] args) {
		ApplicationContext factory 
			= new GenericXmlApplicationContext("aopContext.xml");	//aopContext.xml에서 만든 설정 값을들 가져옴
		System.out.println("-------------ASite");
		ASite a = (ASite)factory.getBean("a");	//Asite.java의 alias를 가져오는 역할
		a.personalInfo();
		System.out.println();
		
		System.out.println("-------------CSite");
		CSite c = (CSite)factory.getBean("c");
		c.orderInfo();
		c.orderCheck();
		
		System.out.println();
		System.out.println("-------------BSite");
		BSite b = (BSite)factory.getBean("b");
		b.productSearch();
		b.productBasket();
		b.productOrder();
		
	}
}
