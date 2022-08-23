package com.simactivation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simactivation.dto.SimDetailsDTO;
import com.simactivation.entity.SimDetails;
import com.simactivation.entity.SimOffers;
import com.simactivation.repository.GetSimStatusRepository;
import com.simactivation.repository.SimDetailsRepository;
import com.simactivation.repository.SimOffersRepository;

@Service
public class SimDetailsServicesImpl implements SimDetailsServices{

	@Autowired
	public SimDetailsRepository simDetailsRepository;
	@Autowired
	public SimOffersRepository simOffersRepository;
	@Autowired
	public GetSimStatusRepository getSimStatisRepository;
	@Override
	public SimDetails verificationservice(String simnumber, String servicenumber)
	{
		return simDetailsRepository.findBySimNumerAndServiceNumber(simnumber, servicenumber);	
	}

	@Override
	public SimOffers getSimOfferDetails(int simid) {
		return  simOffersRepository.findBySimid(simid);
	}

	@Override
	public SimDetailsDTO getsimPlans(int simid) {
		return SimDetailsDTO.valueOf(getSimStatisRepository.findBySimId(simid));
	}
	
}