package com.flightapp.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.flightapp.entity.Admin;

@SpringBootTest
public class AdminValidationServiceTest {
	
	@Autowired
	private AdminValidateService service;
	
	@Test
	public void validateAdminWithUNamePass() {
		String login= service.ValidateAdmin("admin", "admin@123");
		
		Assertions.assertEquals("welcomeadmin", login);
	}
	@Test
	public void validateAdmin() {
		String login= service.ValidateAdmin("xyz", "xyz@123");
				Assertions.assertEquals("registerAdmin", login);
	}

}
