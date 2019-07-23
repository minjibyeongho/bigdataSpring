package com.itbank.flower;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class AspectClass {
	
	public void greed() {
		System.out.println("환영합니다");
	}
	
	public void errorCall() {
		System.out.println("AspectClass 에러에러!");
	}
	
	public void	aroundCall(ProceedingJoinPoint pjp) throws Throwable {
		StopWatch watch = new StopWatch();
		System.out.println("쇼핑을 시작합니다.");
		watch.start();
		pjp.proceed();
		watch.stop();
		System.out.println("쇼핑을 마칩니다!");
		String method = pjp.getSignature().getName();
		System.out.println(method+"()메소드 수행시간"+watch.getTotalTimeMillis()+"초");
		
	}
	
}
