package com.simactivation.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.simactivation.entity.CustomerAddress;

@Repository
public interface AddCustomerAddressRepository extends JpaRepository<CustomerAddress, Integer>{
	@Transactional
	   @Modifying
		@Query(value = "INSERT into customeraddress(pincode,address,city,state) values (?1,?2,?3,?4)", nativeQuery = true)
		public void InsertCustomerAddress(long pincode,String add,String city,String state);

}
