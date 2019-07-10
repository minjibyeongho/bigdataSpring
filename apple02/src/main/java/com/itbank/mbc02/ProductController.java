package com.itbank.mbc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@RequestMapping("confirm")
	public void insert(ProductDTO productDTO, ProductDAO productDAO) {
		productDAO.insert(productDTO);
		//productDAO.milinit(productDTO);
	}
	
	@RequestMapping("delete")
	public void delete(ProductDTO productDTO, ProductDAO productDAO) {
		productDAO.delete(productDTO);
	}
	
	@RequestMapping("search")
	public String search(ProductDTO productDTO, ProductDAO productDAO) {
		productDAO.search(productDTO);
		return "search2";
	}
	
}
