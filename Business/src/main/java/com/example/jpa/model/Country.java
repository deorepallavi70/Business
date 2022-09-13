package com.example.jpa.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Country {
	@Id
	
	private int countryId;
	
	private String countryName;
  
   
   @OneToMany(targetEntity = serviceProvider.class,cascade = CascadeType.ALL)
   @JoinColumn(name="fk_country_id",referencedColumnName = "countryId"  )
	private List<serviceProvider>  serviceprovider;


public Country(int countryId, String countryName, List<serviceProvider> serviceprovider) {
	super();
	this.countryId = countryId;
	this.countryName = countryName;
	this.serviceprovider = serviceprovider;
}


public int getCountryId() {
	return countryId;
}


public void setCountryId(int countryId) {
	this.countryId = countryId;
}


public String getCountryName() {
	return countryName;
}


public void setCountryName(String countryName) {
	this.countryName = countryName;
}


public List<serviceProvider> getServiceprovider() {
	return serviceprovider;
}


public void setServiceprovider(List<serviceProvider> serviceprovider) {
	this.serviceprovider = serviceprovider;
}
   
  
	
	

}
