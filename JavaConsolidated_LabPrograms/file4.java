import java.util.*;
import java.io.*;
public class file4 
{
    public static void main(String[] args) 
    {
        try
        {
            FileWriter fOut = new FileWriter("file4.txt");
            fOut.write(104);
            
            FileReader fIn = new FileReader("file4.txt");
            int data = fIn.read();
            
            System.out.println(data);
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
