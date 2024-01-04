package springmvcsearch.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvcsearch.Entity.StudentEntity;
@Controller
public class FormController { 
	
	@RequestMapping("/complex")
	public String complex() {
		return "complex_form";
	}  
	
	
	@RequestMapping(path="/process/{name}",method=RequestMethod.POST)
	public ModelAndView getting(@ModelAttribute("studententity")  StudentEntity studententity,BindingResult result,@PathVariable("name") String name) throws NoSuchAlgorithmException { 
		ModelAndView modelandview=new ModelAndView();  
		System.out.println(name);
//		MessageDigest md=MessageDigest.getInstance("sha-256");  
//		md.digest();
		
		if(result.hasErrors()) {
//			return "complex_form"; 
			modelandview.setViewName("complex_form"); 
			return modelandview;
			
		}
		System.out.println(studententity);
		
		
		modelandview.setViewName("success");
		return modelandview;
	}

}
