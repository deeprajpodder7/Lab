package Lab10Oct;

import java.util.*;

class StudentClass {
	int studentNo;
	double fees;
	String studentName, studentMailID, studentAddress;

	public StudentClass(int studentNo, String studentName, String studentMailID, String studentAddress, double fees) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.studentMailID = studentMailID;
		this.studentAddress = studentAddress;
		this.fees = fees;
	}

	void feesCal(int studentNo,double fees) {
		double newfees = 0;
		if (fees < 2000) {
			newfees = fees + (0.1 * fees);
		}
		System.out.println(" Student fees: " + newfees);
	}

	void display() {

		System.out.println(" Student No.: " + studentNo + " Student Name: " + studentName + " Student Email: "
				+ studentMailID + " Student Address: " + studentAddress);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		StudentClass[] s = new StudentClass[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("Student No.: ");
			int studentNo = sc.nextInt();
			sc.nextLine();
			System.out.print("Student Name: ");
			String studentName = sc.nextLine();
			System.out.print("Email: ");
			String studentMailID = sc.nextLine();
			System.out.print("Address: ");
			String studentAddress = sc.nextLine();
			System.out.print("fees: ");
			double fees = sc.nextDouble();
			s[i] = new StudentClass(studentNo, studentName, studentMailID, studentAddress, fees);
			s[i].display();
			s[i].feesCal(studentNo,fees);

		}
	}
}
