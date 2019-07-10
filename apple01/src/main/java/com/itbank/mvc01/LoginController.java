package com.itbank.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;

@Controller		//annotaion을 활용(상속받은 class가 된 것)
public class LoginController {
	// front controller가 모든 것을 받아서 controller들을 다 모아서(list up) 분기 시킴
	// start.jsp에서 action으로 login을 호출하면 이 컨트롤러가 불러져와서 메소드를 활용
	
	@RequestMapping("login")		//login이라고 호출하면 이 메소드를 실행해주라는 역할
	public void login(@RequestParam("id") String id, @RequestParam String pw ) {	
		//parameter 받는 법 @RequestParam("id") [<- 클라이언트의 name값과 같아야함] String id, request.getParameter("id")와 같은것
		// @RequestParam("id") String id -> ("id")와 id가 같으면 ("id")를 생략해도 됨 -> @RequestParam String id 이런 식으로
		System.out.println(id);
		System.out.println(pw);
		System.out.println("로그인 처리 요청됨.");
		System.out.println("로그인 처리 완료.");
	}
	
	@RequestMapping("login2")		//login이라고 호출하면 이 메소드를 실행해주라는 역할
	public String login2(@RequestParam("id") String id, @RequestParam String pw ) {
		String sId = "root";
		String sPw = "1234";
		if(sId.equals(id) && sPw.equals(pw)){
			return "loginOk";
		}else{
			return "loginNot";
		}
				
	}
	
	@RequestMapping("memberDetail")
	public void detail() {
		System.out.println("DAO의 DB연동 처리");
		System.out.println("상세 정보 받아옴");
		System.out.println("views아래로 결과를 넘김(전송)");
		System.out.println("회원 상세정보!");
	}
	
	@RequestMapping("memberDelete")
	public void delete(){
		System.out.println("DAO의 DB 연동 처리");
		System.out.println("회원정보 삭제!");
		System.out.println("삭제하고 view에 띄워줌");
	}
}
