import java.util.*;
import java.io.*;
public class file3
{
    public static void main(String args[])
    {
        try
        {
            FileOutputStream fOut = new FileOutputStream("file3.txt", true);
            byte b[] = {65,66,67,68,69,70};
            
            fOut.write(b);
            
            fOut.close();
            System.out.println("File Write Successful !");
            
            FileInputStream fIn = new FileInputStream("file3.txt");
            
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