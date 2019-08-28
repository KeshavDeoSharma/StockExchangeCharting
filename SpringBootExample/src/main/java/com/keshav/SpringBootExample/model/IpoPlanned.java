package com.keshav.SpringBootExample.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="ipo_planned")
public class IpoPlanned {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="company_code")
	private int companyId;
@Column(name="stock_exchange")
	private int stockExchangeid;
@Column(name="price_per_share",precision = 10, scale = 0)
private BigDecimal pricePerShare;
@Column(name="total_no_of_shares")
	private int totalNoShares;
@Column(name="open_date_time")
	private Date openDate;
	private String remarks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCompanyId() {
		return companyId;
	}
	
	
	public int getStockExchangeid() {
		return stockExchangeid;
	}
	public void setStockExchangeid(int stockExchangeid) {
		this.stockExchangeid = stockExchangeid;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public BigDecimal getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(BigDecimal pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public int getTotalNoShares() {
		return totalNoShares;
	}
	public void setTotalNoShares(int totalNoShares) {
		this.totalNoShares = totalNoShares;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public IpoPlanned(int id, int companyId, int stockExchangeid, BigDecimal pricePerShare, int totalNoShares,
			Date openDate, String remarks) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.stockExchangeid = stockExchangeid;
		this.pricePerShare = pricePerShare;
		this.totalNoShares = totalNoShares;
		this.openDate = openDate;
		this.remarks = remarks;
	}
	public IpoPlanned() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
