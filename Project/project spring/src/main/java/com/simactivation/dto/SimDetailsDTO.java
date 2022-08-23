package com.simactivation.dto;



import com.simactivation.entity.SimDetails;


public class SimDetailsDTO {
	
	public Integer simId;
	private String serviceNumber;
	private String simNumber;
	private String simStatus;
	
	public Integer getSimId() {
		return simId;
	}
	public void setSimId(Integer simId) {
		this.simId = simId;
	}
	public String getServiceNumber() {
		return serviceNumber;
	}
	public void setServiceNumber(String serviceNumber) {
		this.serviceNumber = serviceNumber;
	}
	public String getSimNumber() {
		return simNumber;
	}
	public void setSimNumber(String simNumber) {
		this.simNumber = simNumber;
	}
	public String getSimStatus() {
		return simStatus;
	}
	public void setSimStatus(String simStatus) {
		this.simStatus = simStatus;
	}
	public SimDetailsDTO(String serviceNumber, String simNumber, String simStatus) {
		super();
		
		this.serviceNumber = serviceNumber;
		this.simNumber = simNumber;
		this.simStatus = simStatus;
	}
	public SimDetailsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static SimDetailsDTO valueOf(SimDetails plan) {

		SimDetailsDTO stDTO= new SimDetailsDTO();
		
		stDTO.setSimId(plan.getSimId());
		stDTO.setServiceNumber(plan.getServiceNumber());
		stDTO.setSimNumber(plan.getSimNumber());
		stDTO.setSimStatus(plan.getSimStatus());
		return stDTO;
	}
	
	
}
