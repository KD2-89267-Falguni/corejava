package com.sunbeam;
import java.util.Scanner;
public class Array2d {

		public static void acceptRecord(int[][] arr) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the numbers");
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					arr[i][j]=sc.nextInt();
				}
			

			}
		}
		
		public static void printRecord(int[][] arr) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
		public static void main(String[] args) {
          int[][] arr=new int[3][3];
          Array2d.acceptRecord(arr);
          Array2d.printRecord(arr);
          
	}

}
