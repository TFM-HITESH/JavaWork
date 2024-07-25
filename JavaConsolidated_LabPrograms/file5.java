import java.util.*;
import java.io.*;
public class file5
{
    public static void main(String args[])
    {
        try
        {
            FileWriter fOut = new FileWriter("file5.txt", true);
            char c[] = {'a','b','c','d','e'};
            
            fOut.write(c);
            
            fOut.close();
            System.out.println("File Write Successful !");
            
            FileInputStream fIn = new FileInputStream("file5.txt");
            
            while(true)
            {
                byte data = (byte)fIn.read();
                if(data == -1)
                {
                    break;
                }
                System.out.print((char)data);
            }
            
            fIn.close();
            System.out.println("\nFile Read Successful");
            
        }
        catch(IOException e)
        {
            System.out.println("Error");
        }	 	  	 	  		     	    			  	 	
    }
}