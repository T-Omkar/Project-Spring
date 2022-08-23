package com.simactivation.service;

import org.springframework.stereotype.Service;

import com.simactivation.dto.SimDetailsDTO;
import com.simactivation.entity.SimDetails;
import com.simactivation.entity.SimOffers;
@Service
public interface SimDetailsServices {	
	
	public SimDetails verificationservice(String simnumber, String servicenumber);
	public SimOffers getSimOfferDetails(int simid);
	public SimDetailsDTO getsimPlans(int simid);
}