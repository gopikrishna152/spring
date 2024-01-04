package ProductCRUDapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.lang.ProcessBuilder.Redirect;
import java.util.*;
import ProductCRUDapp.dao.ProductDao;
import ProductCRUDapp.model.Product;

@Controller 
@ComponentScan(basePackages = "ProductCRUDapp")
public class MainController {   
	@Autowired
	private ProductDao productDao;
	@RequestMapping("/home")
	public String help(Model m) { 
		List<Product>  products=productDao.getProducts();
		m.addAttribute("products",products);
		
		
		return "index";
	}  
	@RequestMapping("/add-product")
	public String addProduct(Model m) {
		m.addAttribute("title","AddProduct");
		return "add_product";
	}  
	
	@RequestMapping(value="/handle-product",method = RequestMethod.POST)
	public RedirectView handleproduct(@ModelAttribute Product product,HttpServletRequest request) { 
		System.out.println(product); 
		productDao.createProduct(product); 
		RedirectView rv=new RedirectView();  
		rv.setUrl(request.getContextPath()+"/");
		return rv;
	}
	
	@RequestMapping(value="/delete/{productId}")
	public RedirectView delete(@ModelAttribute Product product,HttpServletRequest request,@PathVariable("productId") Integer productId) {

		RedirectView rv=new RedirectView(); 
		productDao.deleteProduct(productId);
		rv.setUrl(request.getContextPath()+"/");
		return rv;
		
	} 
	
	@RequestMapping("/update/{productId}")
	public String update(@PathVariable("productId") Integer productId,Model model) { 
//		RedirectView rv=new RedirectView(); 
		Product product=this.productDao.getProduct(productId); 
		model.addAttribute("product", product); 
//		rv.setUrl("")
//		return rv; 
		return "update_form";
		
		
	}
	
	
	
	
	

}
