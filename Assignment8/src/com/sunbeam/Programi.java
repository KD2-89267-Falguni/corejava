package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Programi {
	private static Scanner sc =new Scanner(System.in);
	private static List<Book> isbnList=new ArrayList<Book>();
	public static Book[] getBooks() {
		Book [] arr=new Book[5];
		arr[0] = new Book("978-0135166307", 45.99, "Robert Martin", 10);
        arr[1] = new Book("978-0596009205", 39.99, "Brian Kernighan", 5);
        arr[2] = new Book("978-0201616224", 50.00, "Steve McConnell", 7);
        arr[3] = new Book("978-0321356680", 55.99, "Joshua Bloch", 8);
        arr[4] = new Book("978-0132350884", 49.99, "Martin Fowler", 6);
        return arr;
}
	
	public static void addBook(Book [] books) {
	 for(Book b:books) {
		 isbnList.add(b);
	 }
		
	}
	public static void displayBookForward() {
		for(Book b:isbnList) {
			System.out.println(b.toString());//error
		}
			
	}
	public static void acceptBookRecords(String[] isbn) {
		System.out.println("Enter the Book isbn no");
		isbn[0]=sc.next();
	}
	public static boolean deleteBook(String isbn) {
		Book key=new Book();
		 key.setIsbn(isbn);
		//int index=idList.indexOf(key);
		if(isbnList.contains(key)) {
			isbnList.remove(key);
			return true;
		}
		return false;}
	
	public static void displayBookReverse() {
		ListIterator<Book>trav=isbnList.listIterator(isbnList.size());
		while(trav.hasPrevious()) {
			Book ele=trav.previous();
			System.out.println(ele+" ,");
		}
	}
	

	
	
	
	public static int menulist() {
		System.out.println("0.exit");
		System.out.println("1.Add new book in list");
		System.out.println("2. Display all books in forward order");
		System.out.println("3.Display all books in reverse order");
		System.out.println("4. Delete a book at given index");
		System.out.println("Enter yout choice");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		String[] isbn=new String[1];
		int choice;
		while((choice=menulist())!=0) {
			switch(choice) {
			case 1:
				//Programi.addBook(getBook());
				Book [] arr=Programi.getBooks();
				Programi.addBook(arr);
				break;
				
			case 2:
				Programi.displayBookForward();//error
				break;
			case 3:
			  	Programi.displayBookReverse();
				break;
				
			case 4:
				Programi.acceptBookRecords(isbn);
				boolean removedStatus=Programi.deleteBook(isbn[0]);
				System.out.println(removedStatus  ? "Book deleted" : "Book not deleted");
			break;
				
				default:
					 System.out.println("Invalid choice");
					
					break;
			}
		}
		
		 

	}

}
