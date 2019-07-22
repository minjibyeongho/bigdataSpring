package com.itbank.mvc10;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReplyDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insert(ReplyDTO replyDTO) {
		my.insert("rDAO.insert", replyDTO);
		System.out.println("myBatis호출");
	}
	
	public List<ReplyDTO> select(MemberDTO memberDTO) {
		return my.selectList("rDAO.select", memberDTO);
	}
	
}
