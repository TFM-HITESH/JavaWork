import java.io.FileOutputStream;
import java.util.Scanner;

public class test1 
{
    public static void main(String[] args) 
    {
        try
        {
            throw new Exception("hello");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
