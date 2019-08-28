package com.keshav.SpringBootExample.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {
@Id
@Column(name="company_code")
	private int companyId; 

	private String boardofdirectors;
	
	@Column(name="sector_id")
	private int  sectorid;
	
	private BigDecimal turnover;
	private String ceo;
	@Column(name="breifwriteup")
	private String breifwriteup;
	private int stock_code;
	@Column(name="company_Name")
	private String companyname;
	private String active;
	
	
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public int getSectorid() {
		return sectorid;
	}
	public void setSectorid(int sectorid) {
		this.sectorid = sectorid;
	}
	
	public String getBoardofdirectors() {
		return boardofdirectors;
	}
	public void setBoardofdirectors(String boardofdirectors) {
		this.boardofdirectors = boardofdirectors;
	}
	public BigDecimal getTurnover() {
		return turnover;
	}
	public void setTurnover(BigDecimal turnover) {
		this.turnover = turnover;
	}
	
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	
	
	public String getBreifwriteup() {
		return breifwriteup;
	}
	public void setBreifwriteup(String breifwriteup) {
		this.breifwriteup = breifwriteup;
	}
	public int getStock_code() {
		return stock_code;
	}
	public void setStock_code(int stock_code) {
		this.stock_code = stock_code;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getBoardOfDirectors() {
		return boardofdirectors;
	}
	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardofdirectors = boardOfDirectors;
	}
	public String toString(){
		return "id:"+this.getCompanyId()+" directors:"+this.getBoardOfDirectors();
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(int companyId, String boardofdirectors, int sectorid, BigDecimal turnover, String ceo,
			String breifwriteup, int stock_code, String companyname, String active) {
		super();
		this.companyId = companyId;
		this.boardofdirectors = boardofdirectors;
		this.sectorid = sectorid;
		this.turnover = turnover;
		this.ceo = ceo;
		this.breifwriteup = breifwriteup;
		this.stock_code = stock_code;
		this.companyname = companyname;
		this.active = active;
	}
		
}
