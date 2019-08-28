package com.keshav.SpringBootExample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.keshav.SpringBootExample.dao.CompanyDao;
import com.keshav.SpringBootExample.dao.IpoPlannedDao;
import com.keshav.SpringBootExample.dao.StockExchangeDao;
import com.keshav.SpringBootExample.model.Company;
import com.keshav.SpringBootExample.model.IpoPlanned;
import com.keshav.SpringBootExample.model.StockExchange;

@Service
public class IpoPlannedServiceImpl implements IpoPlannedService {
	@Autowired
	IpoPlannedDao ipoPlannedDao;
	
	@Autowired
	StockExchangeDao stockExchangeDao;
	@Autowired
	CompanyDao companyDao;
	
@Override
public List<IpoPlanned> getAllIpo(){
		return  ipoPlannedDao.findAll();
	}
@Override
public IpoPlanned insertipoPlanned(IpoPlanned ipoPlanned)
{
	return  ipoPlannedDao.save(ipoPlanned);
	
}
@Override
public List<Company> getAllCompany()
{
	return companyDao.findAll();
	
}
@Override
public List<StockExchange> getAllStock()
{
	return stockExchangeDao.findAll();
}

}
