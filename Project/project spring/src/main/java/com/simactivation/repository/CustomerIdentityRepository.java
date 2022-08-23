package com.simactivation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simactivation.entity.CustomerIdentity;

@Repository
public interface CustomerIdentityRepository extends JpaRepository<CustomerIdentity, Long>{
	
	public CustomerIdentity findByFirstNameAndLastName(String firstname,String lastname);
}

