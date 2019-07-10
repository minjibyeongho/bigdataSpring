package com.itbank.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller		//controller임을 annotation을 통해서 나타내줌
public class MemberController {
	
	@RequestMapping("insert")	//webapp에서 요청한 주소를 나타냄
	public void insert(@RequestParam("id") String id, @RequestParam String name, @RequestParam String tel) {
		// String id만 적어도 @RequestParam("id")을 실행시켜줌
		// 아래의 MemberDTO memberDTO를 보면 알 수 있음!
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(tel);
		
		System.out.println("회원가입 하자앙");
		System.out.println("DAO를 통한 DB연동 처리 필요");
		
	}
	
	@RequestMapping("insert2")	//webapp에서 요청한 주소를 나타냄
	public void insert(MemberDTO memberDTO, MemberDAO memberDAO) {	//spring에서는 setproperty와 같은 역할을 해준다.
		memberDAO.insert(memberDTO);
		memberDAO.insert2(memberDTO);	//이와같이 메소드만 수정해주면 됨!
		
		
		//MemberDTO memberDTO로 작성하면 controller에서 views까지 넘겨주는데, 
		//1,2차 하듯이 MemberDTO dto 이런식으로하면 같은 것으로 인식을 하지 못한다...! 되도록이면 class 앞부분 대문자를 소문자로 바꿔서 만든다.
		System.out.println("DAO를 통한 DB연동 처리 필요");
		
		/*System.out.println("입력한 id : "+memberDTO.getId());
		System.out.println("입력한 pw : "+memberDTO.getPw());
		System.out.println("입력한 name : "+memberDTO.getName());
		System.out.println("입력한 tel : "+memberDTO.getTel());*/
	}
	
//	@RequestMapping("delete")	//webapp에서 요청한 주소를 나타냄
//	public void delete(MemberDTO memberDTO, MemberDAO memberDAO) {	
//		//위에 insert에서 memberDAO를 하나 이미 객체 생성했는데 또 만들 필요가 있나? ---> 없음!(제어 역행을 배우고 나중에 수정할 것, 현재는 새로 객체를 만드는 것으로)
//		memberDAO.delete(memberDTO);
//	}
}
