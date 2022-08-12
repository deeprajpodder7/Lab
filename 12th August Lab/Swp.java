/*Write a Java program to swap two variables*/


class Swp{
public static void main(String args[]){
int a=10;
int b=20;
System.out.println("The first number is:" + a);
System.out.println("The second number is:" + b);
int temp; //creating a temporary variable to store the data that is to be swapped
temp=a;//swapping of variables begin
a=b;
b=temp;
System.out.println("After swapping the numbers");
System.out.println("The first number is:" + a);
System.out.println("The second number is:" + b);
}
}
