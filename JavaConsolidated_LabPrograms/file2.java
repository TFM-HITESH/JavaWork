import java.io.*;
import java.util.*;

public class file2
{
    public static void main(String args[])
    {
        try
        {
            FileOutputStream fOut = new FileOutputStream("file2.txt", true);
            byte arr[] = {65,66,67,68,69,70,71,72,73,74,75};
            
            for(byte b : arr)
            {
                fOut.write(b);
            }
            
            fOut.close();
            System.out.println("File Write successful");
            
            FileInputStream fIn = new FileInputStream("file2.txt");
            
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
            System.out.println("\nFile Read successful");
            
        }	 	  	 	  		     	    			  	 	
        catch(IOException e)
        {
            System.out.println("Error");
        }
    }
}