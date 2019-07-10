package com.itbank.mbc02;

public class ProductDAO {

	public void insert(ProductDTO productDTO) {
		System.out.println("ProductDAO Insert!!!");
		System.out.println(productDTO.getPid());
		System.out.println(productDTO.getPname());
		System.out.println(productDTO.getPrice());
		System.out.println(productDTO.getMileage());
	}
	
	public void delete(ProductDTO productDTO) {
		System.out.println("ProductDAO Delete!!!");
		System.out.println("삭제할 상품id : " + productDTO.getPid());
	}
	
	public void search(ProductDTO productDTO){
		System.out.println("ProductDAO Search!!!");
		System.out.println("검색할 상품 id : " + productDTO.getPid());
	}
	
	public void milinit(ProductDTO productDTO){
		System.out.println("마일리지 초기화!");
		productDTO.setMileage("0");
	}
	
}
