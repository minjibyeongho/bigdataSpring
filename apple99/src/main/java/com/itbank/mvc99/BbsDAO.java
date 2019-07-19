package com.itbank.mvc99;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {

	@Autowired
	SqlSessionTemplate myBatis;
	
	public void insert(BbsDTO bbsDTO){
		myBatis.insert("bDAO.insert", bbsDTO);
	}
	
	public void delete(BbsDTO bbsDTO){
		myBatis.delete("bDAO.delete", bbsDTO);
	}
	
	public void update(BbsDTO bbsDTO){
		myBatis.delete("bDAO.update", bbsDTO);
	}
	
	public void select(BbsDTO bbsDTO){
		myBatis.delete("bDAO.select", bbsDTO);
	}
	
/*	public List<BbsDTO> selectAll() {
		myBatis.delete("bDAO.selectAll");
	}*/
	
}
