package com.soho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soho.domain.User;
import com.soho.service.UserService;

@Controller
public class LogonController {

	@Autowired
	private UserService userService;
	
	 @RequestMapping(value = "/index")
	public String initIndex(Model model){
		 model.addAttribute("user", new User());
		return "index";
	}
	 
	 @RequestMapping(value = "/user_reg")
	 public String userRegisiter(Model model){
		return "regisiter";
	 }
	 
	 @RequestMapping(value = "/user_logon")
	 public String userLogon(@ModelAttribute User user){
		 System.out.println(user.getName());
		 System.out.println(user.getPassword());
		 
		 //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
	     //context.start();
	     //UserService userService = (UserService)context.getBean("userService");
	     if(userService.isAuthed(user)){
			return "MainPoster";
		 }else{
			return "errorAuth";
	 	}
		 /*if(userService.isAuthed(user)){
			 return "MainPoster";
		 }else{
			 return "errorAuth";
		 }*/
	 }
	 
	 
}
