package com.demo.dao;

public class NumberDaoImpl implements NumberDao {

	@Override
	public int sumofNEven(int n) {
	    int sum = 0;
	    for (int i = 1; i <= n; i++) {
	        sum += 2 * i;
	    }
	    return sum;
	}

	@Override
	public int sumofNOdd(int n) {
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		sum+=(2*i-1);
	}
	return sum;
	}

	@Override
	public boolean isPalindrome(int n) {
	 int original =n;
	 int rev=0;
	 
	 while(n>0)
	 {
		int digit=n%10;  
		rev=rev*10+digit;
		n=n/10;
	 }
	 
	 if(rev==original)
	 {
		 return true;
	 }
	 else
		 return false;
	}

	@Override
	public boolean isArmstrong(int n) {
		int orignal =n;
		int temp=n;
		int sum=0;
		int digits=0;
		
		while(temp>0) {
		
          digits++;
          temp=temp/10;
	  	 
	       	}
		
	  temp =n;
	while(temp>0) {
		int digit=temp%10;
		int power=1;
		
	for(int i=0;i<digits;i++) {
		
		power*=digit;           //power=power*digits;
	}
	sum+=power;
     temp/=10;								//temp=temp/10;
	}
	            
	if(sum==n)
		return true;	
	else
		return false;
	
		
		
	}

	
	@Override
	public int ReverseNum(int n) {
	    int rev = 0;
	    while (n > 0) {
	        int digit = n % 10;
	        rev = rev * 10 + digit;
	        n /= 10;
	    }
	    return rev;
	}




}
	
	


