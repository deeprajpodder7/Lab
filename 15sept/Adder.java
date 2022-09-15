package Rough;
/*Write the following code:
1. A class named Arithmetic with a method named add that takes integers as parameters and 
returns an integer denoting their sum.
2. A class named Adder that inherits from a superclass named Arithmetic*/
class Arithmetic{
	int add(int...n) {
		int sum = 0;  
		  for (int i : n)  
		    sum += i;  
		  return sum;
	}
}
public class Adder extends Arithmetic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Adder ad=new Adder();
int result=ad.add(5,4);
System.out.println(result);
	}

}
