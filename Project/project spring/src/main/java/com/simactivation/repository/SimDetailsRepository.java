package com.simactivation.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.simactivation.dto.SimDetailsDTO;
import com.simactivation.entity.SimDetails;

@Repository
public interface SimDetailsRepository extends JpaRepository<SimDetails, Integer>{
	@Query("select s from SimDetails s where s.simNumber=?1 and s.serviceNumber=?2")
		SimDetails findBySimNumerAndServiceNumber(String simnumber,String servicenumber);
	
	@Transactional
	   @Modifying
	@Query(value = "update SimDetails set simStatus=?1 where simId=?2")
	public void updateSimStatus(String status,int simId);
	
	
	@Query("select s from SimDetails s where s.simId=?1 ")
	public SimDetailsDTO verifysimstatus(int simId);
	
}