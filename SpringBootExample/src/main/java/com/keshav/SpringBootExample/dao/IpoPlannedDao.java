package com.keshav.SpringBootExample.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keshav.SpringBootExample.model.IpoPlanned;

@Repository
public interface IpoPlannedDao extends JpaRepository<IpoPlanned,Integer> {

}
