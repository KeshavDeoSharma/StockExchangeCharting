package com.keshav.SpringBootExample.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.keshav.SpringBootExample.model.ExcelModel;
import com.keshav.SpringBootExample.model.ImportData;
import com.keshav.SpringBootExample.XLSXReaderExample;

@Controller
public class ImportDataControllerImpl {

	@Autowired
	ServletContext context;
	XLSXReaderExample xlsreader=new XLSXReaderExample();
	
	@RequestMapping(value="/loadImport", method= RequestMethod.GET)
	public ModelAndView fileUploadPage() {
		ExcelModel file=new ExcelModel();
		ModelAndView modelandview= new ModelAndView("importData","command",file);
		return modelandview;
	}

	@RequestMapping(value="/importData", method=RequestMethod.POST)
	public String fileUpload(@Validated ExcelModel file, BindingResult result, ModelMap model) throws IOException {
		if(result.hasErrors()) {
			System.out.println("errors");
			System.out.println(result.getAllErrors());
			//model.addAttribute("c1", file);
			return "redirect:/importData";
		
		}
		else {
		System.out.println("fetching file");
		MultipartFile multipartFile= file.getFile();
		//System.out.println(multipartFile);
		String uploadPath=context.getRealPath("")+File.separator+ "temp" + File.separator;
		System.out.println(uploadPath);
		//now do something with file
		FileCopyUtils.copy(file.getFile().getBytes(), new File(uploadPath+file.getFile().getOriginalFilename()));
		String fileName= multipartFile.getOriginalFilename();
		System.out.println(fileName+"-----------------------------------");
		model.addAttribute("fileName",fileName);
		System.out.println(fileName);
		ImportData importData=new ImportData();
		importData=xlsreader.readExcel(fileName);
		model.addAttribute("import", importData);
		return "ExcelSummary";
		}
	}

}