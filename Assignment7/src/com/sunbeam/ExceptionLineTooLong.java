package com.sunbeam;

public class ExceptionLineTooLong extends Exception {
	private String invalidField; 
	private String invalidValue;
	
	public ExceptionLineTooLong() {}
	
	public ExceptionLineTooLong(String field,String value){
		this.invalidField = field;
		this.invalidValue = value;
	}
	
	public String getInvalidField() {
		return invalidField;
	}
	public void setInvalidField(String invalidField) {
		this.invalidField = invalidField;
	}
	public String getInvalidValue() {
		return invalidValue;
	}
	public void setInvalidValue(String invalidValue) {
		this.invalidValue = invalidValue;
	}

	@Override
	public java.lang.String getMessage() {
		//return null;
		return String.format("%s = %d",invalidField,invalidValue);
	}
	 
	
	

	
	
	
	
}
