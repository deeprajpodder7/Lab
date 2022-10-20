package Lab20Oct;

class CustomException extends Exception { //CustomException class extending Exception class
	   String message; // local variable message to store the exception message locally in the class object
	   CustomException(String str) { //passing a string argument to the constructor of the custom exception
	      message = str;
	   } 
	   public String toString() { //toString() method is used to print out the exception message.
	      return ("Custom Exception Occurred : " + message);
	   }
	}
	public class MainException {
	   public static void main(String args[]) {
	      try {													// throwing a CustomException using one try-catch block in the main method
	         throw new CustomException("This is a custom message");
	      } catch(CustomException e) {
	         System.out.println(e);
	      }
	   }
	}