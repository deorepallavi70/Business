package com.example.jpa.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.lang.NonNull;


@Entity
public class serviceProvider {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ServiceproviderId;
	private long contactNumber;
	private String email;
	
	@NonNull
	private String firstNmae;
	
	private String lastName;
	private String password;
	private  boolean enable2Factore;
	private  boolean  termPrivacyPolicy;
	
	@OneToMany(targetEntity = Country.class,cascade = CascadeType.ALL)
	@JoinColumn(name="service_product_fk",referencedColumnName = "ServiceproviderId")
	private List<Country> countries;
	
	@OneToMany(targetEntity = Province.class,cascade = CascadeType.ALL)
	@JoinColumn(name="service_product_fk",referencedColumnName = "ServiceproviderId")
	private List<Province> provinces;
	@OneToMany(targetEntity = Business_Type.class,cascade = CascadeType.ALL)
	@JoinColumn(name="service_product_fk",referencedColumnName = "ServiceproviderId")
	private List<Business_Type> business_Types;
	
	public serviceProvider() {
		super();
		// TODO Auto-generated constructor stub
	}

	public serviceProvider(int serviceproviderId, long contactNumber, String email, String firstNmae, String lastName,
			String password, boolean enable2Factore, boolean termPrivacyPolicy, List<Country> countries,
			List<Province> provinces, List<Business_Type> business_Types) {
		super();
		ServiceproviderId = serviceproviderId;
		this.contactNumber = contactNumber;
		this.email = email;
		this.firstNmae = firstNmae;
		this.lastName = lastName;
		this.password = password;
		this.enable2Factore = enable2Factore;
		this.termPrivacyPolicy = termPrivacyPolicy;
		this.countries = countries;
		this.provinces = provinces;
		this.business_Types = business_Types;
	}

	public int getServiceproviderId() {
		return ServiceproviderId;
	}

	public void setServiceproviderId(int serviceproviderId) {
		ServiceproviderId = serviceproviderId;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstNmae() {
		return firstNmae;
	}

	public void setFirstNmae(String firstNmae) {
		this.firstNmae = firstNmae;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnable2Factore() {
		return enable2Factore;
	}

	public void setEnable2Factore(boolean enable2Factore) {
		this.enable2Factore = enable2Factore;
	}

	public boolean isTermPrivacyPolicy() {
		return termPrivacyPolicy;
	}

	public void setTermPrivacyPolicy(boolean termPrivacyPolicy) {
		this.termPrivacyPolicy = termPrivacyPolicy;
	}

	public List<Country> getcountries() {
		return countries;
	}

	public void setcountries(List<Country> countries) {
		this.countries = countries;
	}

	public List<Province> getProvinces() {
		return provinces;
	}

	public void setProvinces(List<Province> provinces) {
		this.provinces = provinces;
	}

	public List<Business_Type> getBusiness_Types() {
		return business_Types;
	}

	public void setBusiness_Types(List<Business_Type> business_Types) {
		this.business_Types = business_Types;
	}
	

	
	
	

}
