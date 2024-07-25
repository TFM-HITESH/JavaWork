import java.util.Scanner;
class Person
{
    protected String name;
    protected String address;
    
    public void set_details()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the name :");
        this.name = sc.next();
        System.out.println("Enter the address :");
        this.address = sc.next();
    }
    
    public void get_details()
    {
        System.out.println("The name = "+this.name);
        System.out.println("The address = "+this.address);
    }
}

class Student extends Person
{
    protected String regno;
    
    public void set_details()
    {
        super.set_details();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the reg no : ");
        this.regno = sc.next();
    }	 	  	 	  		     	    			  	 	
    
    public void get_details()
    {
        super.get_details();
        System.out.println("The regno = "+this.regno);
    }
}

public class inherit1
{
    public static void main(String args[])
    {
        Student s = new Student();
        
        System.out.println("Creating a student object :");
        s.set_details();
        s.get_details();
    }
}