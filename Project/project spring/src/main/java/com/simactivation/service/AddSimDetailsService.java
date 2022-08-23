package com.simactivation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simactivation.entity.SimDetails;
import com.simactivation.entity.SimOffers;
import com.simactivation.repository.InitialsSimDetailsRepo;
import com.simactivation.repository.InitialsSimOffersRepo;

@Service
public class AddSimDetailsService {
	@Autowired
	InitialsSimDetailsRepo simDetailsRepo;
	
	@Autowired
	InitialsSimOffersRepo simOffersRepo;
	
	public void addSimDetails(SimDetails sd) {
		simDetailsRepo.saveAndFlush(sd);
	}

	public void addSimOffers(SimOffers so) {
		simOffersRepo.saveAndFlush(so);
	}
}
