package Lab29thSeptember;
import java.util.Scanner;

public class PairSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		System.out.println("Pairs of elements : ");
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] + arr[j] == number) {
					System.out.println(arr[i] + " , " + arr[j] );
				}
			}
		}
	}
}
