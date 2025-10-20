package com.demo.test;

import java.util.Scanner;

import com.demo.service.NumberServiceImpl;
import com.demo.service.NumberService;

public class TestNumberManagementSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		NumberService nservice = new NumberServiceImpl();

	  int choice =0;	
	do {
		System.out.println("\n--- Number Management System ---");
    System.out.println("1. Sum of first n Even Numbers");
    System.out.println("2. Sum of first n Odd  Numbers");
    System.out.println("3. Check Number is Palindrome");
    System.out.println("4. Check Number is Armstrong");
    System.out.println("5. Reverse the Number");
    System.out.println("6. Exit");
    System.out.print("Enter Your Choice: ");
	int ch=sc.nextInt();
    choice =ch;
	switch(ch) {
	 
	case 1->{
	System.out.println("Enter Number to find Sum of n Even Numbers ");
	int n=sc.nextInt();
	int sum=nservice.sumofNEven(n);
	System.out.println("Sum of first " + n + " Even numbers = " + sum);
 	}
	case 2->{
	System.out.println("Enter Number to find Sum of n odd Numbers");
	int n=sc.nextInt();
	int sum=nservice.sumofNOdd(n);
	System.out.println("Sum of first " + n + " Odd numbers = " + sum);		
	}
	case 3->{
	System.out.println("Enter Number to Check Palindrome or not");
	int n=sc.nextInt();
	boolean status =nservice.isPalindrome(n);
	if(status)
	{
		System.out.println(n+" is Palindrome");
	}
	else
		System.out.println(n+" is Not Palindrome");
	}
	case 4->{
	System.out.println("Enter Number to Check Armstrong or not");
	int n=sc.nextInt();
	boolean status =nservice.isArmstrong(n);
	if(status)
	{
		System.out.println(n+" is Armstrong");
	}
	else
		System.out.println(n+" is Not Armstrong");
		}	
		
case 5->{
        System.out.println("Enter a Number ");
        int n=sc.nextInt();
        int rev=nservice.ReverseNum(n);
        System.out.println("The reverse of "+n+" is "+rev);        
}
case 6->{
	  System.out.println("thank you visiting....");
}
	}
		
	}
	while(choice!=6);
	}
}
	
