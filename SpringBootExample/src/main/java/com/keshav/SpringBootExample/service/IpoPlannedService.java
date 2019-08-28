package com.keshav.SpringBootExample.service;

import java.util.List;

import com.keshav.SpringBootExample.model.Company;
import com.keshav.SpringBootExample.model.IpoPlanned;
import com.keshav.SpringBootExample.model.StockExchange;

public interface IpoPlannedService {

	List<IpoPlanned> getAllIpo();

	IpoPlanned insertipoPlanned(IpoPlanned ipoPlanned);

	List<Company> getAllCompany();

	List<StockExchange> getAllStock();

}