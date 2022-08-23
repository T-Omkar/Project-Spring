package com.simactivation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.simactivation.entity.SimDetails;

@Repository
public interface GetSimStatusRepository extends JpaRepository<SimDetails, Integer>{
	@Query("select s from SimDetails s where s.simId = ?1")
	public SimDetails findBySimId(int simid);
}