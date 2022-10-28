package Lab28thOct;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); // Creating scanner object 
        System.out.println("Enter 1st Number: ");
        int x = sc.nextInt(); // Taking integer input
        System.out.println("Enter 2nd Number: ");
        int y = sc.nextInt();
        if (x < 0 && y < 0) { // checking condition
            try { // Try block
                throw new Exception("Both numbers are negative"); // Throwing new exception
            } catch (Exception e) {
                System.out.println(e.getMessage()); // Printing the message
            }
        } else if (x > 1 && y > 1) { // checking another condition
            System.out.println("Product of two numbers is: " + x * y); // printing output 
        } else {
            try {
                throw new Exception("x and y should not be zero."); // Throwing another exception
            } catch (Exception e) { // Catch block
                System.out.println(e);
            }
        }

    }
}