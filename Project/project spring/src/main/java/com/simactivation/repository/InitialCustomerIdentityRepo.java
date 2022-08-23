package com.simactivation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simactivation.entity.CustomerIdentity;

public interface InitialCustomerIdentityRepo extends JpaRepository<CustomerIdentity, Long> {

}
