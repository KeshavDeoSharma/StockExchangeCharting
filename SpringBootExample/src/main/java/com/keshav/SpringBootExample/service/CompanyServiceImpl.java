
  package com.keshav.SpringBootExample.service;
  
  import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.keshav.SpringBootExample.dao.CompanyDao;
import com.keshav.SpringBootExample.dao.SectorDao;
import com.keshav.SpringBootExample.model.Company;
import com.keshav.SpringBootExample.model.Sector;
  
  @Service public class CompanyServiceImpl implements CompanyService {
  
  @Autowired
  private CompanyDao companyDao;
  
  @Autowired
  private SectorDao sectorDao;
  
  
  
  @Override
public List<Company> getCompanyList() throws SQLException {
	  return companyDao.findAll(); }
  
  @Override
  public Company insertCompany(Company company) {
  
  return companyDao.save(company);
  }

@Override
public List<Sector> getSectorList() {
	
	return sectorDao.findAll();
}
@Override
public Company getCompanyById(int id) {
	return companyDao.getOne(id);
}
@Override
public Company getUpdateCompany(Company company)
{
	return companyDao.saveAndFlush(company);
}
@Override
public void deleteCompany(int companyId)
{
	companyDao.deleteById(companyId);
}
  }
 