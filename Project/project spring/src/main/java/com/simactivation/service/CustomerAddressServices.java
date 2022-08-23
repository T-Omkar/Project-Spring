package com.simactivation.service;

import org.springframework.stereotype.Service;

@Service
public interface CustomerAddressServices {
	public String updationCustomerAddress(int pincode,String add,String city,String State);
}
