package Array;

import java.util.*;

class Library {

	public String bookName, bookId;
	public String bookAuthor;
	Scanner sc = new Scanner(System.in);

	public void addBook() {
		System.out.println("enter book Id: ");
		bookId = sc.next();
		System.out.println("enter book name: ");
		bookName = sc.next();
		System.out.println("enter book Author: ");
		bookAuthor = sc.next();
	}

	public void showBook() {
		System.out.println("The book ID is: " + bookId);
		System.out.println("The book name is: " + bookName);
		System.out.println("The book Author is: " + bookAuthor);
	}

	public void dispenseBook(String bookId, String bookName, String bookAuthor) {
		System.out.println("Enter BookId, BookName,BookAuthor to check if it's available ");
		System.out.println("enter book Id: ");
		bookId = sc.next();
		System.out.println("enter book name: ");
		bookName = sc.next();
		System.out.println("enter book Author: ");
		bookAuthor = sc.next();
		if (Objects.equals(this.bookId, bookId) && Objects.equals(this.bookName, bookName)
				&& Objects.equals(this.bookAuthor, bookAuthor)) {
			System.out.println(
					"[ " + bookId + " ," + bookName + "," + bookAuthor + " ] is Available and assigned to you  ");
		} else {
			System.out.println("Sorry no book matches with your provided details");
		}
	}
}

public class LibraryManage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of books to add: ");
		int n = sc.nextInt();
		Library obj1[] = new Library[n];
		System.out.println("Add BookId, BookName,BookAuthor: ");
		for (int i = 0; i < n; i++) {
			obj1[i] = new Library();
			obj1[i].addBook();
			obj1[i].showBook();
			obj1[i].dispenseBook(null, null, null);
		}
		
	}
}
