package Lab10Oct;

import java.util.Scanner;

public class OddPos {

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
		System.out.println("The current array is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("The new array is: ");
		for (int i = 0; i < size; i+=2) {
			System.out.print(arr[i] + " ");
		}

	}

}
