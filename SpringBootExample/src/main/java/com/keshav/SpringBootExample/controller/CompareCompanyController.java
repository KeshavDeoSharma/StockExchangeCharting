package com.keshav.SpringBootExample.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.keshav.SpringBootExample.model.CompareCompany;
import com.keshav.SpringBootExample.service.CompanyService;

@Controller
public class CompareCompanyController {
	@Autowired
	CompanyService companyService;
	
	@RequestMapping(path="/loadCompareCompany",method=RequestMethod.GET)
	public String loadCompareCompany(ModelMap model) throws SQLException
	{
		CompareCompany company=new CompareCompany();
		model.addAttribute("companyList",companyService.getCompanyList());
		model.addAttribute("company", company);
		return "CompareCompany";
	}

}
