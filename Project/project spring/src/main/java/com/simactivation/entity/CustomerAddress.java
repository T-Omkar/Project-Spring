package com.simactivation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerAddress {
	@Id
	@Column(name = "addressId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	@Column(name = "address")
	private String address;
	@Column(name = "city")
	private String city;
	@Column(name = "pinCode")
	private int pinCode;
	@Column(name = "state")
	private String state;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "CustomerAddressDTO [addressId=" + addressId + ", address=" + address + ", city=" + city + ", pinCode="
				+ pinCode + ", state=" + state + "]";
	}
	public CustomerAddress(String address, String city, int pinCode, String state) {
		super();
		this.address = address;
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
	}
	public CustomerAddress() {
		super();
		
	}
}
