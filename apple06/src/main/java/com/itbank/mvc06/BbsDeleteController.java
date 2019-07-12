package com.itbank.mvc06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsDeleteController {

	@Autowired
	BbsDAO bbsDao;
	
	@RequestMapping("delete")
	public void delete(BbsDTO bbsDTO) throws Exception {
		bbsDao.delete(bbsDTO);
		System.out.println("delete 컨트롤러 호출");
	}
	
}
