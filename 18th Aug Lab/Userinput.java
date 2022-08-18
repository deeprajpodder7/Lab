//3 Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, the average, the distance (the difference between integer), the maximum (the larger of the two integers), the minimum (smaller of the two integers

package Practical18thAug;
import java.util.Scanner;
public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter first number:");
		Scanner sc= new Scanner(System.in);
int a=sc.nextInt();
System.out.println("Enter second number:");
int b=sc.nextInt();
int sum= a+b;
int diff= a-b;
int prod= a*b;
float avg= sum/2;
System.out.println("The sum is:" +sum);
System.out.println("The difference is:" + diff);
System.out.println("The product is:" + prod);
System.out.println("The average is:" + avg);
System.out.println("The distance is:" + diff);
System.out.println("The maximum is:" +a);
System.out.println("The minimum is:" + b);
	}

}
