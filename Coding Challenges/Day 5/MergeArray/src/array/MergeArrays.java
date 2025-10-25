//You are given two sorted arrays nums1 and nums2. Your task is to merge them
//into a single array sorted in non-decreasing order

package array;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
 
	 int [] nums1 = {2,5,7,8,10};
	 int [] nums2 =  {1,3,9,11,12};
	
	 int [] temp= new int [nums1.length+nums2.length];
	 
	 for(int i=0;i<nums1.length;i++)
	 {
		temp[i]=nums1[i]; 
	 }
	 
	 for(int i=0;i<nums2.length;i++)
	 {
		temp[i+nums1.length]=nums2[i]; 
	 }
	 
	 System.out.println("Merged Array : ");
	 Arrays.sort(temp);
     
	 String str=Arrays.toString(temp);
	 System.out.println(str);
	 
	}
  
}
