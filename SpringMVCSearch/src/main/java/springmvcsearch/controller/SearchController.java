package springmvcsearch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller 

public class SearchController { 
	
	
	@RequestMapping("/home") 
	public String home() { 
		System.out.println("creating the home view"); 
		String str=null; 
		System.out.println(str.length());
		return "home";
	} 
	
	@RequestMapping("/dosearch")
	public RedirectView search(@RequestParam("querybox") String query) {   
		RedirectView rdv=new RedirectView();
		if(query.isBlank()) {
			rdv.setUrl("home");
		} 
		else {
		String url="https://www.google.com/search?q="+query; 
		rdv.setUrl(url);
		}
		 
		return rdv;
		
	}  
	
	@RequestMapping("/book/{id}/{username}")
	public String handler(@PathVariable("id") int id,@PathVariable("username") String name) {
		System.out.println(id); 
		System.out.println(name);
		return "";
	} 
//	
////	handling the excwption in spring mvc
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler({NullPointerException.class,NumberFormatException.class,IndexOutOfBoundsException.class})
//	public String exceptionHandlerNull() {
//		return "null_page";
//	} 
//	
//	
//	@ExceptionHandler(value=Exception.class)
//	public String exceptionGeneric() {
//		return "null_page";
//	}
//	
	
	
	

}
