//Q.1 Write a Java program to find the value of specified expression. 

package Practical18thAug;


public class Expression {
	public static void main (String[] args) {
		//declaring variable and initializing it with the given numbers
		int a= (101 + 0)/3;
		double b= 3.0e-6 * 10000000.1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(true && true);
		System.out.println(false && true);
		System.out.println((false && false) || (true && true));
		System.out.println((false || false) && (true && true));
}
}