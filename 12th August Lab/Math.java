/*Write a Java program to print the sum (addition), multiply, subtract, divide and 
remainder of two numbers*/


class Math{
public static void main(String args[]){
System.out.print("The two numbers are:");
int a = 125;
int b = 24;
System.out.println(" " + a + " " + b);
int sum= a+b;//addition of the two numbers
int product= a*b;//multiplication of the two numbers
int division= a/b;//division of the two numbers
int subtract= a-b;//subtraction of the two numbers
int remainder= a%b;//reaminder of the two numbers after division
System.out.println("The sum is :" + sum);
System.out.println("The product is :" + product);
System.out.println("The divided result is :" + division);
System.out.println("The subtracted result is :" + subtract);
System.out.println("The remainder is :" + remainder);
}
}
