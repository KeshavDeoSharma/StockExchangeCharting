package com.keshav.SpringBootExample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.keshav.SpringBootExample.dao.StockExchangeDao;
import com.keshav.SpringBootExample.model.StockExchange;
@Service
public class StockExchangeServiceImpl implements StockExchangeService {
	@Autowired
	StockExchangeDao stockExchangeDao;
	public List<StockExchange> getAllStockExchange()
	{
	return ((JpaRepository<StockExchange, Integer>) stockExchangeDao).findAll();
	}
	public StockExchange insertStockExchange(StockExchange stockExchange)
	{
		return ((JpaRepository<StockExchange, Integer>) stockExchangeDao).save(stockExchange);
	}


}
