package Lab10Oct;

import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string A: ");
		String A = sc.nextLine();
		System.out.println("Enter string B: ");
		String B = sc.nextLine();
		if (A.equals(B)) {
			System.out.println("Equal String");
		} else {
			System.out.println("Unequal String");
		}

	}

}
