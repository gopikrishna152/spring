package springmvcsearch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;
@ControllerAdvice
public class ExceptionHandler { 
	
	
	
//	handling the excwption in spring mvc
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR) 
//	@org.springframework.web.bind.annotation.ExceptionHandler
	@org.springframework.web.bind.annotation.ExceptionHandler({NullPointerException.class,NumberFormatException.class,IndexOutOfBoundsException.class})
	public String exceptionHandlerNull() {
		return "null_page";
	} 
	
	
	@org.springframework.web.bind.annotation.ExceptionHandler(value=Exception.class)
	public String exceptionGeneric() {
		return "null_page";
	}
	

}
