package com.example.jpa.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.model.Province;

public interface ProvinceRepo  extends  JpaRepository<Province, Integer>{

}
