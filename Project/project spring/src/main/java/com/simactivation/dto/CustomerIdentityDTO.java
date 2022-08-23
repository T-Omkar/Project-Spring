package com.simactivation.dto;

import java.time.LocalDate;

//import javax.xml.bind.annotation.XmlRootElement;



//Data Transfer Object that carries data from one layer to another


public class CustomerIdentityDTO 
{
//	@JoinColumn(name = "uniqueIdNumber")
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	private Customer customer;
	
	private String uniqueIdNumber;
	
	private LocalDate dateOfBirth;
	
	private String emailAddress;
	
	private String firstName;
	
	private String lastName;
	
	private String state;
	
	
public CustomerIdentityDTO(String uniqueIdNumber, LocalDate dateOfBirth, String emailAddress, String firstName,
			String lastName, String state) {
		super();
		this.uniqueIdNumber = uniqueIdNumber;
		this.dateOfBirth = dateOfBirth;
		this.emailAddress = emailAddress;
		this.firstName = firstName;
		this.lastName = lastName;
		this.state = state;
	}

	public CustomerIdentityDTO() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getUniqueIdNumber() {
		return uniqueIdNumber;
	}

	public void setUniqueIdNumber(String uniqueIdNumber) {
		this.uniqueIdNumber = uniqueIdNumber;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
