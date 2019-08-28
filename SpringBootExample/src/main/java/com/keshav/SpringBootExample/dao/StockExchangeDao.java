package com.keshav.SpringBootExample.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keshav.SpringBootExample.model.StockExchange;

public interface StockExchangeDao extends JpaRepository<StockExchange,Integer> {

}
