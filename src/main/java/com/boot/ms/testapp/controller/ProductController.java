package com.boot.ms.testapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class ProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	/*@Autowired
	ProductService prodservice;
	
	@Autowired
	ProductServiceFeign feignProductService;

	@RequestMapping(path = "/products", method = RequestMethod.GET)
	public String getProducts(ModelMap model, HttpServletRequest request) {
		logger.debug("/products: Session auth token:"+request.getSession().getAttribute("userToken"));
		
		//List<Product> all_product =  feignProductService.getProducts();
		List<Product> all_product = prodservice.getAllProductFeign(request.getSession().getAttribute("userToken").toString());
		//List<Product> all_product =  prodservice.getAllProduct(request.getSession().getAttribute("userToken").toString());
		logger.debug("Grocery Controller : getProducts::"+all_product.get(0).getName());
		logger.info(" Info Grocery Controller : getProducts::"+all_product.get(0).getName());
		
		model.addAttribute("userName", request.getSession().getAttribute("userName").toString());
		model.addAttribute("products",all_product);
		model.addAttribute("cart", new CartForm());
		//System.out.println("Show Cart in product Controller ::"+model.getAttribute("showCart"));
		model.addAttribute("showProduct",true);
		return "home";
		
	}*/
	
}
