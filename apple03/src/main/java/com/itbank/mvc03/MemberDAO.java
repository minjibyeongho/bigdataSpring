package com.itbank.mvc03;

public class MemberDAO {

	public void insert(MemberDTO memberDTO) {
		System.out.println("DB연동해서 insert sql문 실행");
		//마이바티스에서는 DBCP사용할 때와 같이 쓰지않는다.(아직은 적용시키지 않은 것)
		System.out.println("저장된 id : "+memberDTO.getId());
		System.out.println("저장된 pw : "+memberDTO.getPw());
		System.out.println("저장된 name : "+memberDTO.getName());
		System.out.println("저장된 tel : "+memberDTO.getTel());
	}
	
	public void insert2(MemberDTO memberDTO) {
		System.out.println("DB연동해서 insert sql문 실행");
		//마이바티스에서는 DBCP사용할 때와 같이 쓰지않는다.(아직은 적용시키지 않은 것)
		System.out.println("저장된 id : "+memberDTO.getId());
		System.out.println("암호화된 pw : "+memberDTO.getPw());
		System.out.println("저장된 name : "+memberDTO.getName());
		System.out.println("저장된 tel : "+memberDTO.getTel());
	}
	
}
