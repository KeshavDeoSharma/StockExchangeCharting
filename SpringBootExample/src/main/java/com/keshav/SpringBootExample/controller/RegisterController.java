package com.keshav.SpringBootExample.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.keshav.SpringBootExample.SendEmail;
import com.keshav.SpringBootExample.model.Otp;
import com.keshav.SpringBootExample.model.Register;
import com.keshav.SpringBootExample.model.UpdatePassword;
import com.keshav.SpringBootExample.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	RegisterService registerService;
	Register reg=new Register();
	String otp;


	@RequestMapping(path="/loadRegister",method=RequestMethod.GET)
	public String loadRegister(ModelMap model)
	{
		Register register=new Register();
		model.addAttribute("register",register);
		return "SignUp";
	}

	@RequestMapping(path="/addRegisterUser",method=RequestMethod.POST)
	public String addRegisteRUser(Register register,Model model)
	{
		register.setUsertype("User");
		model.addAttribute("register", register);
		reg.setMobileNumber(register.getMobileNumber());
		reg.setPassword(register.getPassword());
		reg.setUsertype(register.getUsertype());
		reg.setEmail(register.getEmail());
		reg.setUsername(register.getUsername());
		return "redirect:/loadOtp";
	}

	


	@RequestMapping(path="/addRegisterAdmin",method=RequestMethod.POST)
	public String addRegisterAdmin(Register register,Model model)
	{
		register.setUsertype("Admin");
		model.addAttribute("register", register);
		reg.setMobileNumber(register.getMobileNumber());
		reg.setPassword(register.getPassword());
		reg.setUsertype(register.getUsertype());
		reg.setEmail(register.getEmail());
		reg.setUsername(register.getUsername());

	if(registerService.insert(register)!=null)
		return "redirect:/loadLogin";
	else
		return "redirect:/loadRegister";
	}
	 

	@RequestMapping(path="/loadLogin",method=RequestMethod.GET)
	public String loadLogin(ModelMap model,HttpSession session)
	{
		session.invalidate();
		Register register =new Register();
		model.addAttribute("user",register);
		return "Login";	
	}

	
	@RequestMapping(path="/login",method=RequestMethod.POST)
	public String login(Register register,BindingResult result,HttpSession session)
	{
		Register register1=new Register();
		 register1=registerService.authenticate(register);
		 System.out.println("====in the login");
		 System.out.println(register1.getUsername()+" "+register1.getPassword());
		 if(register1!=null)
		 {
			 if(register.getPassword().equals(register1.getPassword())&&(register1.getUsertype().equalsIgnoreCase("User")))
			{ 
				  session.setAttribute("user", register1);
				
				  return "home";
					 }
			 else
				 if(register.getPassword().equals(register1.getPassword())&&(register1.getUsertype().equalsIgnoreCase("admin")))
				 {
				
				  session.setAttribute("admin", register1);
				 
					 
					 return "home";
						 }
		 
			 }
			 return "redirect:/loadLogin";
	}
	 
	@RequestMapping(path="/loadOtp",method=RequestMethod.GET)
	public String loadOtp(ModelMap model)
	{
		Register register=new Register();
		model.addAttribute("otp", register);
		return "Otp";
	}
	@RequestMapping(path="/generateOtp",method=RequestMethod.POST)
	public String addingOtp(ModelMap model)
	{
		//Register register=new Register();
		model.addAttribute("GenerateOtp", reg);
		SendEmail sm=new SendEmail();
		otp=sm.otp(reg.getEmail());
		return "redirect:/loadSubmitOtp";
	}
	@RequestMapping(path="/loadSubmitOtp",method=RequestMethod.GET)
	public String loadSubmitOtp(Otp otp,ModelMap model)
	{
		model.addAttribute("SubmitOtp",otp);
		return "SubmitOtp";
	}
	@RequestMapping(path="/submitOtp",method=RequestMethod.POST)
	public String submitOtp(Otp otp1,BindingResult result)
	{
		System.out.println(reg);
		System.out.println(this.otp+"==============================================================");
		if(this.otp.equals(otp1.getOtp()))
		{
			System.out.println("++++++++++++++++++++++++++++++inside otp=otp");
			reg.setConfirmed(1);
			if(registerService.insert(reg)!=null) {
				System.out.println("++++++++++++++++++++++inside if service");
			}
				return "redirect:/loadLogin";
		}
		return "redirect:/loadOtp";
	}
	@RequestMapping(path="/logout",method=RequestMethod.GET)
	public String logout(HttpSession session)
	{
		//System.out.println("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[in logout");
		session.invalidate();
		return "redirect:/loadLogin";	}
	@RequestMapping(path="/loadUpdatePassword",method=RequestMethod.GET)
	public String updatePass(ModelMap model,HttpSession session)
	{
		UpdatePassword update =new UpdatePassword();
	System.out.println(session.getAttribute("user"));
		model.addAttribute("register", update);
		return "updatePassword";
	}
	@RequestMapping(path="/updatePassword",method=RequestMethod.POST)
	public String updatePasssword(UpdatePassword update)
	{
		Register register=registerService.getUser(update.getUsername());
		if(register.getPassword().equals(update.getCurrentpassword()))
		{
		register.setPassword(update.getNewpassword());
		registerService.updateUser(register);
		return "redirect:/loadLogin";
		}
		else
		{
			return "redirect:/loadUpdatePassword";
		}
		
		
	}

}
