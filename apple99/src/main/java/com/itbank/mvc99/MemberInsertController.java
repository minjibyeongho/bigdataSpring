package com.itbank.mvc99;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberInsertController {

	@Autowired
	MemberDAO dao;
	
	@RequestMapping("meminsert.do")
	public void insert(Model model, MemberDTO memberDTO) {
		dao.insert(memberDTO);
		model.addAttribute("dto", memberDTO);
		System.out.println("insert 요청");
	}
	
	@RequestMapping("memselect.do")
	public void select(Model model, MemberDTO memberDTO){
		memberDTO = dao.select(memberDTO);
		System.out.println("member select 요청");
		model.addAttribute("select", memberDTO);
	}
	
	@RequestMapping("memselectAll.do")
	public void selectAll(Model model, MemberDTO memberDTO){
		List<MemberDTO> list = dao.selectAll();
		model.addAttribute("list", list);
	}
}
