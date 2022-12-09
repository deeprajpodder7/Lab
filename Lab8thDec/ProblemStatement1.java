package Lab8thDec;

//Problem Statement 1

import java.util.ArrayList;

public class ProblemStatement1{
    ArrayList<Integer> A1 = new ArrayList<>();
	ArrayList<Integer> A2 = new ArrayList<>();
	
	
	 ArrayList<Integer> storeEvenNumbers(int N) { //method of ArrayList <Integer> type to store even number till N
		
		 for(int i=2; i<=N; i++) {
			if(i%2==0)
				A1.add(i);
		}
		return A1;
	}
	
	void printEvenNumbers() { //method to print double of the elements 
		for(int i:A1) {
			A2.add(i*2);
		}
		for(int i:A2) {
			System.out.println(i);
		}
	}

int retrieveEvenNumber(int N) { //method to check if number is present
	for(int i:A1) {
		if(i==N) 
		return i;
	}
	return 0 ;
	
}
public static void main(String[] args) {
		
		ProblemStatement1 obj =new ProblemStatement1();
		System.out.println( "Executing storeEvenNumbers method: "+ obj.storeEvenNumbers(10)); 
		System.out.println("Executing printEvenNumbers method: ");
		obj.printEvenNumbers();
		
		System.out.println("Executing retrieveEvenNumber method: ");
		System.out.println(obj.retrieveEvenNumber(8));
	}

}
