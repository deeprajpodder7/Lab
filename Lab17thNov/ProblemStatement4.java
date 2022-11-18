package Lab17thNov;

//Write a Java program to insert the specified element at the front of a linked list.

import java.util.LinkedList;

public class ProblemStatement4 {
public static void main(String[] args) {
	LinkedList<Integer> ll = new LinkedList();  //creating a linked list
	int i=1;
	while(i<=7) {  //storing numbers in linked list 
		ll.add(i);
		i++;
	}
	System.out.println("Before adding: " +ll);
	ll.addFirst(8); //adding a number to the front of the linked list
	System.out.println("After adding a number to the front of the linked list: " +ll);
	
}
}
