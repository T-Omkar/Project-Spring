package com.simactivation.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SimDetails {
	@Override
	public String toString() {
		return "SimDetails [simId=" + simId + ", serviceNumber=" + serviceNumber + ", simNumber=" + simNumber
				+ ", simStatus=" + simStatus + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer simId;
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
	public SimDetails(String serviceNumber, String simNumber, String simStatus) {
		super();
		
		this.serviceNumber = serviceNumber;
		this.simNumber = simNumber;
		this.simStatus = simStatus;
	}
	
	public SimDetails(String serviceNumber, String simNumber) {
		super();
		this.serviceNumber = serviceNumber;
		this.simNumber = simNumber;
	}
	public SimDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(serviceNumber, simId, simNumber, simStatus);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimDetails other = (SimDetails) obj;
		return Objects.equals(serviceNumber, other.serviceNumber) && Objects.equals(simId, other.simId)
				&& Objects.equals(simNumber, other.simNumber) && Objects.equals(simStatus, other.simStatus);
	}
	
	
	
}
