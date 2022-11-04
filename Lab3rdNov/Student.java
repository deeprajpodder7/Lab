package Lab3rdNov;

public class Student{
public static void calculateFeesStructure(Long studentId,Character studentGrade,Double monthlyFees, Boolean isScholarshipEligible) {
	Double Fees;	
	if(studentId!=0 && studentGrade=='A' && isScholarshipEligible==true) {
			Fees = monthlyFees-(monthlyFees*0.1);
			System.out.println( "10% of fees is exempted, the calculated fees is " +Fees);
		}
		else if(studentId!=0 && studentGrade=='B' && isScholarshipEligible==true) {
			Fees = monthlyFees-(monthlyFees*0.08);
			System.out.println( "8% of fees is exempted, the calculated fees is " +Fees);
		}
		else if(studentId!=0 && studentGrade=='C' && isScholarshipEligible==true) {
			Fees = monthlyFees-(monthlyFees*0.06);
			System.out.println( "6% of fees is exempted, the calculated fees is " +Fees);
		}
		else if(studentId!=0 && studentGrade=='D' && isScholarshipEligible==true) {
			Fees = monthlyFees-(monthlyFees*0.04);
			System.out.println( "4% of fees is exempted, the calculated fees is " +Fees);
		}
		else 
			System.out.println("Not Eligible for Exemption");
	}
public void compareMarks(Long maths, Double english) {
int mathsmarks=maths.intValue();
int englishmarks=english.intValue();
if (mathsmarks>englishmarks) {
	System.out.println("Maths is higher than English");
}
else if (mathsmarks<englishmarks) {
	System.out.println("English is higher than Maths");
}
else
	System.out.println("Equal");

}
public void validateFees(Double Fees) {
	if(Fees.isInfinite()) {
		System.out.println("Fees is infinite");
	}
	else
		{ System.out.println("Fees is not infinite");}
	byte byteValue= Fees.byteValue(); System.out.println("the Byte Value is: " +byteValue);
}
public static void main(String[] args) {
	Student obj=new Student();
	Student obj2=new Student();
	Student obj3=new Student();
	System.out.println("Test Case 1: ");
	obj.calculateFeesStructure((long) 234, 'C', (double)600, true);
	obj.compareMarks((long)65,(double)85);
	
	System.out.println("Test Case 2: ");
	obj2.calculateFeesStructure((long) 115, 'B', (double)909.50, true);
	obj2.compareMarks((long)98,(double)56);
	
	System.out.println("Test Case 3: ");
	obj3.calculateFeesStructure((long) 980, 'G', (double)1810, false);
	obj3.compareMarks((long)84,(double)84);
	
	obj.validateFees((double)5000);

	
	
	
}
}

