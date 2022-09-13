package com.example.jpa.controller;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.jpa.Repository.seriviceproviderRepo;
//import com.example.jpa.model.UserDetails;
import com.example.jpa.model.serviceProvider;

@RestController
public class SeriviceController {
	
	
	
	@Autowired
	private seriviceproviderRepo SeriviceproviderRepo;
	
	
	@PostMapping("/addserviceProvider")
	public serviceProvider addUser(@RequestBody serviceProvider  serviceProvider) {
		
		return SeriviceproviderRepo.save(serviceProvider);
		
	}
	
	
	
	
	

}
