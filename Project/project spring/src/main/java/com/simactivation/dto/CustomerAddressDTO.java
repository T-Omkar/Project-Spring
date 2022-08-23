package com.simactivation.dto;

public class CustomerAddressDTO {
	private int addressId;
	
	private String address;

	private String city;
	
	private int pinCode;
	
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
	public CustomerAddressDTO(String address, String city, int pinCode, String state) {
		super();
		this.address = address;
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
	}
	public CustomerAddressDTO() {
		super();
		
	}
}
