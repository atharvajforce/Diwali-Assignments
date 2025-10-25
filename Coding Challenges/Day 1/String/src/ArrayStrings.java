import java.util.Scanner;

public class ArrayStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of an Array : ");
		int n=sc.nextInt();
		sc.nextLine(); // dummy line
		
		String [] arr =new String [n];
		
		System.out.println("Enter "+n +" Strings in an Array ");
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextLine(); 	
		}
	
	 int maxlength=0;
	 String longest="";
	 
	 for(int i=0;i<arr.length;i++)
	 {
		if(arr[i].length()>maxlength) {
			maxlength=arr[i].length();
			longest=arr[i];
		} 
	 }
	
	 System.out.println("The Longest String is : "+longest);
     System.out.println("Length of the Logest String is : "+maxlength);  
		
		
		
		
		
		
		
		
	}

}
