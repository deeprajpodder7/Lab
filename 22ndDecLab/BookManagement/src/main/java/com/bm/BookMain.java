package com.bm;

import java.util.Scanner;
import com.dauimpl.BookImpl;

public class BookMain {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookImpl bl = new BookImpl();
		int input;
		do {
			System.out.println("\nEnter 1 for add book\n2 for fetch book details\nOr enter any other character for exit");
			input = sc.nextInt();
			switch (input) {
			case 1:
				bl.addBook();  //calling addBook() method
				break;
			case 2:
				bl.fetchBook();  //calling fetchBook() method
				break;
			default:
				System.exit(0);
				break;
			}
		} while (input>0&&input<3);

	}
}
