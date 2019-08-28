package com.keshav.SpringBootExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.keshav.SpringBootExample.model.IpoPlanned;
import com.keshav.SpringBootExample.service.IpoPlannedServiceImpl;

@Controller
public class IpoController {
	@Autowired
	IpoPlannedServiceImpl ipoService;

	@RequestMapping(value="/loadIpo", method=RequestMethod.GET)
	public String loadStock(ModelMap model)
	{
		IpoPlanned ipoPlanned=new IpoPlanned();
		model.addAttribute("IpoPlanned",ipoPlanned);
		model.addAttribute("companyList",ipoService.getAllCompany());
		model.addAttribute("stockList",ipoService.getAllStock());
		return "IpoPlanned";
	}
	@RequestMapping(value="/addIpo",method=RequestMethod.POST)
	public String addIpo(IpoPlanned ipoPlanned)
	{
		if(ipoService.insertipoPlanned(ipoPlanned)!=null)
		{
			return "redirect:/listIpo";
		}
		else
			return "redirect:/loadIpo";
	}
	@RequestMapping(value="/listIpo")
	public ModelAndView  getlistIpo()
	{
		ModelAndView mv=new ModelAndView();
		
				mv.addObject("ListIpo", ipoService.getAllIpo());
				mv.setViewName("ListIpo");
		return mv;
	}
}
