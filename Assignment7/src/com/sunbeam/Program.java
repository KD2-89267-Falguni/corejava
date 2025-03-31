package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		try {
			MyString s1 = new MyString( ); 
			s1.setMessage("hieeeeeeeeee");	
			System.out.println("String : " + s1.getMessage());
		}
		catch (ExceptionLineTooLong e) {
			System.out.println("Field : "+e.getInvalidField()); //catches the feild where incorrect value is given
			System.out.println("Value : " + e.getInvalidValue());  //catches the incorrect value
			System.out.println("Message : "+e.getMessage());     //generates the message with incorrect feild value
		}

	}

}
