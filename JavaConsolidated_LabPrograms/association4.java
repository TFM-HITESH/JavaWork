import java.util.*;
class Course
{
    String courseid;
    String coursename;
    
    public void set_course()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the course id :");
        this.courseid = sc.next();
        System.out.println("Enter the course name :");
        this.coursename = sc.next();
    }
    
    public void get_course()
    {
        System.out.println("Course id = "+this.courseid);
        System.out.println("Course name ="+this.coursename);
        System.out.println();
    }
}

class Employee
{
    String name;
    String empid;
    Course courseassigned = new Course();
    
    public void set_employee(Course c)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee name :");
        this.name = sc.next();
        System.out.println("Enter the employee id :");
        this.empid = sc.next();
        this.courseassigned.courseid = c.courseid;
        this.courseassigned.coursename = c.coursename;
    }	 	  	 	  		     	    			  	 	
    
    public void get_employee()
    {
        System.out.println("The employee name = "+this.name);
        System.out.println("The employee id = "+this.empid);
        System.out.println("The course name = "+this.courseassigned.coursename);
        System.out.println("The course id = "+this.courseassigned.courseid);
        System.out.println();
    }
}

public class association4
{
    public static void main(String args[])
    {
        Course c = new Course();
        c.set_course();
        c.get_course();
        
        Employee e = new Employee();
        e.set_employee(c);
        e.get_employee();
    }
}