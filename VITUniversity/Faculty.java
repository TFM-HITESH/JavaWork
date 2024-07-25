package VITUniversity;

import java.util.Scanner;

public class Faculty 
{
    public String empId;
    public String name;
    public String designation;

    public void set()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your employee number :");
        this.empId = sc.next();
        System.out.println("Enter your name :");
        this.name = sc.next();
        System.out.println("Enter your designation :");
        this.designation = sc.next();
    }

    public void display()
    {
        System.out.println("The employee number of faculty is =" + this.empId);
        System.out.println("The name of the faculty is = " + this.name);
        System.out.println("The designation of the faculty is = " + this.designation);
    }
}
