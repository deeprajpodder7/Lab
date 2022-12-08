package com.book;


//class representing custom exception  
class InvalidBookException  extends Exception  
{  
 public InvalidBookException (String str)  
 {  
     // calling the constructor of parent Exception  
     super(str);  
 }  
}  

class Book {
	String bookID,title,author,category;
	Double price;
	
	public String toString(){
        return "BookID: " +bookID + "\nTitle: " + title + "\nAuthor: " + author + "\nCategory: " + category + "\nPrice:" + price ;
        }		

	
	Book(String bookID, String title, String author, String category, Double price) throws InvalidBookException{
		this.bookID=bookID;
		this.author=author;
		this.category=category;
		this.price=price;
		this.title=title;
		
		if(category!="Science" || category!="Fiction" || category!="Technology" || category!="Others") {
		throw new InvalidBookException("Category Mismatch!");	
		}
		else if(price<0) {
			throw new InvalidBookException("Negative Price !!");	
		}
		
		else if(bookID.charAt(0)!='B' && bookID.length()!=4){
			throw new InvalidBookException("bookID must start with 'B' and should be of legth 4 !! ");	
		}
		
		
		}
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
}	
public	class BookStore{
		private Book[] books= new Book[100]; // all the books in this bookstore
		private int totalBooks=0; // the number of books in this bookstore
		
		public void addBook(Book b) {
			 if(totalBooks < books.length) {
			        books[totalBooks] = b;
			        totalBooks++;

			    }
			    else
			    {
			        System.out.println("\nSorry, cannot add book to stock.");
			    }
		}
		public void searchByTitle(String title) {
			for (int i = 0; i < totalBooks; i++)
		    {
		       if(title==books[i].getTitle());
		    }
		}
		
		public void searchByAuthor(String author) {
			for (int i = 0; i < totalBooks; i++)
		    {
		       if(author==books[i].getAuthor());
		    }
		}
		
		public void displayAll() {
			int i;

		    System.out.println("\nList of Books\n======");
		    for (i = 0; i < totalBooks; i++)
		    {
		        System.out.println(books[i]);
		    }
		    System.out.println();
		}
		
	}


