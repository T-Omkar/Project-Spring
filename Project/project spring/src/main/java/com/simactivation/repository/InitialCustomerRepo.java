package com.simactivation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simactivation.entity.Customer;

public interface InitialCustomerRepo extends JpaRepository<Customer, Long>{

}
