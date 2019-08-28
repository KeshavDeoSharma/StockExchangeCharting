package com.keshav.SpringBootExample.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keshav.SpringBootExample.model.Register;

@Repository
public interface RegisterDao extends JpaRepository<Register, Integer> {

	Register findByUsername(String name);
}
