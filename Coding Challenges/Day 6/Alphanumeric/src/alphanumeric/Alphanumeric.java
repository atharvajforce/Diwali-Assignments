//Check if a string contains only alphanumeric characters
package alphanumeric;

import java.util.Scanner;

public class Alphanumeric {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String alpha=sc.next();
		boolean status=false;
		if(!alpha.isEmpty()&&alpha.matches(".*[0-9].*")&&alpha.matches(".*[a-zA-z].*"))
		{
			status=true;
		}
		
		if(status)
		
		 System.out.println("Entered String is Alphanumeric");
		
		else
			
		 System.out.println("Entered String is Not Alphanumeric");
		
      sc.close();
	}

}
