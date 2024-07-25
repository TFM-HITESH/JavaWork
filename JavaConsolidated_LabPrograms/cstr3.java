import java.util.*;
class Course
{
    String courseID;
    String courseName;
    String courseSlot;
    String courseVenue;
    
    //default
    Course()
    {
        this.courseID = "test";
        this.courseName = "test";
        this.courseSlot = "test";
        this.courseVenue = "test";
    }
    
    //param
    Course(String courseID, String courseName, String courseSlot, String courseVenue)
    {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseSlot = courseSlot;
        this.courseVenue = courseVenue;
    }
    
    public void display_courseData()
    {
        System.out.println("Course ID = "+this.courseID);
        System.out.println("Course Name = "+this.courseName);
        System.out.println("Course Slot = "+this.courseSlot);
        System.out.println("Course Venue = "+this.courseVenue);
        System.out.println();
    }
}

public class cstr3
{	 	  	 	  		     	    			  	 	
    public static void main(String args[])
    {
        Course c[] = new Course[2];
        Scanner sc = new Scanner(System.in);
        
        //param
        System.out.println("Enter the course data : ");
        for(int i=0;i<c.length;i++)
        {
            System.out.println("Enter course ID : ");
            String courseID = sc.next();
            System.out.println("Enter course Name : ");
            String courseName = sc.next();
            System.out.println("Enter course Slot : ");
            String courseSlot = sc.next();
            System.out.println("Enter course Venue : ");
            String courseVenue = sc.next();
            c[i] = new Course(courseID, courseName, courseSlot, courseVenue);
        }
        
        for(int i=0;i<c.length;i++)
        {
            c[i].display_courseData();
        }
        
        //default
        Course cobj = new Course();
        cobj.display_courseData();
    }
}	 	  	 	  		     	    			  	 	
