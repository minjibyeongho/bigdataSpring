package com.itbank.mvc99;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insert(MemberDTO memberDTO) {
		my.insert("mDAO.insert", memberDTO);
		System.out.println("myBatis insert 호출");
	}

	public void delete(MemberDTO memberDTO) {
		my.insert("mDAO.delete", memberDTO);
		System.out.println("myBatis delete 호출");
	}

	public void update(MemberDTO memberDTO) {
		my.update("mDAO.update", memberDTO);
		System.out.println("myBatis update 호출");
	}
	
	public MemberDTO select(MemberDTO memberDTO) {
		System.out.println("myBatis select 호출");
		return my.selectOne("mDAO.select", memberDTO);
	}
	
	public List<MemberDTO> selectAll() {
		System.out.println("myBatis selectAll 호출");
		return my.selectList("mDAO.selectAll");
	}
	
}
