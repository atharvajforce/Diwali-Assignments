package com.demo.dao;

public class NumberDaoImpl implements NumberDao {

  private NumberDao nDao;
		  
  public void NumberServiceImpl() {
   nDao = new NumberDaoImpl();
       }

  @Override
  public int PrintTable(int n) {
	  int table =1;
	  for(int i=1;i<=10;i++)
	{
	  System.out.println("Table of "+n+" is " +n+" x "+i+" = "+(n*i));
	}
	return n;
  }

  @Override
  public int TrianglePattern(int n) {
	  for (int i = 1; i <= n; i++) {
          
          for (int j = 1; j <= n - i; j++) {        // Print spaces
              System.out.print(" ");
          }
         
          for (int k = 1; k <= i; k++) {           // Print numbers
              System.out.print(k + " ");
          }
          System.out.println();
      }
	  return n;
  }

  @Override
  public int SumofDigits(int n) {
	 int sum=0;
	  while(n!=0)
	{
	int	temp=n%10;
		sum=sum+temp;
		n=n/10;       //remove last digit
	}
	System.out.println("Sum of digits is " +sum);
	return sum; 
  }

  @Override
  public int CalculateGcd(int n1, int n2) {
	while(n2!=0)
	{
		int temp=n2;
		n2=n1%n2;
		n1=temp;
	}
	return n1;
	
  }

  @Override
  public int CalculateLcm(int n1, int n2) {
	int LCM =(n1*n2)/CalculateGcd(n1, n2);  //function call 
	return LCM;
  }


  }
 






  

