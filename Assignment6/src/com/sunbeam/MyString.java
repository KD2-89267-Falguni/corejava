package com.sunbeam;

public class MyString {
private String message;
private int messagelength; 

public MyString() {}

public MyString(String message) {
	this.message = message;
	this.messagelength = message.length();
}
public String getMessage() {
	return message;
}

public void setMessage(String string)throws ExceptionLineTooLong {
	
		if(string.length() >10) {
			throw new ExceptionLineTooLong("message",string);
			}
		this.message=string;
		this.messagelength=message.length();
		
	
}

@Override
public String toString() {
	return "String[message =" +message+"]";
}




















}
