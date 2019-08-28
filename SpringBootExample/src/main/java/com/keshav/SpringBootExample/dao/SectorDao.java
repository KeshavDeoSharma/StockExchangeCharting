
  package com.keshav.SpringBootExample.dao;
  
  import org.springframework.data.jpa.repository.JpaRepository;
  
  import com.keshav.SpringBootExample.model.Sector;
  
  public interface SectorDao extends JpaRepository<Sector, Integer> {
  
  }
 