import java.util.*;
class Student
{
    String regNumber;
    String name;
    String address[][] = new String[2][2];
    
    Student(String regNumber, String name, String permAdr, String tempAdr)
    {
        this.regNumber = regNumber;
        this.name = name;
        this.address[0][0] = "permanent"; 
        this.address[1][0] = "temporary";
        this.address[0][1] = permAdr;
        this.address[1][1] = tempAdr;
    }
    
    public static void searchAny(String search, Student s[])
    {
        System.out.println("Matching address :");
        for(int i=0;i<s.length;i++)
        {
            if(s[i].address[0][1].equals(search) || s[i].address[1][1].equals(search))
            {
                System.out.println("Reg number = "+s[i].regNumber);
                System.out.println("Name = "+s[i].name);
                System.out.println();
            }
        }
    }
    
    public static void searchPerm(String search, Student s[])
    {
        System.out.println("Matching permanent address :");
        for(int i=0;i<s.length;i++)
        {	 	  	 	  		     	    			  	 	
            if(s[i].address[0][1].equals(search))
            {
                System.out.println("Reg number = "+s[i].regNumber);
                System.out.println("Name = "+s[i].name);
                System.out.println();
            }
        }
    }
}

public class cstr5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Student s[] = new Student[3];
        
        System.out.println("Enter the student details : ");
        for(int i=0;i<s.length;i++)
        {
            System.out.println("Enter registration number :");
            String regNumber = sc.next();
            System.out.println("Enter name :");
            String name = sc.next();
            System.out.println("Enter permanent address :");
            String permAdr = sc.next();
            System.out.println("Enter temporary address :");
            String tempAdr = sc.next();
            
            s[i] = new Student(regNumber, name, permAdr, tempAdr);
        }
        
        System.out.println("Enter search key : ");
        String search = sc.next();
        Student.searchAny(search,s);
        Student.searchPerm(search,s);
    }	 	  	 	  		     	    			  	 	
}