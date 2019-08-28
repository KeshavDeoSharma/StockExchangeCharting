package com.keshav.SpringBootExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.keshav.SpringBootExample.service.IpoPlannedServiceImpl;

@Controller
public class IpoUserController {
	
	@Autowired
	IpoPlannedServiceImpl ipoService;
	@RequestMapping(value="/listIpoUser")
	public ModelAndView  getlistIpo()
	{
		ModelAndView mv=new ModelAndView();
		
				mv.addObject("ListIpo", ipoService.getAllIpo());
				mv.setViewName("ListIpoUser");
		return mv;
	}

}
