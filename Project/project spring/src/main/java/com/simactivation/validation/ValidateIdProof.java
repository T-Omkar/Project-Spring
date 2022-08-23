package com.simactivation.validation;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

public class ValidateIdProof {
	@NotNull
	@Pattern(regexp = "[0-9]{16}",message = "Id should be 16 digit")
	private String idNumber;
	@NotNull
	private String firstname;
	@NotNull
	private String lastname;
	@DateTimeFormat(pattern = "yyyy-dd-mm")
	private LocalDate dobDate;
	
	
	public ValidateIdProof(@NotNull @Pattern(regexp = "[0-9]{16}", message = "Id should be 16 digit") String idNumber,
			@NotNull String firstname, @NotNull String lastname, LocalDate dobDate) {
		super();
		this.idNumber = idNumber;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dobDate = dobDate;
	}
	@Override	
	public String toString() {
		return "ValidateIdProof [idNumber=" + idNumber + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", dobDate=" + dobDate + "]";
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public LocalDate getDobDate() {
		return dobDate;
	}
	public void setDobDate(LocalDate dobDate) {
		this.dobDate = dobDate;
	}
	public ValidateIdProof() {
//		super();
		// TODO Auto-generated constructor stub
	}
	
}