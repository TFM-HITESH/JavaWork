class Course
{
    String courseID;
    String courseName;
    String courseSlot;
    
    Course()
    {
        this.courseID = "BCSE103L";
        this.courseName = "Java Programming Lab";
        this.courseSlot = "TG2 + L13,14,25,26";
    }
    
    public void display_courseData()
    {
        System.out.println("The course ID is = "+this.courseID);
        System.out.println("The course name is = "+this.courseName);
        System.out.println("The course slot is = "+this.courseSlot);
        System.out.println();
    }
}


public class cstr1
{
    public static void main(String args[])
    {
        //to create three objs and display
        
        Course c1 = new Course();
        c1.display_courseData();
        Course c2 = new Course();
        c2.display_courseData();
        Course c3 = new Course();
        c3.display_courseData();
    }	 	  	 	  		     	    			  	 	
}