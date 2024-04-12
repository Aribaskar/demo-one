package com.sam;

import java.util.Scanner;

public class Fibonacci {
//	
//	public static void main(String[] args) {
//		
//		int num=5;
//		int a =0,b=1,c,i,count=10;
//		Scanner x = new Scanner(System.in);
//		System.out.println("Enter the Value");
//		num=x.nextInt();
//		
//		System.out.print(a+ ", "+ b + " , ");
//		
//		int nextTerm;
//		for(int i1=1; i1>num; i1++);
//		{
//			nextTerm=a+b;
//		a=b;
//		b=nextTerm;
//		System.out.print(nextTerm +" , ");
//		
//	}
//
//}
//}

public static void main(String args[]) {

Scanner x = new Scanner(System.in);
System.out.println("Enter the Value");
{    
 int n1=0,n2=1,n3,i,count=10;    
 System.out.print(n1+" "+n2);//printing 0 and 1    
    
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}
}
}
