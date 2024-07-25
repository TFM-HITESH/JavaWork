import java.util.*;
class Address
{
    String street;
    String city;
    String country;
    String zipcode;
    
    public void Set_Address()
    {
        System.out.println("Enter the address :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your street : ");
        this.street = sc.next();
        System.out.println("Enter your city : ");
        this.city = sc.next();
        System.out.println("Enter your country : ");
        this.country = sc.next();
        System.out.println("Enter your zipcode : ");
        this.zipcode = sc.next();
    }
    
    public void View_Address()
    {
        System.out.println(this.street + this.city + this.country + this.zipcode);
    }
}

class Student
{
    String regNo;
    String name;
    String phone;
    int n;
    Address address[];
    
    public void set_studentData()
    {	 	  	 	  		     	    			  	 	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your details :");
        System.out.println("Enter your regno : ");
        this.regNo = sc.next();
        System.out.println("Enter your name : ");
        this.name = sc.next();
        System.out.println("Enter your phone : ");
        this.phone = sc.next();
        
        System.out.println("Enter the number of addresses you have : ");
        this.n = sc.nextInt();
        
        address = new Address[n];
        
        for(int i=0;i<address.length;i++)
        {
            this.address[i] = new Address();
            this.address[i].Set_Address();
        }
    }
    
    public void view_studentData()
    {
        System.out.println(this.regNo + this.name + this.phone);
        
        for(int i=0;i<address.length;i++)
        {
            this.address[i].View_Address();
        }
        System.out.println();
    }
}

public class association3
{
    public static void main(String args[])
    {	 	  	 	  		     	    			  	 	
        Student s[] = new Student[3];
        
        for(int i=0;i<s.length;i++)
        {
            s[i] = new Student();
            s[i].set_studentData();
        }
        
        for(int i=0;i<s.length;i++)
        {
            s[i].view_studentData();
        }
    }
}