package com.itbank.flower;

import org.springframework.context.support.GenericXmlApplicationContext;

import sun.java2d.loops.GeneralRenderer;

public class flowerUser {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext factory
			= new GenericXmlApplicationContext("aopContext.xml");
		
		FlowerInterface f = (FlowerInterface)factory.getBean("f");
		f.welcome();
		f.member("JYP");
		f.buy("JYP",10000);
		f.explorer();
		f.iDonknow();
		
		
		
	}
}
