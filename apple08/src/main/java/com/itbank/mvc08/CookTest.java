package com.itbank.mvc08;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CookTest {
	
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("context.xml");
		
		ICook cc = (ICook)factory.getBean("ccook");
		
		cc.makeRice();
		cc.makeSoup();
		cc.makeSalad();
		cc.makeSource();
		
		ICook kc = (ICook)factory.getBean("kcook");
		
		CookManager man = new CookManager(kc);
		man.orderRice();
		man.orderSoup();
		
	}
}
