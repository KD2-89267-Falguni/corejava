package com.sunbeam;
public class Program {

	public static void main(String[] args) {
		int[][] rarr= new int[4][];
		rarr[0]=new int[1];
		rarr[1]=new int [2];
		rarr[2]=new int[3];
		rarr[3]=new int[4];
		
		for(int i = 0; i < rarr.length; i++) {
			for(int j = 0;j < rarr[i].length; j++) {
				System.out.print(rarr[i][j]+ " ");
			}
			System.out.println();
		}
		int count=0;
		for(int i = 0 ;i < rarr.length;i++) {
			for(int j = 0 ; j<rarr[i].length;j++){
		    rarr[i][j] = ++count;

			}
			System.out.println();
		}
		for(int i=0;i<rarr.length;i++) {
			for(int j=0;j<rarr[i].length;j++) {
				System.out.print(rarr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
