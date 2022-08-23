package com.simactivation.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//import javax.xml.bind.annotation.XmlRootElement;



//Data Transfer Object that carries data from one layer to another

@Entity
public class CustomerIdentity 
{
//	@JoinColumn(name = "uniqueIdNumber")
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	private Customer customer;
	@Id
	@Column(name = "uniqueIdNumber")
	private String uniqueIdNumber;
	@Column(name = "dateOfBirth")
	private LocalDate dateOfBirth;
	@Column(name = "emailAdress")
	private String emailAddress;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "state")
	private String state;
	
	
public CustomerIdentity(String uniqueIdNumber, LocalDate dateOfBirth, String emailAdress, String firstName,
			String lastName, String state) {
		super();
		this.uniqueIdNumber = uniqueIdNumber;
		this.dateOfBirth = dateOfBirth;
		this.emailAddress = emailAdress;
		this.firstName = firstName;
		this.lastName = lastName;
		this.state = state;
	}
//	public CustomerIdentity(LocalDate dateOfBirth, String emailAdress, String firstName,
//			String lastName, String state) {
//		super();
//		this.dateOfBirth = dateOfBirth;
//		this.emailAdress = emailAdress;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.state = state;
//	}
	public CustomerIdentity() {
		super();
		// TODO Auto-generated constructor stub
	}
//	public Customer getCustomer() {
//		return customer;
//	}
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public String getUniqueIdNumber() {
		return uniqueIdNumber;
	}
	public void setUniqueIdNumber(String uniqueIdNumber) {
		this.uniqueIdNumber = uniqueIdNumber;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAdress) {
		this.emailAddress = emailAdress;
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
