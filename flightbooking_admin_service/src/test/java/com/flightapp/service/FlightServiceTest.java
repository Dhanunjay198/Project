package com.flightapp.service;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.flightapp.entity.Flight;
import com.flightapp.repository.AirlineRepo;
import com.flightapp.repository.FlightRepo;

@SpringBootTest
public class FlightServiceTest {
	
	@Mock
	private FlightRepo flightRepo;
	@Mock
	private AirlineRepo airlineRepo;
	
	private FlightServiceImpl flightService;
	
	@BeforeEach
	void setUp() {
	   this.flightService=new FlightServiceImpl(this.flightRepo,this.airlineRepo);
	}
	
   @Test
   void getFlight() {
	   flightService.getFlight(1L);
	   verify(flightRepo).findById(1L);
   }
   
   @Test
   void getAllFlights() {
	   flightService.getAllFlights();
	   verify(flightRepo).findAll();
   }
   
   @Test
   void deleteFlight() {
		doNothing().when(flightRepo).deleteById(1L);
		flightService.deleteFlight(1L);
		verify(flightRepo).deleteById(1L);
   }

}
