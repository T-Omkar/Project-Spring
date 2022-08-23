package com.simactivation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simactivation.entity.SimOffers;

@Repository
public interface SimOffersRepository extends JpaRepository<SimOffers, Integer> {
	//@Query("select * from SimOffers where Simid = ?1")
	public SimOffers findBySimid(int simid);
}