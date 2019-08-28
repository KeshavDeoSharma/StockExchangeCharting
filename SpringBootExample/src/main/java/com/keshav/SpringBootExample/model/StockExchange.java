package com.keshav.SpringBootExample.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stockexchange")
public class StockExchange {
	@Override
	public String toString() {
		return "StockExchange [stockExchangeid=" + stockExchangeid + ", stockExchangeName=" + stockExchangeName
				+ ", brief=" + brief + ", contactAddress=" + contactAddress + ", remarks=" + remarks + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="stockexchange_id")
	private int stockExchangeid;
	@Column(name="stock_exchange_name")// this column will be used now
	private String stockExchangeName;
	private String brief;
	@Column(name="contactaddress")
	private String contactAddress;
	private String remarks;
	public int getStockExchangeid() {
		return stockExchangeid;
	}
	public void setStockExchangeid(int stockExchangeid) {
		this.stockExchangeid = stockExchangeid;
	}
	public String getStockExchangeName() {
		return stockExchangeName;
	}
	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public StockExchange() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StockExchange(int stockExchangeid, String stockExchangeName, String brief, String contactAddress,
			String remarks) {
		super();
		this.stockExchangeid = stockExchangeid;
		this.stockExchangeName = stockExchangeName;
		this.brief = brief;
		this.contactAddress = contactAddress;
		this.remarks = remarks;
	}


}
