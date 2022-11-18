package Lab17thNov;

//Write a Java program to replace an element in a linked list

import java.util.*;

public class ProblemStatement5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	LinkedList<Integer> ll = new LinkedList();// creating linked list
	int i=1;
	while(i<=7) {  //storing numbers in linked list 
		ll.add(i);
		i++;
	}
	System.out.println("Before replacing: " +ll);
	System.out.println("Enter at which index position you want to replace: ");
	int index=sc.nextInt();
	System.out.println("Enter the number you want to replace with: ");
	int number=sc.nextInt();
	ll.set(index, number); //replacing the specified number with the element at the specified index 
	System.out.println("After replacing: " +ll);

}
}
