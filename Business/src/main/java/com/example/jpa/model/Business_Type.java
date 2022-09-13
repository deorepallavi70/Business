package com.example.jpa.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Business_Type {
	@Id

	private int businessTypeIds;
	private String businessName;
	  

	public Business_Type(int businessTypeIds, String businessName) {
		super();
		this.businessTypeIds = businessTypeIds;
		this.businessName = businessName;
		
	}

	

	public Business_Type() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
 public int getBusinessTypeIds() {
		return businessTypeIds;
	}

     public void setBusinessTypeIds(int businessTypeIds) {
		this.businessTypeIds = businessTypeIds;
	}


     public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}


@Override
	public String toString() {
		return "Business_Type [businessName=" + businessName + ", businessTypeIds=" + businessTypeIds + "]";
	}
	
	
	

}
