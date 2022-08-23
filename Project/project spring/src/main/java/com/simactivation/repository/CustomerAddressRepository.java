package com.simactivation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simactivation.entity.CustomerAddress;

@Repository
public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Integer>{

		//@Query(value = "select * from CustomerAddress where city=? and state=?")
		public CustomerAddress findByCityAndState(String city,String state);

}
