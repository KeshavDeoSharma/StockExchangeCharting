package com.keshav.SpringBootExample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sectors")
public class Sector {
@Override
	public String toString() {
		return "Sector [sectorid=" + sectorid + ", sectorname=" + sectorname + ", brief=" + brief + "]";
	}
@Id
@Column(name="id")
	private int sectorid;
@Column(name="sector_name")
	private String sectorname;
	private String brief;
	public Sector() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSectorid() {
		return sectorid;
	}
	public void setSectorid(int sectorid) {
		this.sectorid = sectorid;
	}
	public String getSectorname() {
		return sectorname;
	}
	public void setSectorname(String sectorname) {
		this.sectorname = sectorname;
	}
	
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public Sector(int sectorid, String sectorname, String brief) {
		super();
		this.sectorid = sectorid;
		this.sectorname = sectorname;
		this.brief = brief;
	}
	
	
	
	
}
