package com.flightapp.exception;

import java.util.Date;

public class ErrorDetails {
	
private Date date;
private String errorMessage;
private String details;


public ErrorDetails(Date date, String errorMessage, String details) {
	super();
	this.date = date;
	this.errorMessage = errorMessage;
	this.details = details;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getErrorMessage() {
	return errorMessage;
}
public void setErrorMessage(String errorMessage) {
	this.errorMessage = errorMessage;
}
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}



}
