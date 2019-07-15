package com.itbank.mvc07;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvUser4 {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("context.xml");
		// ctrl + shift + o : 자동 import
		
		//TvUser3에서의 BeanFactory와 같은 방식으로 만들어지지만 Xml을 통해서 만든 것 / spring에서 만들어준 것과 사용자가 만든 것의 차이
		Tv tv = (Tv)factory.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumnDown();
	}

}
