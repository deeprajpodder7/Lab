package Lab17thNov;

//Write a Java program to compare two array lists.

import java.util.ArrayList;

public class ProblemStatement3 {
public static void main(String[] args) {
	ArrayList<String> colours1 = new ArrayList<>();  // created an ArrayList
    // adding some elements to the ArrayList
    colours1.add("Red");
    colours1.add("Green");
    colours1.add("Orange");
    colours1.add("White");
    colours1.add("Black");
    System.out.println(" ArrayList 1 : " + colours1);

    ArrayList<String> colours2 = new ArrayList<>();  // created an ArrayList
    // adding some elements to the second ArrayList
    colours2.add("Red");
    colours2.add("Green");
    colours2.add("Orange");
    colours2.add("Black");
    System.out.println(" ArrayList 2 : " + colours2);

    //Storing the comparison output in new ArrayList
    ArrayList<String> colours3= new ArrayList<String>();
    for (String i : colours1)
        colours3.add(colours2.contains(i) ? "Yes" : "No");
    System.out.println(colours3);
}
}
