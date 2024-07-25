import java.util.*;
import java.io.*;

class Student
{
    String name;
    String regID;
    
    public Student(String name, String regID)
    {
        this.name = name;
        this.regID = regID;
    }
}

class Course
{
    String name;
    String courseID;
    
    public Course(String name, String courseID)
    {
        this.name = name;
        this.courseID = courseID;
    }
}

public class generic4
{
    public static void main(String args[])
    {
        Student s[] = new Student[2];
        Course c[] = new Course[2];
        
        s[0] = new Student("Hitesh","22BCE2318");
        s[1] = new Student("Shreya","22BCE0143");
        
        c[0] = new Course("Java","BCSE102L");
        c[1] = new Course("Python","BCSE101L");
        
        display(s);
        display(c);
    }	 	  	 	  		     	    			  	 	
    
    public static <T> void display(T arr[])
    {
        for(T ele : arr)
        {
            if(ele instanceof Student)
            {
                System.out.println(((Student)ele).name + " " + ((Student)ele).regID);
            }
            if(ele instanceof Course)
            {
                System.out.println(((Course)ele).name + " " + ((Course)ele).courseID);
            }
        }
    }
}

