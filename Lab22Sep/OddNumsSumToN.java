package Lab22Sep;
//write a java program to print sum of odd numbers up to N?
import java.util.*;
class Odd{
	int sum=0;
	 void OddSum(int num) {
		for(int i=1;i<=num;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
	System.out.println("The sum is: " +sum);}
}
public class OddNumsSumToN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int N=sc.nextInt();
		Odd obj= new Odd();
		obj.OddSum(N);

	}

}
