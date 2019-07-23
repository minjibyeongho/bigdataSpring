package com.itbank.mvc11;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AspectClass {
	
	public void login() {
		System.out.println("로그인======================");
	}
	
	public void logout() {
		System.out.println("로그아웃======================");
	}
	
	public void login2() {
		System.out.println("보안이 강화된 로그인======================");
	}
	
	public void returnCall(JoinPoint jp, Object returnObj) {
		System.out.println("리턴 값이 있습니다!");
		System.out.println((String)returnObj);
		Object[] args = jp.getArgs();
		System.out.println("물건명 : "+args[0]);
		System.out.println("물건가격 : "+args[1]);
	}
	
	public void errorCall() {
		System.out.println("에러! Error!");
	}
	
	// around advice는 위아래로 메소드를 자동삽입하는 것으로 pjp객체가 필요함(가운데를 잡아주는!)
	public void aroundCall(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("aroundBefore=========");
		pjp.proceed(); 	//cpu에서 실행해야 함으로 에러처리를 해주어야한다, 주로 타이머로 사용한다!
		System.out.println("aroundAfter=========");
	}
	
}
