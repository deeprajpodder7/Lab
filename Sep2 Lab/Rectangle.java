package Sep2Lab;

/* Q.2 you will make a class ‘Rectangle’ and declare the variable length and breadth as private. 
One Constructor will be used for initializing the value of variables. When an object is created, 
the constructor will be called and the default value of the instance variables will be assigned. 
Now create another new class ‘RectangleTest’ & create an object of class Rectangle and 
assign values of the parameter used in constructor. Calculate area of the rectangle and print 
it on the console. Let’s update the new value of variable. And then read the updated value. */

public class Rectangle {
	private int length;
	private int breadth;
	Rectangle(int l,int b){
		length=l;
		breadth=b;		
	}

void calculateArea() {
	int area =length*breadth;
	System.out.println("the area is :"+area);
}
class RectangleTest{
	public static void main(String[] args) {
		Rectangle rec=new Rectangle(20,20);
		Rectangle rec1=new Rectangle(30,30);
		rec.calculateArea();
		rec1.calculateArea();
		}}}

