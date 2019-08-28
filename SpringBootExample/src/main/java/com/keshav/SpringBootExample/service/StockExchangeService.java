package com.keshav.SpringBootExample.service;

import java.util.List;

import com.keshav.SpringBootExample.model.StockExchange;

public interface StockExchangeService {
	public List<StockExchange> getAllStockExchange();
	public StockExchange insertStockExchange(StockExchange stockExchange);

}