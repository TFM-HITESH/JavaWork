import java.io.*;
import java.util.*;

public class file1
{
    public static void main(String args[])
    {
        try
        {
            FileOutputStream fOut = new FileOutputStream("file1.txt");
            fOut.write(104);
            
            FileInputStream fIn = new FileInputStream("file1.txt");
            int data = fIn.read();
            
            System.out.println((char) data);
            fIn.close();
            fOut.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found in system.");
        }
        catch(IOException e)
        {
            System.out.println("IO Error");
        }
    }
}	 	  	 	  		     	    			  	 	
