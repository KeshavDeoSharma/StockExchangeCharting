package com.keshav.SpringBootExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.keshav.SpringBootExample.SendEmail;
import com.keshav.SpringBootExample.model.Register;
import com.keshav.SpringBootExample.service.RegisterService;

@Controller
public class OtpController {
	@Autowired
	RegisterService registerService;
	
	/*
	 * @RequestMapping(path="/loaadOtp",method=RequestMethod.GET) public String
	 * loadOtp(ModelMap model,) { Register register=new Register();
	 * model.addAttribute("otp", register); return "Otp"; }
	 * 
	 * @RequestMapping(path="/generateOtp",method=RequestMethod.POST) public String
	 * addOtp(Register register) {
	 * 
	 * SendEmail sm=new SendEmail(); int t=sm.otp(email) return
	 * "redirect:/loadLogin"; }
	 */
}
