package com.firstspringboot.springbootfirst;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BusinessMasterRepository extends JpaRepository<Business, Integer>{

    Business findBusinessById(Integer business_id);
    List<Business> findAll();

}



