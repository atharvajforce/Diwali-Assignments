package com.demo.service;

import java.util.List;

public interface NumberService {

	boolean CheckPrime(int n);

	List<Integer> generatePrimes(int n);

	long factorial(int n);

	 List<Integer> fibonacci(int n);

	boolean isEven(int n);

}
