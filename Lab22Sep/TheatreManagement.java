package Lab22Sep; 
/*3.Movie Theatre Management System, where you can create two classes 
one is main another one is movie, 
movie class can have two methods setMovie, getMovie where you can create movieName, 
movieStartTime, movieEndTime, MovieTicketPrice as instance variables.*/
import java.util.*;
class Movie{
	String movieName;
	double movieStartTime, movieEndTime, movieTicketPrice;
	
	public void setMovie(String movieName,double movieStartTime, double movieEndTime, double movieTicketPrice) {
		this.movieName=movieName;
		this.movieStartTime=movieStartTime;
		this.movieEndTime=movieEndTime;
		this.movieTicketPrice=movieTicketPrice;
	}
	public void getMovie() {
		System.out.println("The movie name is:" +movieName);
		System.out.println("The movie start time is:" +movieStartTime);
		System.out.println("The movie end time is:" +movieEndTime);
		System.out.println("The movie ticket price is:" +movieTicketPrice);
	}
}
public class TheatreManagement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			Movie obj=new Movie();
			System.out.println("Enter movie name: ");
			String name=sc.nextLine();
			System.out.println("Enter movie start time: ");
			double starttime=sc.nextDouble();
			System.out.println("Enter movie end time: ");
			double	endtime=sc.nextDouble();
			System.out.println("Enter movie ticket price: ");
			double ticketprice=sc.nextDouble();
obj.setMovie(name, starttime, endtime, ticketprice);
obj.getMovie();
}}
