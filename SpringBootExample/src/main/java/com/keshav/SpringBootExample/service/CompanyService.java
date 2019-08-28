
  package com.keshav.SpringBootExample.service;
  
  import java.sql.SQLException; import java.util.List;
  
  import com.keshav.SpringBootExample.model.*;
  
  public interface CompanyService {
  
  
  //public Company insertCompany(Company company) throws SQLException; public
 // Company updateCompany(Company company); 
  public List<Company> getCompanyList()
  throws SQLException; 
  public Company insertCompany(Company company);
  public List<Sector> getSectorList();
  public Company getCompanyById(int id);
public Company getUpdateCompany(Company company);
public void deleteCompany(int companyId);
  }
 