import java.util.*;
class Address
{
    String street;
    String district;
    String city;
    String zipcode;
    String country;
    
    public void set_address()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter address details : ");
        System.out.println("Enter the street:");
        this.street = sc.next();
        System.out.println("Enter the city:");
        this.city = sc.next();
        System.out.println("Enter the district:");
        this.district = sc.next();
        System.out.println("Enter the zipcode:");
        this.zipcode = sc.next();
        System.out.println("Enter the country:");
        this.country = sc.next();
    }
    
    public void get_address()
    {
        System.out.println("Street = "+this.street);
        System.out.println("City = "+this.city);
        System.out.println("District = "+this.district);
        System.out.println("Zipcode = "+this.zipcode);
        System.out.println("Country = "+this.country);
    }
}

class Employee
{	 	  	 	  		     	    			  	 	
    String employeeID;
    String name;
    Address address[] = new Address[2];
    
    public void set_employee()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee details : ");
        System.out.println("Enter your employee ID :");
        this.employeeID = sc.next();
        System.out.println("Enter your name :");
        this.name = sc.next();
        
        for(int i=0;i<address.length;i++)
        {
            this.address[i] = new Address();
            this.address[i].set_address();
        }
    }
    
    public void get_employee()
    {
        System.out.println("Employee ID = "+this.employeeID);
        System.out.println("Name = "+this.name);
        System.out.println();
        
        for(int i=0;i<address.length;i++)
        {
            System.out.println("Address #"+(i+1));
            this.address[i].get_address();
            System.out.println();
        }
    }
}

public class association2
{	 	  	 	  		     	    			  	 	
    public static void main(String args[])
    {
        Employee e[] = new Employee[1];
        
        for(int i=0;i<e.length;i++)
        {
            e[i] = new Employee();
            e[i].set_employee();
        }
        
        for(int i=0;i<e.length;i++)
        {
            e[i].get_employee();
        }
    }
}