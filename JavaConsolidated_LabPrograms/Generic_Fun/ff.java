import java.io.*;
import java.util.*;

public class ff 
{
    public static void main(String[] args) 
    {
        try
        {
            Student s = new Student("Hitesh", "1234", "geetha", "00/00/0000");

            ObjectOutputStream objo = new ObjectOutputStream(new FileOutputStream("file.txt",true));
            objo.writeObject(s);
            objo.close();

            ObjectInputStream obji = new ObjectInputStream(new FileInputStream("file.txt"));
            Student snew = (Student)obji.readObject();
            snew.display();
            obji.close();
        }
        catch(Exception e)
        {
            System.out.println("error");
            System.out.println(e.getMessage());
        }
        
    }
}


class Student implements Serializable
{
    String name;
    String id;
    Parent p;

    public Student(String name, String id, String parentname, String dob)
    {
        this.name = name;
        this.id = id;
        p = new Parent(parentname, dob);
    }

    public void display()
    {
        System.out.println(this.name + this.id + this.p.name + this.p.dob);
    }
}


class Parent implements Serializable
{
    String name;
    String dob;

    public Parent(String name, String dob)
    {
        this.name = name;
        this.dob = dob;
    }

    
}