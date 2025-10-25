//You are given an array of size n that contains distinct numbers from 0 to n. Your
//task is to find the one number that is missing from the array.
//sum of n =n*(n+1)/2

package number;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an Array : ");
		int n=sc.nextInt();
		int [] arr= new int [n];
		System.out.println("Enter elements in an array :");
		for(int i=0;i<n;i++)
		{
		 arr[i]=sc.nextInt();
		}
		System.out.println("Elements are :");
		for(int i=0;i<n;i++)
		{
		 System.out.print(+arr[i]+" ");	
		}
		 int expectedsum= n*(n+1)/2;
		 int actualsum=0;
		 
		 for(int i=0;i<n;i++)
		 {
			actualsum+=arr[i]; 
		 }
		 
		 int missing =expectedsum-actualsum;
		System.out.println("\nMissing Number is : " +missing);
		 
     sc.close();
		
		
	}

}
