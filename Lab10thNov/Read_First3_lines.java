package Lab10thNov;

import java.io.*;

public class Read_First3_lines {

	public static void main(String[] args) throws Exception {
		BufferedReader read = new BufferedReader(	new FileReader("C:\\Users\\Deepraj Podder\\OneDrive\\Desktop\\File.txt"));
		String Line = read.readLine(); // Storing line
		int i = 0;
		while ((Line != null) && (i < 3)) {
			System.out.println(Line);
			Line = read.readLine();
			i++;
		}
		read.close();
	}

}
