package com.flightapp.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleSpecificException(ResourceNotFoundException ex, WebRequest req) {
		ErrorDetails error= new ErrorDetails(new Date(), ex.getMessage(), req.getDescription(false));
		
		return new ResponseEntity(error, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleGlobalException(Exception ex, WebRequest req) {
		ErrorDetails error= new ErrorDetails(new Date(), ex.getMessage(), req.getDescription(false));
		
		return new ResponseEntity(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(APIException.class)
	public ResponseEntity<?> handleAPIException(APIException ex, WebRequest req) {
		ErrorDetails error= new ErrorDetails(new Date(), ex.getMessage(), req.getDescription(false));
		
		return new ResponseEntity(error, HttpStatus.NOT_FOUND);
	}
}
