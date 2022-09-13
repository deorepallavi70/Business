package com.example.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.model.Country;

public interface countryRepo  extends JpaRepository<Country, Integer>{
	
	

}
