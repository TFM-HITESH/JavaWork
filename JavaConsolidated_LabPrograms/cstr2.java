class Course
{
    String courseID;
    String courseName;
    String courseSlot;
    
    public void display_courseData()
    {
        System.out.println("The course ID = "+this.courseID);
        System.out.println("The course name = "+this.courseName);
        System.out.println("The course slot = "+this.courseSlot);
        System.out.println();
    }
    
    Course(String courseID, String courseName, String courseSlot)
    {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseSlot = courseSlot;
    }
}

public class cstr2
{
    public static void main(String args[])
    {
        //note that these params can be taken from user using input too
        Course c1 = new Course("BCSE101","Python","A2");
        Course c2 = new Course("BCSE102","C,C++","B2");
        Course c3 = new Course("BCSE103","Java","C2");
        
        c1.display_courseData();
        c2.display_courseData();
        c3.display_courseData();
    }	 	  	 	  		     	    			  	 	
}