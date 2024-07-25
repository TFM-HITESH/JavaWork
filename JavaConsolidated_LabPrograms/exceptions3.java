import java.io.*;
import java.util.*;
public class exceptions3 
{
    public static void main(String[] args) 
    {
        try
        {
            student s = new student();
            s.test();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Wrong input data type !");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println("IO Exception occured !");
        }
            
    }
}

class student
{
    String name;
    int mark;
    public student() throws InputMismatchException 
    {
        System.out.println("Enter the name");
        Scanner s = new Scanner(System.in);
        this.name=s.next();
        System.out.println("Enter the mark");
        this.mark=s.nextInt();
    
    }
    public void test() throws ArithmeticException, IOException
    {
        System.out.println(4/0);
    }
}	 
