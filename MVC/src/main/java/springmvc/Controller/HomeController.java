package springmvc.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController { 
	
	@RequestMapping("/home")
	public String home() { 
		System.out.println("this is home url");
		return "index";
	}  
	@RequestMapping("/school")
	public String school(Model model) { 
		model.addAttribute("name", "Gopikrishna"); 
		List<String> list=new ArrayList<String>(); 
		list.add("jashwanth"); 	
		list.add("prudvi");
		list.add("saisravan");
		list.add("ajith");
		list.add("naveen"); 
		model.addAttribute("friends",list);
		return "school";
	} 
	
	@RequestMapping("/help")
	public ModelAndView help() { 
		ModelAndView modelAndView=new ModelAndView(); 
		modelAndView.addObject("name","Malleshwarrao"); 
		modelAndView.addObject("id", 1); 
		modelAndView.setViewName("help");
		
		List<Integer> list=new ArrayList<Integer>(); 
		list.add(12); 
		list.add(2);
		list.add(16);
		list.add(134);
		list.add(43);
		modelAndView.addObject("marks",list);
		
		
		
		
		
		
		return modelAndView;
//		return "help";
	}
	

}
