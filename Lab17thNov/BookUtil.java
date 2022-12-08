package com.book;

import java.util.Scanner;

import com.book.BookStore;

class BookUtil {
	public static void main(String[] args) throws InvalidBookException { // main method
		BookStore obj = new BookStore(); // instantiating BookStore object
		Scanner s = new Scanner(System.in); // instantiating scanner object
		boolean quit = false;
		int choice;
		do {
			// display menu to user
			// ask user for his choice and validate it (make sure it is between 1 and 5)
			System.out.println();
			System.out.println("1) Add a book to the Library");
			System.out.println("2) Search a book by Title in Library");
			System.out.println("3) Search a book by Author in Library");
			System.out.println("4) Display all books in Library");
			System.out.println("5) Quit");
			System.out.println();
			System.out.print("Enter choice [1-5]: ");
			choice = s.nextInt();
			switch (choice) {
			// taking inputs from user
			case 1:
				System.out.println("To Add Book:");
				System.out.println("\n Enter bookID:");
				Scanner a = new Scanner(System.in); // instantiating scanner object
				String bookID = a.nextLine(); // taking input for bookID

				System.out.println("Enter title:");
				Scanner b = new Scanner(System.in); // instantiating scanner object
				String title = b.nextLine(); // taking input for title

				System.out.println("Enter author:");
				Scanner c = new Scanner(System.in); // instantiating scanner object
				String author = c.nextLine(); // taking input for author

				System.out.println("Enter category:");
				Scanner d = new Scanner(System.in); // instantiating scanner object
				String category = d.nextLine(); // taking input for category

				System.out.println("Enter price:");
				Scanner scanPrice = new Scanner(System.in); // instantiating scanner object
				Double price = scanPrice.nextDouble(); // taking input for price

				obj.addBook(new Book(bookID, title, author, category, price)); // adding Book instances into BookStore
				System.out.println("----Book Added to Library----");
				break;

			case 2:
				System.out.println("To Search a book by Title:");
				System.out.println("\nEnter title to search book: ");
				String title_search = s.nextLine(); // taking input for price
				System.out.println("\nSearched by title");
				obj.searchByTitle("title: " + title_search); // searching book by book title
				break;
			case 3:
				System.out.println("To Search a book by Author:");
				System.out.println("\nEnter author name to search book");
				String author_search = s.nextLine(); // taking input for price
				System.out.println("\nSearched by author");
				// obj.searchByAuthor("Author "+ b ); //searching book by author name
				obj.searchByAuthor("Author " + author_search);
				break;
			case 4:
				System.out.println("\nPrinting all books:");
				obj.displayAll(); // displaying all books with details

				s.close();
				break;

			case 5:
				System.err.println("You have successfully exited");
				System.out.println("--Thank You--");
				System.out.println();
				System.exit(0);
				break;
			default:
				System.out.println("\n!!! Invalid Choice !!!");

			}
		} while (!quit);

	}
}
