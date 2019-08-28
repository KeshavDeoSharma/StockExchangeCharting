package com.keshav.SpringBootExample.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.keshav.SpringBootExample.model.Company;
import com.keshav.SpringBootExample.service.CompanyService;


@Controller
public class CompanyController {
	
	  @Autowired CompanyService companyService;
	  
	  @RequestMapping(value="/loadCompany", method=RequestMethod.GET)
	  public String  m1(ModelMap model) { 
	
	  Company company=new Company(); 
	  model.addAttribute("company",company);
	  model.addAttribute("sectorList", companyService.getSectorList());
	
	  return  "addCompany";
	  
	  }
	  
	  
	  
	  @RequestMapping(value="/submitCompany",method=RequestMethod.POST)
	  public String addCompany(Company company)
	  { 
		Random random=new Random();
		int i=random.nextInt(90000)+10000;
		company.setCompanyId(i);
		company.setActive("active");
	  if(companyService.insertCompany(company)!=null) 
	  { 
		
		  return "redirect:/listCompany"; } 
	  else
	  
	  return "redirect:/loadCompany";
}
	  
	  
	  
	  @RequestMapping(path="/listCompany") 
	  public ModelAndView getCompanyList()  throws Exception 
	 { 
		  ModelAndView mv=new ModelAndView();
	  mv.setViewName("companyList");
	  mv.addObject("companyList",companyService.getCompanyList()); 
	  return mv;
}
	  
	  
	  @RequestMapping(value="/editCompany/{companyId}",method=RequestMethod.GET) 
	  public ModelAndView getCompany(@PathVariable("companyId") int companyId)  throws Exception 
	 { 
		  ModelAndView mv=new ModelAndView();
		  mv.addObject("companyDetails", companyService.getCompanyById(companyId));
		  mv.setViewName("companyEdit");
		 return mv;
	 }

	
	 @RequestMapping(path="/manageCompany",method=RequestMethod.GET)
	 public ModelAndView getManageCompnay() throws Exception
	 {
		 ModelAndView mv=new ModelAndView();
		 mv.addObject("companyList",companyService.getCompanyList());
		 mv.setViewName("manageCompany");
		 return mv;
	 }
	 @RequestMapping(path="/updateCompany",method=RequestMethod.POST)
	 public String updateCompany(Company company)
	 {
		 companyService.getUpdateCompany(company);
		 return "redirect:/listCompany";
	 }
	 @RequestMapping(value="/deactivateCompany/{companyId}",method=RequestMethod.GET) 
	  public String deactCompany(@PathVariable("companyId") int companyId)  throws Exception 
	 { 
		 
		  Company company=companyService.getCompanyById(companyId);
		
		  if(company.getActive().equals("deactive"))
			  company.setActive("active");
		  else
			  if(company.getActive().equals("active"))
				  company.setActive("deactive");
		  companyService.getUpdateCompany(company);
		
		  return "redirect:/listCompany";
	 }

	
}
