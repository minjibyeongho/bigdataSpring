package com.itbank.mvc06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsSelectController {

	@Autowired
	BbsDAO bbsDao;

	@RequestMapping("select")
	public void select(Model model, BbsDTO bbsDTO) throws Exception {

		bbsDTO = bbsDao.select(bbsDTO);// select해온 것을 bbsDTO에 다시 넣음
		model.addAttribute("bbsDTO", bbsDTO);
		
	}

}
