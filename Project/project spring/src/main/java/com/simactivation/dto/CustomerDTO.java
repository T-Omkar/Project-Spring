package com.simactivation.dto;

import java.time.LocalDate;

//Entity class that should be passed around for DB related operations

public class CustomerDTO 
{
	//Annotation that helps marking a field as the primary key
	
	
	private String uniqueIdNumber;
	private LocalDate dateOfBirth;
	private String emailAddress;
	private String firstName;
	private String lastName;
	private String idType;
	private CustomerAddressDTO custAddress;
	private Integer simId;
	private String state;
	
	public CustomerDTO(String uniqueIdNumber, LocalDate dateOfBirth, String emailAdress, String firstName, String lastName,
			String idType,Integer simId, String state) {
		super();
		this.uniqueIdNumber = uniqueIdNumber;
		this.dateOfBirth = dateOfBirth;
		this.emailAddress = emailAdress;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idType = idType;
		this.simId = simId;	
		this.state = state;
	}
	
	public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUniqueIdNumber() {
		return uniqueIdNumber;
	}
	public void setUniqueIdNumber(String uniqueIdNumber) {
		this.uniqueIdNumber = uniqueIdNumber;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public CustomerAddressDTO getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(CustomerAddressDTO custAddress) {
		this.custAddress = custAddress;
	}
	
	

	public Integer getSimId() {
		return simId;
	}

	public void setSimId(Integer simId) {
		this.simId = simId;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
	
	
	


	
}
