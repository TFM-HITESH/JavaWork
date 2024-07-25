import java.util.*;
class Person
{
    String name;
    String dob;
    
    Person(String name, String dob)
    {
        this.name = name;
        this.dob = dob;
    }
    
    public void display()
    {
        System.out.println("Name = "+this.name);
        System.out.println("DOB = "+this.dob);
    }
}

class Faculty extends Person
{
    String facultyID;
    
    Faculty(String facultyID, String name, String dob)
    {
        super(name, dob);
        this.facultyID = facultyID;
    }
    
    public void display()
    {
        super.display();
        System.out.println("Faculty ID = "+this.facultyID);
    }
}

public class inherit3
{	 	  	 	  		     	    			  	 	
    public static void main(String args[])
    {
        System.out.println("Creating a faculty object : ");
        Faculty f = new Faculty("12345","Test","01/01/0001");
        
        f.display();
    }
}