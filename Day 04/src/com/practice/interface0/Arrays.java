package com.practice.interface0;
import java.util.Scanner;

public class Arrays {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		int[] myint=getinteger(5);
		printint(myint);
		
	}
	private static int[] getinteger(int number) {
		System.out.println("Enter "+ number+" integer values:");
		int[] values=new int[number];
		for(int i=0;i<values.length;i++) {
			values[i]=scanner.nextInt();
		}
		return values;
		
	}
	private static void printint(int[] myint) {
		for(int i=0;i<myint.length;i++) {
			System.out.println(myint[i]);
		}
	}

		
	
	
}
	
	

