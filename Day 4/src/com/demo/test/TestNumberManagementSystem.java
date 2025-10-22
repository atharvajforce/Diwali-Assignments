package com.demo.test;

import java.util.Scanner;

import com.demo.service.NumberService;
import com.demo.service.NumberServiceImpl;

public class TestNumberManagementSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		NumberService nservice =new NumberServiceImpl();
        int choice =0;
        
     do {   System.out.println("--- Number Management System----");
    	        System.out.println("1. Addition \n2. Print Multiplication Table\n3. Print Number Pattern(Triangle / Pyramid");
			System.out.println("4. Sum of Digits\n5. Find GCD & LCM \n6. Exit\n Enter Choice :");
			choice=sc.nextInt();
		switch(choice) {
		case 1->{
			
			System.out.println("Enter Number 1");
			int n1 =sc.nextInt();
			System.out.println("Enter Number 2");
			int n2=sc.nextInt();
			System.out.println("Addition of "+n1 +" + "+n2+" is "+ (n1+n2));
		}
		case 2->{
			System.out.println("Enter Number ");
			int n=sc.nextInt();
			int result =nservice.PrintTable(n);
		}
		case 3->{
			System.out.println("Enter Number of rows : ");
			int n=sc.nextInt();
			int pattern =nservice.TrinaglePattern(n);
		}
		case 4->{
			System.out.println("Enter a Number");
			int n=sc.nextInt();
			int digits =nservice.SumofDigits(n);
			
		}
		case 5->{
			System.out.println("Enter First Number :");
			int n1=sc.nextInt();
			System.out.println("Enter Second Number :");
			int n2=sc.nextInt();
			int GCD =nservice.CalculateGcd(n1,n2);
			int LCM =nservice.CalculateLcm(n1,n2);
			System.out.println("GCD of "+n1+" & "+n2+" is "+GCD);
			System.out.println("LCM of "+n1+" & "+n2+" is "+LCM);
		}
		case 6->{
			System.out.println("Thank you for visitng.....");
		}		 		
		}	    	 
     }   
     while(choice!=6);   
	}

}
