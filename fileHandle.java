
import java.io.*;

public class fileHandle 
{
    public static void main(String args[])
    {
        try
        {
            FileInputStream fIn = new FileInputStream("Test.txt");
            FileOutputStream fOut = new FileOutputStream("output.txt", true);
            
            int data;

            while(true)
            {
                data = fIn.read();
                if(data == -1)
                {
                    break;
                }
                else
                {
                    fOut.write(data);
                }       
            }

            fIn.close();
            fOut.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("file has not been found");
        }
        catch(IOException e)
        {
            System.out.println("IO exception encountered");
        }
    }
    
}
