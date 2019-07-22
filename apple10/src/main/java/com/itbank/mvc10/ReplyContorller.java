package com.itbank.mvc10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReplyContorller {

	@Autowired
	ReplyDAO dao;
	
	@RequestMapping("replyInsert.do")
	public void Insert(ReplyDTO replyDTO) {
		dao.insert(replyDTO);
		System.out.println("reply insert 요청");
	}
	
}
