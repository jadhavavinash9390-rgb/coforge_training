package com.coforge.pms.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.pms.model.Product;
import com.coforge.pms.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@RequestMapping("home")
	public ModelAndView loadHomePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHome");
		
		return mv;
	}
	
	//using ModelAttribute it get IOC container automatically
	@RequestMapping(method = RequestMethod.POST, value = "product",  params = "Add")
	public ModelAndView createProduct(@ModelAttribute Product product) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHome");
		
		String result = "";
		boolean status = service.addProduct(product);
		
		if(status) {
			result = "SUCCESS : Product  Added";
		}else {
			result = "FAILED : Product not Added";
		}
		
		
		mv.addObject("result", result);
		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "product",  params = "Update")
	public ModelAndView updateProduct(@ModelAttribute Product product) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHome");
		
		String result = "";
		boolean status = service.updateProduct(product);
		
		if(status) {
			result = "SUCCESS : Product Update";
		}else {
			result = "FAILED : Product  Not Update";
		}
		
		
		mv.addObject("result", result);
		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "product",  params = "Delete")
	public ModelAndView deleteProduct(@RequestParam int pid) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHome");
		
		String result = "";
		boolean status = service.deleteProduct(pid);
		
		if(status) {
			result = "SUCCESS : Product  Deleted";
		}else {
			result = "FAILED : Product  Not Deleted";
		}
		
		
		mv.addObject("result", result);
		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "product",  params = "Find")
	public ModelAndView findProduct(@RequestParam int pid) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHome");
		
		String result = "";
		Product product = service.findProduct(pid);
		
		if(product != null) {
			result = product.toString();
		}else {
			result = "FAILED : Product  Not Found";
		}
		
		
		mv.addObject("result", result);
		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "product", params = "FindAll")
	public ModelAndView findAllProduct() {

	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("ProductHome");

	    Collection<Product> products = service.findAllProduct();

	    System.out.println(products);   // Add this line

	    StringBuilder sb = new StringBuilder();

	    for(Product p : products) {
	        sb.append(p.toString()).append("<br>");
	    }

	    mv.addObject("result", sb.toString());

	    return mv;
	}

}
