//Write a Java program to break an integer into a sequence of individual digits.

package Practical18thAug;
import java.util.Scanner;

public class Individual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=123456;
		System.out.println("The number:" + a);

int b= a/100000%10;
int c= a/10000%10;
int d= a/1000%10;
int e= a/100%10;
int f= a/10%10;
int g= a%10;
System.out.println(b + " " + c + " " + d + " " + e + " " + f + " " + g );

	}

}
