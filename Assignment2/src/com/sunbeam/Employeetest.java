package com.sunbeam;

import java.util.Scanner;

public class Employeetest {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Employee e1= new Employee();
    Employee e2= new Employee();

    System.out.println("yearly name and salary for e1");
    System.out.println("Enter the First Name : ");
    e1.setFirstname(sc.next());
    System.out.println("Enter the Last Name : ");
    e1.setLastname(sc.next());
    System.out.println("Enter the Yearly Salary : ");
    e1.setSalary(sc.nextDouble());
    
    //display
    
    System.out.println("First Name : " +e1.getFirstname());
    System.out.println("Last Name : " +e1.getLastname());
    System.out.println("Yearly Salary : " +e1.getSalary());
    
    System.out.println("yearly name and salary for e2");
 
    System.out.println("Enter the First Name : ");
    e2.setFirstname(sc.next());
    System.out.println("Enter the Last Name : ");
    e2.setLastname(sc.next());
    System.out.println("Enter the Yearly Salary : ");
    e2.setSalary(sc.nextDouble());
    
    //display
    
    System.out.println("First Name : " +e2.getFirstname());
    System.out.println("Last Name : " +e2.getLastname());
    System.out.println("Yearly Salary : " +e2.getSalary());
        
    System.out.println("Updated Salary");
    System.out.println("First Name : " +e1.getFirstname());
    System.out.println("Last Name : " +e1.getLastname());
    System.out.println(" Salary for e1 : " +e1.getSalary()*1.1);
    System.out.println("First Name : " +e2.getFirstname());
    System.out.println("Last Name : " +e2.getLastname());
    System.out.println("Salary for e2 : " +e2.getSalary()*1.1);
    
    sc.close();
    
    

    
	}

}
