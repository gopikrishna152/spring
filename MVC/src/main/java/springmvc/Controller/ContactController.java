package springmvc.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController { 
	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/contact",method=RequestMethod.GET)
	public String showForm() {
		return "contact";
	} 
//	@RequestMapping(path="/processForm", method = RequestMethod.POST)
//	public  String processform(@RequestParam("email") String useremail,@RequestParam("username") String username,@RequestParam("password") String pass ){
////		System.out.println(useremail+" "+username+" "+pass);
//		
//		User user =new User();  
//		user.setEmail(useremail); 
//		user.setUsername(username); 
//		user.setPassword(pass);
//		
//	System.out.println(user);
//		
//		
//		
//		
//		
//		return "help";
//	} 
	
	
	
	@RequestMapping(path="/processForm", method = RequestMethod.POST)
	public  String processform( @ModelAttribute User user,Model model) {   
		
		
		this.userService.createUser(user);
		System.out.println(user);
		return "sucess";
		
	}
	
	
	
	
	
	
	
	
	
	

}
