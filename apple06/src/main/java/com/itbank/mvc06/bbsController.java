package com.itbank.mvc06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class bbsController {

	@Autowired		//getInstance 역할, 자료형(type)을 가지고 찾아서 옴
	BbsDAO bbsDao;
	
	@RequestMapping("bbsInsert")
	public void insert(BbsDTO bbsDTO, BbsDAO bbsDAO) throws Exception {
		bbsDao.insert(bbsDTO);
		System.out.println("컨트롤러 호출 확인...!");
	}
	
	
	
}
