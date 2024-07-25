import java.io.*;
import java.util.*;

class Employee implements Serializable
{
    public String name;
    public String empId;
    
    Employee(String name, String empId)
    {
        this.name = name;
        this.empId = empId;
    }
    
    Employee()
    {
        this.name = "test";
        this.empId = "test";
    }
    
    public void display()
    {
        System.out.println("Name = " + this.name);
        System.out.println("EMPID = " + this.empId);
    }
}

public class file8
{
    public static void main(String args[])
    {
        try
        {
            //writing
            
            Employee eIn = new Employee("Hitesh", "1234");
            
            ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("file8.txt", true));
            
            eIn.display();
            objOut.writeObject(eIn);
            
            objOut.close();
            System.out.println("File Write Successful !");
            
            
            //reading
            
            Object obj = new Object();
            
            ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("file8.txt"));
            
            obj = objIn.readObject();
            
            Employee eOut = new Employee();
            eOut = (Employee)obj;
            
            eOut.display();
            
            objIn.close();
            System.out.println("File Read Successful !");
        }	 	  	 	  		     	    			  	 	
        catch(IOException e)
        {
            System.out.println("Sorry");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Sorry");
        }
    }
}