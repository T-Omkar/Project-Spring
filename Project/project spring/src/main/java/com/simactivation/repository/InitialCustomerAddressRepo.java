package com.simactivation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simactivation.entity.CustomerAddress;

public interface InitialCustomerAddressRepo extends JpaRepository<CustomerAddress, Integer>{
	
	

}
