package Lab29thSeptember;

import java.util.*;
public class CheckEveryElement {
	 public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Input an integer:");
	        int n = sc.nextInt();
	        System.out.print("Check whether every digit of the said integer is even or not!\n");
	        test(n);
	        }

	  public static void test(int n){
	     int f = 10;
	    if (n == 0){
	     System.out.println("Null");
	    }
	    while(n != 0){
	        if((n % f) % 2 != 0){
	            System.out.println("false");
	        }
	        n /= 10;
	    }
	    System.out.println("true");
	   }
	}