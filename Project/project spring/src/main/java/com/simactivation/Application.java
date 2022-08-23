package com.simactivation;



import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.simactivation.entity.Customer;
import com.simactivation.entity.CustomerAddress;
import com.simactivation.entity.CustomerIdentity;
import com.simactivation.entity.SimDetails;
import com.simactivation.entity.SimOffers;
import com.simactivation.service.AddCustomerAddressService;
import com.simactivation.service.AddSimDetailsService;


//Spring Boot application's starter code
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);
		
		AddCustomerAddressService addCustomerAddress = ac.getBean(AddCustomerAddressService.class);
		AddSimDetailsService addSimDetails = ac.getBean(AddSimDetailsService.class);
		
		CustomerAddress customeAddress1 = new CustomerAddress("Jayanagar", "Bangalore", 560041, "Karnataka");
		CustomerAddress customeAddress2 = new CustomerAddress("Vijaynagar", "Mysore", 567017, "Karnataka");
	
		Customer customer1 = new Customer("1234567891234567",LocalDate.of(1990,12,12),"smith@abc.com","Smith", "John","Aadhar",1,"Karnataka");
		Customer customer2 = new Customer("1234567891234568",LocalDate.of(1998,12,12),"bob@abc.com","Bob", "Sam","Aadhar",2,"Karnataka");
		
		CustomerIdentity custId1 = new CustomerIdentity("1234567891234567", LocalDate.of(1990,12,12), "smith@abc.com","Smith", "John",  "Karnataka");
		CustomerIdentity custId2 = new CustomerIdentity("1234567891234568", LocalDate.of(1998,12,12), "bob@abc.com","Bob", "Sam", "Karnataka");
		
		SimDetails simDetails1 = new SimDetails("1234567891","1234567891234","active");
		SimDetails simDetails2 = new SimDetails("1234567892","1234567891235","inactive");
		
		SimOffers simOffers1 = new SimOffers(100,100,120,10,"Free calls and data",1);
		SimOffers simOffers2 = new SimOffers(150,50,100,15,"Free calls",2);
		
//		custId1.setCustomer(customer1);
//		simOffers1.setSimDetails(simDetails1);
		addSimDetails.addSimDetails(simDetails1);
		addSimDetails.addSimDetails(simDetails2);
		
		addSimDetails.addSimOffers(simOffers2);
		addSimDetails.addSimOffers(simOffers1);
			
		customer1.setCustAddress(customeAddress1);
		customer2.setCustAddress(customeAddress2);
		
//		customer1.setSimDetails(simDetails1);
//		customer2.setSimDetails(simDetails2);
		
		addCustomerAddress.addCustAddress(customeAddress1);
		
		addCustomerAddress.addCust(customer1);
		addCustomerAddress.addCust(customer2);
		
		addCustomerAddress.addCustIdentity(custId1);
		addCustomerAddress.addCustIdentity(custId2);
		
		
		
	
		
		
	}
}
	
