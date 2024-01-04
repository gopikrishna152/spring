package springmvcsearch.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileUploadController {
	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "fileform";
	} 
	
	@RequestMapping(value="/uploadimage",method = RequestMethod.POST)
	public ModelAndView UploadFile(@RequestParam("profile")CommonsMultipartFile file ,HttpSession s) throws IOException {  
		
		System.out.println("file upload handler"); 
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		ModelAndView mav=new ModelAndView(); 
		try {
		byte[] data=file.getBytes(); 
		String path=s.getServletContext().getRealPath("/");
		System.out.println(path); 
		FileOutputStream fos=new FileOutputStream(path); 
		fos.write(data);  
		fos.close(); 
		} 
		catch (Exception e) {
			// TODO: handle exception 
			System.out.println(e.getMessage());
			System.out.println("error ocurring while uploading");
		}		
		mav.setViewName("filesuccess");
		return mav;
	}
	
	
	

}
