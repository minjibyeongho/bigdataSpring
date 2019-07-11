package com.itbank.mvc03;

import java.util.ArrayList;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	
	@RequestMapping("loginCheck")
	public String login(Model model, MemberDTO memberDTO, ArrayList<String> list) {
		//하위에 arraylist를 new해서 넣어도 상관없음(새로 만들어 진 것 같은 경우에는)
		
		list.add("감자");
		list.add("고구마");
		list.add("양파");
		model.addAttribute("list", list);
		
		//model은 session 사용할 때와 흡사하게
		model.addAttribute("result","내가 넘어왔어요");	// --, --(객체가 되도되고, String이 되어도 됨)
		
		memberDTO.setId("spring");
		memberDTO.setPw("spring");
		memberDTO.setName("spring");
		memberDTO.setTel("spring");
		model.addAttribute("memberDTO",memberDTO);
		
		System.out.println("로그인 처리");
		
		
		return "loginResult";
	}
}
