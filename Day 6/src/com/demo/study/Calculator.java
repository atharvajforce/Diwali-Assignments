package com.demo.study;

import java.util.Scanner;

import com.demo.exceptions.WrongOperatorExceptions;

public class Calculator {

	public static void main(String[] args) throws WrongOperatorExceptions {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Num2 : ");
		int num2 = sc.nextInt();
		System.out.println("Enter Operators (+, -, *, /, %) : ");
		String op = sc.next();

		switch (op) {
		case "+" -> {
				add(num1, num2, op);
		}
		case "-" -> {
				substract(num1, num2, op);
			} 
		case "*" -> {
				mul(num1, num2, op);
		}
		case "/" -> {
				div(num1, num2, op);
		}
		case "%" -> {
				mod(num1, num2, op);
		}
		default -> {
			try {
				throw new WrongOperatorExceptions(op+" Re-run the code.");
			} catch (WrongOperatorExceptions e) {
				System.out.println("Wrong Operator Entered - "+e.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		}
	}

	private static void mod(int num1, int num2, String op) throws WrongOperatorExceptions {
		// TODO Auto-generated method stub
		System.out.println(num1 + op + num2 + "=" + (num1 % num2));

	}

	private static void div(int num1, int num2, String op) throws WrongOperatorExceptions {
		// TODO Auto-generated method stub
		System.out.println(num1 + op + num2 + "=" + (num1 / num2));
	}

	private static void mul(int num1, int num2, String op) throws WrongOperatorExceptions {
		// TODO Auto-generated method stub
		System.out.println(num1 + op + num2 + "=" + (num1 * num2));
	}

	private static void substract(int num1, int num2, String op) throws WrongOperatorExceptions {
		// TODO Auto-generated method stub
		System.out.println(num1 + op + num2 + "=" + (num1 - num2));
	}

	private static void add(int num1, int num2, String op) throws WrongOperatorExceptions {
		// TODO Auto-generated method stub
		System.out.println(num1 + op + num2 + "=" + (num1 + num2));
	}

}
