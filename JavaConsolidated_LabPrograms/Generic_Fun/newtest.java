import java.io.*;
import java.util.*;

//Create an array of emloyee objects, write them all to an Arraylist. Write it to a file. Read from the file, traverse it.
public class newtest 
{
    public static void main(String args[])
    {
        LinkedList<Employee> l = new LinkedList<>();

        Employee e[] = new Employee[3];
        e[0] = new Employee("Test1", "1111");
        e[1] = new Employee("Test2", "2222");
        e[2] = new Employee("Test3", "3333");
		
        l.add(e[0]);
        l.add(e[1]);
        l.add(e[2]);

		//System.out.println(l);
        ListIterator<Employee> litr = l.listIterator(l.size());
        
        while(litr.hasPrevious())
        {
            Employee emp = litr.previous();
			emp.display();
            try
            {
                ObjectOutputStream objo = new ObjectOutputStream(new FileOutputStream("myfile.txt",true));
                objo.writeObject(emp);
            }
            catch(Exception e1)
            {
                System.out.println(e1.getMessage());
            }
        }

        try
        {
            ObjectOutputStream objo1 = new ObjectOutputStream(new FileOutputStream("myfile.txt",true));
            Employee endEmployee = new Employee("END", "END");
            objo1.writeObject(endEmployee);
        }
        catch(Exception myeee)
        {
            System.out.println(myeee.getMessage());
        }

		
        System.out.println("Writing complete !");

        LinkedList<Employee> lcopy = new LinkedList<>();

        try
        {
            ObjectInputStream obji = new ObjectInputStream(new FileInputStream("myfile.txt"));
            while(true)
            {
                Employee ein = (Employee)obji.readObject();
				ein.display();
                if(ein.empid.equals("END"))
                {
                    break;
                }
                else
                {
                    lcopy.add(ein);
                }
            }
        }
        catch(Exception mye)
        {
            System.out.println(mye.getMessage());
        }

        ListIterator<Employee> litr2 = lcopy.listIterator();
		System.out.println(lcopy);
        while(litr2.hasPrevious())
        {
            Employee eshow = (Employee)litr2.previous();
			eshow.display();
        }

        System.out.println("Reading Complete");
    }    
}

class Employee implements Serializable
{
    String name;
    String empid;

    public Employee(String name, String empid)
    {
        this.name = name;
        this.empid = empid;
    }

    public void display()
    {
        System.out.println(this.name + " " + this.empid);
    }
}
