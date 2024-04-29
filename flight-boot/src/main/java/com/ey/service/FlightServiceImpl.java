package com.ey.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ey.entity.Flight;
import com.ey.exception.InvalidFlightException;
import com.ey.repo.FlightRepository;
@Service
public class FlightServiceImpl implements FlightService {
	
	@Autowired
	private FlightRepository flight;
	
	
	@Override
	@Transactional(value =  TxType.REQUIRED)
	public int save(Flight f) {
		if(flight.findById(f.getCode())==null)
			return flight.save(f).getCode();
		throw new InvalidFlightException("flight already exists: " + f.getCode()); 
		
	}

	@Override
	public Flight findByCode(int code) {
		
//		return flight.getById(code);
		
		return flight.findById(code).orElseThrow(() -> new InvalidFlightException("invalid flight with no:" + code));
	}

	@Override
	public List<Flight> listAll() {
		return flight.findAll();
	}

	@Override
	public String remove(int code) {
		flight.deleteById(code);
		return "flight deleted successfully";
	}

	@Override
	public List<Flight> listByCarrier(String carrier) {
		
		return flight.findByCarrier(carrier);
	}

	@Override
	public List<Flight> listByRoute(String source, String destination) {	
		
		return flight.findByRoute(source, destination);
	}

}
