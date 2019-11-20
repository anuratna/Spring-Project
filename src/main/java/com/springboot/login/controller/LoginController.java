package com.springboot.login.controller;

import java.util.Date;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.login.model.LoginUser;
import com.springboot.login.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	private final org.slf4j.Logger logger = (org.slf4j.Logger) LoggerFactory.getLogger(LoginController.class);

	@RequestMapping("/")
	public String index() {
		logger.debug("this is debug message");
		logger.info("this is info message");
		logger.error("this is error message");
		logger.warn("this is warn message");
		return "login";
	}

	@RequestMapping("/signUpPage")
	public String signUp() {
		return "signUpPage";
	}

	@RequestMapping(value="/signUpUser", method = RequestMethod.POST)
	public String signUpUser(@ModelAttribute("signUpDetails") LoginUser signUpDetails, Model model) {
		
		LoginUser loginUser = loginService.validatedata(signUpDetails);
		if(loginUser==null)
		{
			loginService.insert(signUpDetails);
			logger.info("this is info message");
			return "login";
		}
		model.addAttribute("errorMessage", "User Already Exists");  
		return "login";		
	}	

	@RequestMapping(value="/loginValidate", method = RequestMethod.POST)
	public String validateLogin(@ModelAttribute("loginredentials") LoginUser logincredentials, Model model) {

		LoginUser loginUserDetails = loginService.validatedata(logincredentials);
		if(loginUserDetails==null)
		{
			model.addAttribute("errorMessage", "Invalid Credentials");  
			return "login";
		}
		else if(!loginUserDetails.getUserName().equals(logincredentials.getUserName()))
		{
			model.addAttribute("errorMessage", "Invalid Credentials");  
			return "login";
		}

		model.addAttribute("loginUserDetails", loginUserDetails);
		return "welcome";
	}


	@RequestMapping(value = "/delete")
	public String deleteUser(@RequestParam String name , Model model)
	{
		System.out.println("in controller "+name);
		loginService.deleteData(name);

		//	System.out.println("return in controller "+l);
		model.addAttribute("Message", "User Deleted");
		return "login";


	}
	
	@RequestMapping(value = "/edit")
	public String editUser(@RequestParam String name , Model model)
	{
		System.out.println("in controller "+name);
		LoginUser details = loginService.getData(name);

		//	System.out.println("return in controller "+l);
		model.addAttribute("details", details);
		return "edit";
	}
	
	@RequestMapping(value = "/editUserData" , method = RequestMethod.POST)
	public String saveEditUser(@ModelAttribute("updateDetails") LoginUser user,  Model model)
	{
		//System.out.println("in update controller "+user);
		LoginUser updatedDetails=loginService.updateData(user);



		//	System.out.println("return in controller "+l);
		model.addAttribute("updatedDetails", updatedDetails);
		return "login";
	}
}










