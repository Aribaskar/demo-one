package com.sam;


//import java.util.Scanner;
//
//public class factorial {
//	public static void main(String[] args) {
//		System.out.println("Enter the factorial number");
//
//	Scanner scan = new Scanner(System.in);
//
//	int number = scan.nextInt();
//	scan.close();
//	int fact=1;
//		}
//		
//	}

//public class factorial{
//	
//	public static void main(String[] args) {
//		
//		int num = 5;
//		int fact=1;
//		
//		for(int i=1; i<=num; i++) {
//		fact=fact*i;
//		
//		System.out.println(fact);
import java.util.Scanner;

public class factorial{
	
	public static void main(String[] args) {
		System.out.println("enter the Factorial value");
		
		Scanner scan= new Scanner(System.in);
		
		int num= scan.nextInt()	;
		scan.close();
		
		int fact=1;
		for(int i=1; i<num; i++) {
		fact=fact*i;	
	}
System.out.println("factorial is " +fact);
		
		
	}
	
	
	}
	


