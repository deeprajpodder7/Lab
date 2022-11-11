package Lab10thNov;

import java.io.*;
import java.util.Scanner;

public class Longest_Word {
public static void main(String[] args) throws Exception {
	String CurrentC, LongWord="";
	Scanner sc = new Scanner (new File("C:\\Users\\Deepraj Podder\\OneDrive\\Desktop\\File.txt")); //importing file into scanner class
	while(sc.hasNext()) { //reading each word
		CurrentC =sc.next(); //storing words in another string
		if(CurrentC.length()>LongWord.length()) { LongWord= CurrentC;} //comparing each word and storing
	System.out.println("Longest Word: " +LongWord); //printing longest word
	}
}
}
