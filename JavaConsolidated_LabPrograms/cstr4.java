import java.util.*;

class Course
{
    String courseID;
    String courseName;
    String courseSlot;
    String courseVenue;
    
    Course(String courseID, String courseName, String courseSlot, String courseVenue)
    {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseSlot = courseSlot;
        this.courseVenue = courseVenue;
    }
    
    Course()
    {
        this.courseID = "test";
        this.courseName = "test";
        this.courseSlot = "test";
        this.courseVenue = "test";
    }
    
    public void displayCourse()
    {
        System.out.println("Course ID = "+this.courseID);
        System.out.println("Course Name = "+this.courseName);
        System.out.println("Course Slot = "+this.courseSlot);
        System.out.println("Course Venue = "+this.courseVenue);
        System.out.println();
    }
}

public class cstr4
{	 	  	 	  		     	    			  	 	
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Course c[] = new Course[3];
        
        System.out.println("Enter course details : ");
        for(int i=0;i<c.length;i++)
        {
            System.out.println("Enter the course ID :");
            String courseID = sc.next();
            System.out.println("Enter the course Name :");
            String courseName = sc.next();
            System.out.println("Enter the course Slot :");
            String courseSlot = sc.next();
            System.out.println("Enter the course Venue :");
            String courseVenue = sc.next();
            
            c[i] = new Course(courseID, courseName, courseSlot, courseVenue);
        }
        
        for(int i=0;i<c.length;i++)
        {
            c[i].displayCourse();
        }
    }
}	 	  	 	  		     	    			  	 	
