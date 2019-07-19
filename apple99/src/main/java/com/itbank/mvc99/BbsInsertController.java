package com.itbank.mvc99;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsInsertController {

	@Autowired
	BbsDAO dao;
	
	@RequestMapping("bbsinsert.do")
	public void insert(BbsDTO bbsDTO){
		dao.insert(bbsDTO);
		System.out.println("bbs insert 요청");
	}

}
