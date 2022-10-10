package Lab10Oct;

import java.util.*;

public class SpecificValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean c = false;
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to be found: ");
		int key = sc.nextInt();
		for (int i = 0; i < size; i++) {
			if (arr[i] == key) {
				c = true;
			}
		}
		System.out.println(c);
	}
}
