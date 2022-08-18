//Write a Java program to convert minutes into a number of years and days.

package Practical18thAug;

public class Years {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int mins= 3456789;
int days= mins/1440;
int years = days/365;
System.out.println("Number of years:" + years);
System.out.println("Number of days:" + days);
	}

}
