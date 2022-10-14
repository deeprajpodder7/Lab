package Lab13Oct;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class MyRegex {
	/*String num = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])"; */
	String num = "(2[0-5][0-5]|[01]?[0-9][0-9]?)";
	String pattern = num + "." + num + "." + num + "." + num;
}

public class Solution2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String IP = sc.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}
	}
}
