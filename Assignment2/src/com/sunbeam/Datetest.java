package com.sunbeam;
import java.util.Scanner;
public class Datetest {

	public static void main(String[] args) {
		Date d1=new Date();
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day");
        d1.setDay(sc.nextInt());
        System.out.println("Enter the Month");
        d1.setMonth(sc.nextInt());
        System.out.println("Enter the Year");
        d1.setYear(sc.nextInt());
        
       
            System.out.println("Date : " + d1.getMonth() + "/" + d1.getDay() + "/" + d1.getYear());
        



        
	}

}
