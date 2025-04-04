package com.sunbeam;

import java.util.Objects;

public class Book implements Comparable<Book> {
	private String isbn;
	private String authorName;
	private int quantity;
	private double price;

	public Book() {
	}

	public Book(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.authorName = authorName;
		this.quantity = quantity;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public String getAuthorName() {
		return authorName;
	}



	public void setAuthorName(String authorName) {
		this.authorName = authorName;
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


	@Override
	public int hashCode() {
		return Objects.hash(isbn, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", authorName=" + authorName + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}

	@Override
	public int compareTo(Book o) {
		return this.isbn.compareTo(isbn); 
	}

}

