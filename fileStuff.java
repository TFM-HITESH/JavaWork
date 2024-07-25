import java.io.*;
import java.util.*;
import java.io.Serializable;

public class fileStuff 
{
    public static void main(String args[])
    {
        try
        {
            ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("mytext.txt", true));
            Employee e = new Employee("hitesh","1234");
            e.display();

            objOut.writeObject(e);
            System.out.println("Write success");

            objOut.close();

            ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("mytext.txt"));
            Object o = new Object();

            
            o = objIn.readObject();

            Employee newE = (Employee)o;
            
            System.out.println(newE.name);
            newE.display();
            objIn.close();

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("hii");
        }
    }    
}

class Employee implements Serializable
{
    public String name;
    public String empno;

    public Employee(String name, String empno)
    {
        this.name = name;
        this.empno = empno;
    }

    public Employee()
    {
        this.name = "test";
        this.empno = "test";
    }

    public void display()
    {
        System.out.println(this.name);
        System.out.println(this.empno);
    }
}