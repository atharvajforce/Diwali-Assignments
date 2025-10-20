package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

public class NumberDaoImpl implements NumberDao{

	
	@Override
	public boolean CheckPrime(int n) {
		for(int i=2;i<n;i++)
	 {
		if(n%i==0)
	{
		 return false;
	}
		}
	   return true;
	}

	@Override
    public List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (CheckPrime(i)) {
            	primes.add(i);
            }
        }
        return primes;
    }

	@Override
	public long factorial(int n) {
      int fact=1;
		for(int i=1;i<=n;i++)
   {
	   fact =fact*i;
   }
		return fact;
	}

	@Override
    public List<Integer> fibonacci(int n) {
        List<Integer> fib = new ArrayList<>();
        int a = 0, b = 1;
        while (a <= n) {
            fib.add(a);
            int next = a + b;
            a = b;
            b = next;
        }
        return fib;
    }

	@Override
	public boolean isEven(int n) {
		if(n%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	

}
