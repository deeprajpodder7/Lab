package Lab10thNov;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreInArray {
    public static void main(String[] args) throws Exception {
        ArrayList<String> al = new ArrayList<>(); // creating arraylist
        BufferedReader read = new BufferedReader(	new FileReader("C:\\Users\\Deepraj Podder\\OneDrive\\Desktop\\File.txt"));
        String Line = read.readLine(); // Storing line
		int i = 0;
		while ((Line != null) && (i < 10)) {
			al.add(Line); Line= read.readLine(); i++; } //
    System.out.println(al); //printing the array list
    read.close(); //closing buffer reader
    }
}
