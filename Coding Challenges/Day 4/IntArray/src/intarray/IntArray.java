//You are given an integer array nums and an integer k. Rotate the array to the
//right by k steps, where k is non-negative.

package intarray;

import java.util.Scanner;

public class IntArray {
	
	public static void rotateRightByOne(int[] arr) {
        int n = arr.length;
        int last = arr[n - 1]; // store last element

        // Shift all elements to the right by 1
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Put last element at the first position
        arr[0] = last;
    }

	

	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of an Array : ");
    int n=sc.nextInt();	
	int [] arr=new int[n];
	System.out.println("Enter Elements in an Array :");
	for(int i=0;i<n;i++)
	{
	arr[i]=sc.nextInt();	
	}
	System.out.println("Original Array is : ");
	for(int i=0;i<n;i++)
	{
	System.out.print(arr[i]+" ");	
	}
	
	System.out.println("\nEnter k Rotation :");
	int k=sc.nextInt();
	
     	
       for(int i=1;i<=k;i++)
       {
    	  rotateRightByOne(arr);   
       }
       
       System.out.println("Array after "+k+" Rotations :");
       for(int num:arr)
       {
    	System.out.print(num+" ");   
       }
	
     sc.close();
	
	}

}
