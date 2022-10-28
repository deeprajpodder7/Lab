package Lab28thOct;

import java.util.Scanner;//importing scanner class
class NewException extends Exception{//extending Exception class
	String str;
	public NewException(String str) {
		super("Non-positive integer sent");//passing argument according to the question
        this.str = str;
	}
}
public class Problem3 {//creating new class
 public int addTwoPositive(int m,int n) {//method which takes two parameters as integer
	 if(m<0||n<0) {//logic for negative number
		 throw new ArithmeticException("m and n is not positive");//user defined exception
	 }
	 else {
		 return m+n;//returning the sum
	 }
 }
 public static void main(String[] args) {
	Scanner Scan=new Scanner(System.in);//creating object of scanner class
	Problem3 ed =new Problem3();//creating object of ExceptionDemo class
	System.out.println("enter the input values of m and n : ");
	int m=Scan.nextInt();//taking input for m
	int n=Scan.nextInt();//taking input for n
	try {
		System.out.println("the result of product is : "+ed.addTwoPositive(m, n));// to get the result
	} catch (Exception e) {//handling the exception if there any occurs
		e.printStackTrace();//printing the Exception message
	}
	finally {
		System.out.println("finally block executed");// executing finally block 
	}
}
}