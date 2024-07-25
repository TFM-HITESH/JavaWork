import java.util.*;
import java.io.*;

public class file10
{
    public static void main(String args[])
    {
        try
        {
            int i = 10;
            char c = 'h';
            boolean b = true;
            
            DataOutputStream dO = new DataOutputStream(new FileOutputStream("file10.txt", true));
            
            dO.writeInt(i);
            dO.writeChar(c);
            dO.writeBoolean(b);
            
            DataInputStream dI = new DataInputStream(new FileInputStream("file10.txt"));
            
            System.out.println(dI.readInt());
            System.out.println(dI.readChar());
            System.out.println(dI.readBoolean());
            
            dO.close();
            dI.close();
        }
        catch(Exception e)
        {
            System.out.println("Please submit a ticket report");
        }
    }
}	 	  	 	  		     	    			  	 	
