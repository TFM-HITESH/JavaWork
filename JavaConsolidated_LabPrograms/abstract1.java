abstract class Person
{
    String name;
    String address;
    float salary;
    
    Person(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
    
    abstract public void calc_salary();
    
    public void display_details()
    {
        System.out.println("Name = "+this.name);
        System.out.println("Address = "+this.address);
        System.out.println("Salary = "+this.salary);
    }
}

class Faculty extends Person
{
    String facultyID;
    String facultySchool;
    
    Faculty(String name, String address, String facultyID, String facultySchool)
    {
        super(name, address);
        this.facultyID = facultyID;
        this.facultySchool = facultySchool;
    }
    
    public void calc_salary()
    {	 	  	 	  		     	    			  	 	
        //implement salary formula here . . . . 
        super.salary = 10000;
    }
    
    public void display_details()
    {
        super.display_details();
        System.out.println("Faculty ID = "+this.facultyID);
        System.out.println("Faculty School = "+this.facultySchool);
    }
}

public class abstract1
{
    public static void main(String args[])
    {
        Faculty f = new Faculty("Test","Vellore","12345","SCOPE");
        f.calc_salary();
        f.display_details();
    }
}