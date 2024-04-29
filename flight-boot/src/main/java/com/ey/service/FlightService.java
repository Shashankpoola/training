package com.ey.service;

import java.util.List;

import com.ey.entity.Flight;

public interface FlightService {
	
	int save(Flight f);
	
	Flight findByCode(int code);
	
	List<Flight> listAll();
	
	String remove(int code);
	
	List<Flight> listByCarrier(String carrier);
	
	List<Flight> listByRoute(String source, String destination);
	
}
