package com.simactivation.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simactivation.service.CustomerAddressServices;
import com.simactivation.validation.ValidateUpdateDetail;

@RestController
@RequestMapping("/customer/update")
@Valid

// ON BASIS OF CITY AND STATE: NEED IMPROVEMENT: REPLACE WITH UIDN 
public class UpdateCustomerDetailsController {
	@Autowired
	private CustomerAddressServices customerAddressServices;
	
	@PutMapping(value = "/validate")
	public ResponseEntity<String> validateAddreessDetails
	(@Valid @RequestBody ValidateUpdateDetail vpd)
	{
		String message  = customerAddressServices.updationCustomerAddress(
				(int) vpd.getPincode(), vpd.getAddress(), vpd.getCity(), vpd.getState());
		return ResponseEntity.ok(message);
	}
}
