package com.Lab;
import java.util.*;
public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* 1. What will be the output of the following program?

		int sum =23;
	    for(int i=2;i<=5;i++) {
		for (int j =7;j<=9;j++) {
			sum+=(i*j);
		}
	}
	System.out.println("sum= "+sum);  //sum = 359  */
		
		/* 2. Write a program to calculate the sum of following series where n is input by user. 

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the valu of n");
		int n = sc.nextInt();
		System.out.println("The sum is "+sum);
		
		   static double sum(int n){
			double i,x = 0.0;
			for(i=1;i<=n;i++) 
	        x =x+1/i;
			return x;  */
		
		/* 3. Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers 
		int a,b,i,hcf = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number");
		a=sc.nextInt();
		System.out.println("Enter the Second number");
		b=sc.nextInt();
		
		for(i=1;i<=a || i<=b;i++) {
			if (a%i==0 && b%i==0)
				hcf=i;
		}
		System.out.println("HCF of given two numbers is "+hcf);  */
		
		/* 4. 1. Write a Java Program to print prime numbers from 15 to 30
		 
		int i,a =15;
		int count;
		
		while(a<=30) {
			count =0;
			i=2;
			while(i<=a/2) {
				if (a%i==0) {
					count++;
					break;
				}
				i++;
			}
			if(count == 0 && a !=1) {
				System.out.println("The prime number between 15 to 30 is  "+a);
			}
			a++;
			}    */
		 
		/* 5. Write a java program to print the table of all the numbers from 1 to 10.

		for(int i =1; i<=10; i++) {
			for (int j=1;j<=10;j++) {
	        System.out.println(i+ "*" + (j)+ "="+ (i * (j)));
			}
			System.out.println("--------------------------");
		}   */  
		
		
		
	}
}
