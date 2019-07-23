package com.itbank.mvc11;

import org.springframework.stereotype.Component;

@Component("a")		//alias 가능("a")
public class ASite {

	public void personalInfo() {
		System.out.println("개인 정보 보기.");
	}
	
}
