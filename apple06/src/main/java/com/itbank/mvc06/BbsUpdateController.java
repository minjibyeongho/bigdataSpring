package com.itbank.mvc06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsUpdateController {

	@Autowired
	BbsDAO bbsDao;

	@RequestMapping("update")
	public void update(Model model, BbsDTO bbsDTO) throws Exception {
		bbsDao.update(bbsDTO);
		System.out.println("수정완료!");
		BbsDTO bbsDTO2 = bbsDao.select(bbsDTO);
		System.out.println(bbsDTO2.getId());
		System.out.println(bbsDTO2.getTitle());
		System.out.println(bbsDTO2.getContent());
		System.out.println(bbsDTO2.getWriter());
		model.addAttribute("bbsDTO2", bbsDTO2);
	}

}
