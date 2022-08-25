

//WAP to find factorial of a number (User input)

package Lab25thAug;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1;  
		  int number;
		  Scanner sc =new Scanner(System.in);
			System.out.println("Enter a number:");
			number=sc.nextInt();
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
		  
	}
	