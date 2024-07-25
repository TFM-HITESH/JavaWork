import java.util.*;
import java.io.*;

public class file9 
{
    public static void main(String args[]) 
    {
        try 
        {
            ObjectOutputStream objw = new ObjectOutputStream(new FileOutputStream("file9.txt", true));
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream("file9.txt"));

            Employee emp[] = new Employee[2];
            Scanner sc = new Scanner(System.in);
            String name;
            int empid;
            for (int i = 0; i < emp.length; i++) 
            {
                System.out.println("Enter name of the employee : ");
                name = sc.next();
                System.out.println("Enter ID of the employee : ");
                empid = sc.nextInt();
                emp[i] = new Employee(name, empid);
            }

            for (int i = 0; i < emp.length; i++) 
            {
                objw.writeObject(emp[i]);
            }
            for (int i = 0; i < emp.length; i++) 
            {
                Object objr = obj.readObject();
                Employee empr = (Employee) objr;
                empr.display();
            }

        } 
        catch (Exception e) 
        {
            System.out.println("Exception handled");
        } 
    }
}

class Employee implements Serializable 
{
    public int empid;
    public String name;

    Employee() 
    {
        this.name = "test";
        this.empid = 0;
    }

    Employee(String name, int empid) 
    {
        this.name = name;
        this.empid = empid;
    }

    public void display() 
    {
        System.out.println(this.name + this.empid);
    }
}
