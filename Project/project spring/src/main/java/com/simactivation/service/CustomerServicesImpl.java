package com.simactivation.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simactivation.dto.SimDetailsDTO;
import com.simactivation.entity.Customer;
import com.simactivation.repository.CustomerRepository;
import com.simactivation.repository.SimDetailsRepository;

@Service
public class CustomerServicesImpl implements CustomerServices{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private SimDetailsRepository simDetailsRepository;
	@Override
	public Customer verifycustomerbasicdetail(LocalDate dob, String emailid) {
		return customerRepository.findByDateOfBirthAndEmailAddress(dob, emailid);
	}
	@Override
	public Customer VerifyIdProof(String idNumber) {
		return customerRepository.findByUniqueIdNumber(idNumber);
	}
	@Override
	public SimDetailsDTO verifysimstatus(int simid) {
		return simDetailsRepository.verifysimstatus(simid);

		
	}
	@Override
	public void updatesimstatus(String status, int simid) {
		simDetailsRepository.updateSimStatus(status, simid);		
	}
	
}
