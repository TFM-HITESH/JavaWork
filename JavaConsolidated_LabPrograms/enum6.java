import java.util.*;
enum semester {FALL, WINTER, SUMMER, WEEKEND};

class Student
{
    String name;
    String regno;
    String gender;
    String phone;
    String email;
    semester sem;
    
    public void set_details()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        this.name = sc.next();
        System.out.println("Enter your regno:");
        this.regno = sc.next();
        System.out.println("Enter your gender:");
        this.gender = sc.next();
        System.out.println("Enter your phone:");
        this.phone = sc.next();
        System.out.println("Enter your email:");
        this.email = sc.next();
        System.out.println("Enter your semester in full caps:");
        String tempSem = sc.next();
        this.sem = semester.valueOf(tempSem);
    }
    
    public void get_details()
    {
        System.out.println("Name = " + this.name);
        System.out.println("Regno = " + this.regno);
        System.out.println("Gender = " + this.gender);
        System.out.println("Phone = " + this.phone);
        System.out.println("Email = " + this.email);
        System.out.println("Semester = " + this.sem.toString());
    }	 	  	 	  		     	    			  	 	
    
    public static void displayFALL(Student s[])
    {
        for(int i=0;i<s.length;i++)
        {
            if(s[i].sem.toString().equals("FALL"))
            {
                s[i].get_details();
            }
        }
    }
    
    public static void displayCount(Student s[])
    {
        int fallCount = 0;
        int winterCount = 0;
        int summerCount = 0;
        int weekendCount = 0;
        
        for(int i=0;i<s.length;i++)
        {
            if(s[i].sem.toString().equals("FALL"))
            {
                fallCount++;
            }
            if(s[i].sem.toString().equals("WINTER"))
            {
                winterCount++;
            }
            if(s[i].sem.toString().equals("SUMMER"))
            {
                summerCount++;
            }
            if(s[i].sem.toString().equals("WEEKEND"))
            {
                weekendCount++;
            }	 	  	 	  		     	    			  	 	
        }
        
        System.out.println("FALL = "+ fallCount);
        System.out.println("WINTER = "+ winterCount);
        System.out.println("SUMMER = "+ summerCount);
        System.out.println("WEEKEND = "+ weekendCount);
    }
}

public class enum6
{
    public static void main(String args[])
    {
        Student s[] = new Student[2];
        
        for(int i=0;i<s.length;i++)
        {
            s[i] = new Student();
            s[i].set_details();
        }
        
        System.out.println("Students from Fall :");
        Student.displayFALL(s);
        
        System.out.println("Count of each semester : ");
        Student.displayCount(s);
        
    }
}	 	  	 	  		     	    			  	 	
