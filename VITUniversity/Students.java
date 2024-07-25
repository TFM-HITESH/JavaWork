package VITUniversity;

import java.util.Scanner;

public class Students 
{
    public String regNo;
    public String name;
    public String address;

    public void set()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your registration number :");
        this.regNo = sc.next();
        System.out.println("Enter your name :");
        this.name = sc.next();
        System.out.println("Enter your address :");
        this.address = sc.next();
    }

    public void display()
    {
        System.out.println("The registration number of student is =" + this.regNo);
        System.out.println("The name of the student is = " + this.name);
        System.out.println("The address of the student is = " + this.address);
    }    
}
