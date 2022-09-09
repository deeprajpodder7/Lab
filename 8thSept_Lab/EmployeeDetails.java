package Rough;

class  Employee {
	static String emp_name;
	static int emp_id;
Employee(String emp_name, int emp_id){
	Employee.emp_name=emp_name;
	Employee.emp_id=emp_id;
}

	

public static void display(String emp_name,int emp_id) {
	System.out.println("The name of employee is " +emp_name);
	System.out.println("The id of employee is " +emp_id);
}
 public class EmployeeDetails{
	public static void main(String[] args) {
		display("Ram",42);
		display("Shuvam",30);
		display("Mukesh",24);
	}}}

	

	
	

