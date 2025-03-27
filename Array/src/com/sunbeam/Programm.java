package com.sunbeam;

import java.util.Scanner;

public class Programm {
 		
		public static void acceptRecord(int[] a) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the elements : ");
			for(int i =0; i<a.length; i++){
			a[i]=sc.nextInt();		
			}

	}
		public static void printRecord(int[] a) {
			if(a!=null) {
				for(int i=0;i<a.length;i++){
					System.out.println(a[i]);
				}
			}
		
		}
		
		public static void main(String[] args) {
			int[] arr=new int[9];
			Programm.acceptRecord(arr);
			Programm.printRecord(arr);

			
		}

}
