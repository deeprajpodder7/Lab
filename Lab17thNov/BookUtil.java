package com.book;

import java.util.Scanner;

import com.book.BookStore;

class BookUtil {
    public static void main(String[] args) throws InvalidBookException{									//main method
        BookStore obj = new BookStore();								//instantiating BookStore object
        Scanner s  = new Scanner(System.in);								//instantiating scanner object
        for(int i=1; i<=3; i++) {									//running for loop three times to add 3 book instances
            //taking inputs from user

            System.out.println("For book-"+i);
            System.out.println("\n Enter bookID:");
            Scanner a = new Scanner(System.in);								//instantiating scanner object
            String bookID = a.nextLine();									//taking input for bookID

            System.out.println("Enter title:");
            Scanner b  = new Scanner(System.in);								//instantiating scanner object
            String title = b.nextLine();									//taking input for title

            System.out.println("Enter author:");
            Scanner c  = new Scanner(System.in);								//instantiating scanner object
            String author = c.nextLine();									//taking input for author

            System.out.println("Enter category:");
            Scanner d  = new Scanner(System.in);								//instantiating scanner object
            String category = d.nextLine();									//taking input for category

            System.out.println("Enter price:");
            Scanner scanPrice  = new Scanner(System.in);								//instantiating scanner object
            Double price = scanPrice.nextDouble();									//taking input for price


            obj.addBook(new Book(bookID,title,author,category,price));						//adding Book instances into BookStore
            obj.displayAll();

            if(i!=4) {	//condition for close scanner input stream
                continue;
            }
            //closing all scanner input streams
            a.close();
            b.close();
            c.close();
           d.close();
            scanPrice.close();
        }	//for loop end

        System.out.println("\nEnter title to search book: ");
        String a = s.nextLine();									//taking input for price
        System.out.println("\nSearched by title");
        obj.searchByTitle("title: " +a);									//searching book by book title

        System.out.println("\nEnter author name to search book");
        String b = s.nextLine();									//taking input for price
        System.out.println("\nSearched by author");
      //  obj.searchByAuthor("Author "+ b );									//searching book by author name
obj.searchByAuthor("Author " +b);
        System.out.println("\nPrinting all books:");
        obj.displayAll(); 										//displaying all books with details

        s.close();
	}

}
