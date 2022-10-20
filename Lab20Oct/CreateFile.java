package Lab20Oct;

import java.io.File;   
import java.io.IOException;  
public class CreateFile
{
    public static void main(String args[])
    {  
          try {  
                   File fcreate = new File("C:\\Users\\Deepraj Podder\\OneDrive\\Desktop\\NewFile.txt");   
                    if (fcreate.createNewFile()) {  
                        System.out.println("File " + fcreate.getName() + " is created successfully.");
                    }
                     else {  
                              System.out.println("File is already exist in the directory."); 
                            }
                            } catch (IOException exception) {  
                          System.out.println("An unexpected error is occurred.");  
                          exception.printStackTrace();  
              }   
}
}