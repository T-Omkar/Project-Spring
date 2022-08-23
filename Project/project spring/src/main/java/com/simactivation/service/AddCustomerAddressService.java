package com.simactivation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simactivation.entity.Customer;
import com.simactivation.entity.CustomerAddress;
import com.simactivation.entity.CustomerIdentity;
import com.simactivation.repository.InitialCustomerAddressRepo;
import com.simactivation.repository.InitialCustomerIdentityRepo;
import com.simactivation.repository.InitialCustomerRepo;
@Service
public class AddCustomerAddressService {
	@Autowired
	InitialCustomerAddressRepo custaddressrepo;
	
	@Autowired
	InitialCustomerRepo custerepo;
	
	@Autowired
	InitialCustomerIdentityRepo custindentityrepo;
	
	public void addCustAddress(CustomerAddress ad) {
		custaddressrepo.saveAndFlush(ad);
	}
	public void addCust(Customer cust) {
		
		custerepo.saveAndFlush(cust);
		
	}
	public void addCustIdentity(CustomerIdentity custidentity) {
		custindentityrepo.saveAndFlush(custidentity);
	}
	
}
