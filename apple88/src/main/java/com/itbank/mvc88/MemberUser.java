package com.itbank.mvc88;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberUser {

	public static void main(String[] args) {
		
		ApplicationContext factory = new GenericXmlApplicationContext("context.xml");	// src/main/resources가 default 경로로 잡혀 있음
		
		MemberDAO dao = (MemberDAO)factory.getBean("memberDAO");
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("mybatis");
		memberDTO.setPw("mybatis");
		memberDTO.setName("mybatis");
		memberDTO.setTel("mybatis");
		
		dao.insert(memberDTO);
		
		
	}
}
