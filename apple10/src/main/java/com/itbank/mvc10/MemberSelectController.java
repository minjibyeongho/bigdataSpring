package com.itbank.mvc10;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberSelectController {

	@Autowired
//	@Qualifier("dao1")	// Qualifier는 dao1이라는 이름으로 한번더 검색하는 기능(dao라는 이름이 여러개 있을 때)
	MemberDAO dao;
	
	@RequestMapping("select.do")
	public void select(MemberDTO memberDTO, Model model) {
		MemberDTO dto = dao.select(memberDTO);
		model.addAttribute("dto", dto);
	}
	
	@RequestMapping("selectAll.do")
	public void selectAll(Model model) {
		List<MemberDTO> list = dao.selectAll();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("main.do")
	public String main(){
		return "redirect:main.jsp";
	}
	
	
}
