package com.ey.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ey.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
	
	Flight getByCode(int code);
	
	List<Flight> findAll();
	
	List<Flight> findByCarrier(String carrier);
	
	@Query("from Flight where source=:source and destination=:destination")
	List<Flight> findByRoute(String source, String destination);
	
}
