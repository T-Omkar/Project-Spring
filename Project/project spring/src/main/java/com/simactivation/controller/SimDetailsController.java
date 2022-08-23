package com.simactivation.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simactivation.dto.SimDetailsDTO;
import com.simactivation.entity.SimDetails;
import com.simactivation.entity.SimOffers;
import com.simactivation.service.SimDetailsServices;
import com.simactivation.validation.ValidateSimDetail;



@RestController
@RequestMapping("/sim")
@Validated
public class SimDetailsController {
	
	
	
	@Autowired
	private SimDetailsServices simDetailsServices;
	
	
	
	@PostMapping(value = "/validate")
	public ResponseEntity<String> validateCustomer(@Valid @RequestBody ValidateSimDetail validateCustomer) 
	{

		  
		  SimDetails simdetails1 = simDetailsServices.verificationservice(validateCustomer.getSimnumber(), validateCustomer.getServicenumber());
		
		  
		  
		  
		  
		  if(simdetails1 == null)
				return ResponseEntity.ok("not available");
			else {
				String simStatus = simdetails1.getSimStatus();
				
				if(simStatus.equals("active") ) {
					
					return ResponseEntity.ok("SIM Already Active");}
				else {
				SimOffers simOffers= simDetailsServices.getSimOfferDetails(simdetails1.getSimId());
				return ResponseEntity.ok(simOffers.getOfferName());
			}
			}
		 

		
	}
		
	
	@GetMapping(value = "/simdetailsof/{simId}")
	public SimDetailsDTO getsimdetails(@PathVariable Integer simId)
	{
		
			return simDetailsServices.getsimPlans(simId);
			
	}
	
}
