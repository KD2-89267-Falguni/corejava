package com.sunbeam;
import java.util.Scanner;
public class Invoicetest {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Invoice invoice=new Invoice();
	System.out.println("Enter the part number : ");
	invoice.setNumber(sc.nextLine());
	System.out.println("Enter the  description : ");
	invoice.setDescription(sc.nextLine());
	System.out.println("Enter the  quantity : ");
	invoice.setQuantity(sc.nextInt());
	System.out.println("Enter the price : ");
	invoice.setPrice(sc.nextDouble());
	System.out.println(" Generated invoice amount : ");
	
	
		
	//displaying
	System.out.println("partnumber= "+invoice.getNumber());
	System.out.println("description =" +invoice.getDescription());
	System.out.println("Quantity = "+invoice.getQuantity());{
		if(invoice.getQuantity()<0) {
			invoice.setQuantity(0);
		}
	}
	System.out.println("Price = "+invoice.getPrice());{
		if(invoice.getPrice()<0) {
			invoice.setPrice(0);
		}
	}
	System.out.println("total="+invoice.getPrice() * invoice.getQuantity());
	sc.close();

}

}
