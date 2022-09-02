package Sep2Lab;
import java.util.Scanner;
/* Q.1 You are given a class AdvancedArithmetic which contains a method signature int
	divisor_sum(int n). You need to write another class called MyCalculator which implements the 
	method.
	divisorSum method just takes an integer as input and return the sum of all its divisors
	The value of n will be at most 1000.*/
 class AdvancedArithmetic{
		void divisorSum(int n) {
		
		 int sum=0;
		 for(int i=1;i<=n;i++) {
			 if(n%i==0) {
				 sum=sum+i;
			 }			 
		 }
		 System.out.println("the sum of all divisor :"+sum);
		
	}
}

class MyCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 System.out.println("enter a number :");
		 int n=scan.nextInt();
		AdvancedArithmetic adv=new AdvancedArithmetic();
		adv.divisorSum(n);
	}

}
