package Lab17thNov;

//Write a Java program to extract a portion of an array list.

import java.util.ArrayList;

public class ProblemStatement2 {
	public static void main(String[] args) {
       ArrayList<String> colours = new ArrayList<>();  // created an ArrayList

        // adding some elements to the ArrayList
        colours.add("Red");
        colours.add("Green");
        colours.add("Orange");
        colours.add("White");
        colours.add("Black");
        System.out.println(" Original ArrayList: " + colours);

        // element from 1 to 3
        System.out.println(" Portion of the List: " + colours.subList(0, 3));
    }
}

