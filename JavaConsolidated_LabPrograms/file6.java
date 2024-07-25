import java.util.*;
import java.io.*;

public class file6
{
    public static void main(String args[])
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string to be entered into file :");
            String input = sc.next();
            
            FileOutputStream fOut = new FileOutputStream("file6.txt",true);
            
            for(int i=0;i<input.length();i++)
            {
                fOut.write(input.charAt(i));
            }
            
            System.out.println("File Write Successful !");
            
            
            FileInputStream fIn = new FileInputStream("file6.txt");
            
            while(true)
            {
                int data = fIn.read();
                
                if(data == -1)
                {
                    break;
                }
                
                else
                {
                    System.out.print((char)data);
                }	 	  	 	  		     	    			  	 	
            }
            
            System.out.println("\nFile read Successful !");
            
            fOut.close();
            fIn.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        catch(IOException e)
        {
            System.out.println("IO exception encountered");
        }
        catch(Exception e)
        {
            System.out.println("Thanks for using the software, please create a ticket to report the error.");
        }
    }
    
}
