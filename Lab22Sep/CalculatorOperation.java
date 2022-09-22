package Lab22Sep;
import java.util.*;
class Calculator{
	int addition(int ...n) {
		int sum=0;
		for(int i:n) {
			sum+=i;
		}
		return sum;
	}
	int subtraction(int ...n) {
		int result=0;
		for(int i:n) {
			 result-=i;
		}
		return result;
	}
	
	int multiplication(int ...n) {
		int result=1;
		for(int i:n) {
			 result*=i;
		}
		return result;
	}
}
public class CalculatorOperation {
	public static void main(String[] args) {
		Calculator obj=new Calculator();
System.out.println("The addition of 4,5,6 is:" +obj.addition(4,5,6));
System.out.println("The subtraction of 6,7,8,9 is:" +obj.subtraction(6,7,8,9));
System.out.println("The multiplication of 1,2,3,4,5 is:" +obj.multiplication(1,2,3,4,5));
}}
