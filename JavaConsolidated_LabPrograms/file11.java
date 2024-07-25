import java.util.*;
import java.io.*;

public class file11
{
    public static void main(String args[])
    {
        try
        {
            BufferedOutputStream bO = new BufferedOutputStream(new FileOutputStream("file11.txt",true));
            BufferedInputStream bI = new BufferedInputStream(new FileInputStream("file11.txt"));
            
            
            char b[] = {'a','b','c'};
            
            for(int i=0;i<b.length;i++)
            {
                bO.write(b[i]);
            }
            
            //writing complete
            
            while(true)
            {
                int data = bI.read();
                if(data == -1)
                {
                    break;
                }
                else
                {
                    System.out.print((char)data + " ");
                }
            }

            bI.close();
            bO.close();
            
            //reading complete
        }	 	  	 	  		     	    			  	 	
        catch(Exception e)
        {
            System.out.println("Please submit an exception ticket !");
        }
    }
}