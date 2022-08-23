package com.simactivation.service;

import org.springframework.stereotype.Service;

import com.simactivation.entity.CustomerIdentity;

@Service
public interface CustomerIdentityServices {
	public CustomerIdentity verificationCustomerIdentity (String firstname,String lastname) ;
}	