package com.itbank.mvc88;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BbsUser {

	public static void main(String[] args) {
		
		ApplicationContext factory = new GenericXmlApplicationContext("context.xml");	// src/main/resources가 default 경로로 잡혀 있음
		
		BbsDAO dao = (BbsDAO)factory.getBean("bbsDAO");
		BbsDTO bbsDTO = new BbsDTO();
		
		bbsDTO.setId("dog");
		bbsDTO.setTitle("dog");
		bbsDTO.setContent("dog");
		bbsDTO.setWriter("dog");
		
		dao.insert(bbsDTO);
		
		
	}
}
