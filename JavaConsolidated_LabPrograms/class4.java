import java.util.*;
class Employee
{
    int empID;
    String name;
    String dob;
    int phone;
    
    void Set_EmployeeInfo()
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter EMP ID : ");
        this.empID = sc.nextInt();
        System.out.println("Enter the name : ");
        this.name = sc.next();
        System.out.println("Enter the dob(YYYY/MM/DD) : ");
        this.dob = sc.next();
        System.out.println("Enter the phone number : ");
        this.phone = sc.nextInt();
    }
    
    void View_Profile()
    {
        System.out.println("Employee ID = " + this.empID);
        System.out.println("Name = " + this.name);
        System.out.println("DOB = " + this.dob);
        System.out.println("Phone number = " + this.phone);
    }
    
    static void View_RetirementInfo(Employee e[])
    {
        for(int i=0;i<e.length;i++)
        {
            String year = e[i].dob.substring(0,4);
            int yearInt = Integer.parseInt(year);
            if ((yearInt+58) > 2030)
            {	 	  	 	  		     	    			  	 	
                e[i].View_Profile();
            }
        }
    }
}

public class class4
{
    public static void main(String args[])
    {
        Employee e[] = new Employee[3];
        
        for(int i=0;i<e.length;i++)
        {
            e[i] = new Employee();
        }
        
        System.out.println("Enter details for the 3 employees :");
        for(int i=0;i<e.length;i++)
        {
            e[i].Set_EmployeeInfo();
        }
        
        System.out.println("Employees retiring after 2030 are : ");
        Employee.View_RetirementInfo(e);
    }
}	 	  	 	  		     	    			  	 	
