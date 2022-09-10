package com.flightapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.entity.Admin;
import com.flightapp.repository.AdminRepo;

@Service
public class AdminValidateService {
	
	
	public String ValidateAdmin(String userName, String password) {
		
		if(userName=="admin"&& password=="admin@123") {
			return "welcome"+userName;
		}
		else {
			return "registerAdmin";
		}
		
	}

}
