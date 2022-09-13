package com.example.jpa.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Province {
  
	
	@Id
	
	private int provinceIds;
	private String provianceName;
	  

	public Province(int provinceIds, String provianceName) {
		super();
		this.provinceIds = provinceIds;
		this.provianceName = provianceName;
	}
	public Province() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProvinceIds() {
		return provinceIds;
	}
	public void setProvinceIds(int provinceIds) {
		this.provinceIds = provinceIds;
	}
	public String getProvianceName() {
		return provianceName;
	}
	public void setProvianceName(String provianceName) {
		this.provianceName = provianceName;
	}
	
	@Override
	public String toString() {
		return "Province [provinceIds=" + provinceIds + ", provianceName=" + provianceName + "]";
	}
	
	
	
}
