class Person
{
    String name;
    String dob;
    
    Person(String name, String dob)
    {
        this.name = name;
        this.dob = dob;
        
        System.out.println("Name = "+this.name);
        System.out.println("DOB = "+this.dob);
    }
}

class Student extends Person
{
    String studentID;
    String studentSchool;
    
    Student(String name, String dob, String studentID, String studentSchool)
    {
        super(name, dob);
        this.studentID = studentID;
        this.studentSchool = studentSchool;
        
        System.out.println("Student ID = "+this.studentID);
        System.out.println("Student School = "+this.studentSchool);
    }
}

public class inherit7
{
    public static void main(String args[])
    {
        Student s = new Student("Test","01/01/0001","22BCE1234","SCOPE");
    }	 	  	 	  		     	    			  	 	
}
