package com.demo.test;

import java.util.Scanner;

import com.demo.service.NumberService;
import com.demo.service.NumberServiceImpl;

public class TestNumberManagementSystem {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        NumberService nservice = new NumberServiceImpl();
        
        int choice = 0;
        
        do {
            System.out.println("\n--- Number Management System ---");
            System.out.println("1. Check Prime");
            System.out.println("2. Generate Prime Numbers upto n");
            System.out.println("3. Calculate Factorial");
            System.out.println("4. Generate Fibonacci Series upto n");
            System.out.println("5. Check Number (Even / Odd)");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice: ");
            
            int ch = sc.nextInt();
            choice = ch; 
            
            switch(ch) {
                
                case 1 -> {
                    System.out.print("Enter a Number To check Prime or Not: ");
                    int n = sc.nextInt();
                    boolean status = nservice.CheckPrime(n);
                    if (status)
                        System.out.println("The Number " + n + " is Prime");
                    else
                        System.out.println("The Number " + n + " is Not Prime");
                }
                
                case 2 -> {
                    System.out.print("Enter Number n to generate primes: ");
                    int n = sc.nextInt();
                    System.out.println("Prime numbers upto " + n + ": ");
                    nservice.generatePrimes(n).forEach(p -> System.out.print(p + " "));
                    System.out.println();
                }
                
                case 3 -> {
                    System.out.print("Enter a number to calculate factorial: ");
                    int n = sc.nextInt();
                    long fact = nservice.factorial(n);
                    System.out.println("Factorial of " + n + " = " + fact);
                }
                
                case 4 -> {
                    System.out.print("Enter number n for Fibonacci series: ");
                    int n = sc.nextInt();
                    System.out.println("Fibonacci series upto " + n + ": ");
                    nservice.fibonacci(n).forEach(f -> System.out.print(f + " "));
                    System.out.println();
                }
                
                case 5 -> {
                    System.out.print("Enter a number to check Even/Odd: ");
                    int n = sc.nextInt();
                    if (nservice.isEven(n))
                        System.out.println(n + " is Even");
                    else
                        System.out.println(n + " is Odd");
                }
                
                case 6 -> {
                    sc.close();
                    System.out.println("Thank you for visiting...");
                }
                
                default -> {
                    System.out.println("Wrong Choice");
                }
            }
        } 
        while (choice != 6);
    }
}
