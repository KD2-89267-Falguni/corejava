package com.sunbeam;

import java.util.Scanner;

public class Invoice {
 private String number;
private  String description;
private int quantity;
private double price;
private double total;


public Invoice() {}
public Invoice(String number, String description, int quantity, double price) {
	this.number = number;
	this.description = description;
	this.quantity = quantity;
	this.price = price;}

public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}

}









