package com.jsp.book_my_ticket.exceptipn;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@ControllerAdvice
public class GlobalExceptionHander {

	@ExceptionHandler(NoResourceFoundException.class)
	public String handle(NoResourceFoundException exception) {
		return "404.html";
	}
}
