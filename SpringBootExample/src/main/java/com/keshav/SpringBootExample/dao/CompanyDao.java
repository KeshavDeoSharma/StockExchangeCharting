
  package com.keshav.SpringBootExample.dao;
  
  
  
  import org.springframework.data.jpa.repository.JpaRepository; import
  org.springframework.stereotype.Repository;
  
  import com.keshav.SpringBootExample.model.*;
  
  @Repository 
  public interface CompanyDao extends JpaRepository<Company,Integer>{
  
 
  
  }
 