package com.flightapp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController

public class AirlinesController {

	
	@GetMapping(value="/allAirlines", produces= {MediaType.APPLICATION_JSON_VALUE})
		public List<String> getAllAirlines(){
			return Arrays.asList("Vistara","Indigo","Jetways");
		}
	}

