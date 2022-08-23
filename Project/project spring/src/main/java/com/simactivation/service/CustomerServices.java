package com.simactivation.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.simactivation.dto.SimDetailsDTO;
import com.simactivation.entity.Customer;

@Service
public interface CustomerServices {
	public Customer verifycustomerbasicdetail(LocalDate dob,String emailid);
	public Customer VerifyIdProof(String idNumber);
	public SimDetailsDTO verifysimstatus(int simId);
	public void updatesimstatus(String status,int simid);
	
}
