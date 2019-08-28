package com.keshav.SpringBootExample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keshav.SpringBootExample.dao.RegisterDao;
import com.keshav.SpringBootExample.model.Register;

@Service
public class RegisterService {
	@Autowired
	RegisterDao registerDao;
	
	public Register insert(Register register)
	{
		return registerDao.save(register);
	}
	public Register authenticate(Register register)
	{
		System.out.println(register.getUsername());
		System.out.println(register.getPassword());
		return  registerDao.findByUsername(register.getUsername());
		
	}
	public Register getUser(String name)
	{
		return registerDao.findByUsername(name);
		
	}
	public void updateUser(Register register) {
		registerDao.saveAndFlush(register);
	}

}
