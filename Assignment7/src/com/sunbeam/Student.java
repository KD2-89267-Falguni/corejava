package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Student {
	private int roll;
	 private String name;
	 private String city;
	 private double marks;
	 
	 public Student() {}
	 
	public Student(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {
		Student [] arr=new Student[3];
		arr[0]= new Student(1,"Falguni","Bhopal",12);
		arr[1]= new Student(3,"Sallubhai","Agra",15);
		arr[2]= new Student(4,"Kallubhai","Karad",13);
		
		class CustomComparator implements Comparator<Student>{

			@Override
			public int compare(Student s1, Student s2) {			
				int diff=s2.getCity().compareTo(s1.getCity());
				//return diff;	
				if(diff==0) 
				diff=(int) (s2.getMarks()-s1.getMarks());
				//return diff;
				if(diff==0)
					diff=s1.getName().compareTo(s2.getName());
				     return diff;
			}
		}
				     
				     Arrays.sort(arr, new CustomComparator());
						
						System.out.println("Sorted : ");
						for (int i = 0; i < arr.length; i++) {
							System.out.println(arr[i]);
						}

			
		}
		}
	

				     
					

		
		
		
		
	
	



