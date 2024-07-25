import java.util.*;
import java.io.*;

public class file7
{
    public static void main(String args[])
    {
    
        
        try
        {
            FileReader f1 = new FileReader("file7_1.txt");
            FileWriter f2 = new FileWriter("file7_2.txt",true);
            FileReader f3 = new FileReader("file7_2.txt");
            
            while(true)
            {
                int data = f1.read();
                
                if(data == -1)
                {
                    break;
                }
                else
                {
                    System.out.print((char)data);
                    f2.write((char)data);
                }
            }
            
            System.out.println("\nWriting done. Now to read from other file : ");
            while(true)
            {
                int data = f3.read();
                if(data == -1)
                {
                    break;
                }	 	  	 	  		     	    			  	 	
                else
                {
                    System.out.print((char)data);
                }
            }

            f1.close();
            f2.close();
            f3.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        catch(IOException e)
        {
            System.out.println("IOexception");
        }
        catch(Exception e)
        {
            System.out.println("Please submit an error ticket");
        }
    }
}
