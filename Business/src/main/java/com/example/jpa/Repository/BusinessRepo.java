package com.example.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.model.Business_Type;

public interface BusinessRepo extends JpaRepository<Business_Type, String> {

}
