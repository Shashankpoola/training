package com.ey.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.ey.entity.Flight;
import com.ey.exception.InvalidFlightException;
import com.ey.service.FlightService;

@CrossOrigin
@RestController
public class FlightController {
	@Autowired
	private FlightService service;

	@PostMapping(value = "/add", consumes = "application/json")
	public String add(@RequestBody Flight f) {
		try {
			int code = service.save(f);
			return "Flight added with code  " + code;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
		
		

	}
	@GetMapping(value = "/find/{code}", produces = "application/json" )
	public Flight getByCode(@PathVariable int code){
		
		try {
			return service.findByCode(code);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,e.getMessage());
		
		}
		
	}
	@GetMapping(value = "/listCarrier/{carrier}", produces = "application/json")
	public List<Flight> listByCarrierFlights(@PathVariable String carrier) {
		return service.listByCarrier(carrier);
	}

	@GetMapping(value = "/listAll", produces = "application/json")
	public List<Flight> listAll() {
		return service.listAll();

	}

	@DeleteMapping(value = "/delete", produces = "application/json")
	public String removeFlight(@RequestParam int code) {
		service.remove(code);
		return "flight removed successfully";
	}
	@GetMapping(value = "/listByRoute", produces = "application/json")
	public List<Flight> listByRoute(@RequestParam String source, String destination) {
		return service.listByRoute(source, destination);

	}

}
