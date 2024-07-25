import java.util.*;

class Student
{
    int RegNumber;
    String Name;
    String City;
    int Phone;
    
    void Set_Profile()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the registration number : ");
        this.RegNumber = sc.nextInt();
        System.out.println("Enter the name : ");
        this.Name = sc.next();
        System.out.println("Enter the city name : ");
        this.City = sc.next();
        System.out.println("Enter the phone number : ");
        this.Phone = sc.nextInt();
    }
    
    void View_Profile()
    {
        System.out.println("Registration number = " + this.RegNumber);
        System.out.println("Name = " + this.Name);
        System.out.println("City Name = " + this.City);
        System.out.println("Phone number = " + this.Phone);
    }
    
    static void Search_Student(Student s[])
    {
        for(int i=0;i<s.length;i++)
        {
            if(s[i].City.equals("Vellore"))
            {
                s[i].View_Profile();
            }	 	  	 	  		     	    			  	 	
        }
    }
}

public class class3
{
    public static void main(String args[])
    {
        Student s[] = new Student[5];
        
        for(int i=0;i<s.length;i++)
        {
            s[i] = new Student();
        }
        
        System.out.println("Begin by setting all the student profiles :");
        for(int i=0;i<s.length;i++)
        {
            s[i].Set_Profile();
        }
        
        System.out.println("After searching for students in Vellore City : ");
        Student.Search_Student(s);
    }
}
