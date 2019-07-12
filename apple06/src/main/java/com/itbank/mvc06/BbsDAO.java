package com.itbank.mvc06;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

@Repository		//spring에서 singleton으로 만들어줌
public class BbsDAO {
	DBConnectionMgr dbcp;
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	//기본 생성자
	//생성자: 객체 생성시 자동 호출되는 메소드
	//객체생성시 꼭 해주어야하는 초기화 과정
	public BbsDAO() {
		dbcp = DBConnectionMgr.getInstance();
	}

	public void update(BbsDTO dto) throws Exception {
		con = dbcp.getConnection();

		//3. SQL문 객체화
		String sql = "update bbs set title = ?, content = ?, writer =? where id = ?";
		ps = con.prepareStatement(sql);

		ps.setString(1, dto.getTitle());
		ps.setString(2, dto.getContent());
		ps.setString(3, dto.getWriter());
		ps.setString(4, dto.getId());
		
		//4. SQL문 실행 요청
		ps.executeUpdate();
	}	
	
	public BbsDTO select(BbsDTO dto) throws Exception {
		con = dbcp.getConnection();

		//3. SQL문 객체화
		String sql = "select * from bbs where id = ?";
		ps = con.prepareStatement(sql);

		ps.setString(1, dto.getId());
		
		//4. SQL문 실행 요청
		rs = ps.executeQuery();
		
		BbsDTO dto2 =null;
		
		if(rs.next()){
			dto2 = new BbsDTO();
			String id = rs.getString(1);
			String title = rs.getString(2);
			String content = rs.getString(3);
			String writer = rs.getString(4);
			
			dto2.setId(id);
			dto2.setTitle(title);
			dto2.setContent(content);
			dto2.setWriter(writer);
		}
		return dto2;
	}
	
	public void insert(BbsDTO dto) throws Exception {
		con = dbcp.getConnection();

		//3. SQL문 객체화
		String sql = "insert into bbs values (?,?,?,?)";
		ps = con.prepareStatement(sql);

		ps.setString(1, dto.getId());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getWriter());
		
		//4. SQL문 실행 요청
		ps.executeUpdate();
	}
	
	public void delete(BbsDTO dto) throws Exception {
		con = dbcp.getConnection();
		
		String sql = "delete from bbs where id = ?";
		
		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		
		//4. SQL문 실행 요청
		ps.executeUpdate();
		
	}
	
	
	
	
	
}
