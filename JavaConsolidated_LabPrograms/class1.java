import java.io.*;
import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

class Student
{
    String name;
    String regNo;

    Student(String name, String regNo)
    {
        this.name = name;
        this.regNo = regNo;
    }

    public void display()
    {
        System.out.println("Student name = " + this.name);
        System.out.println("Student registration number = " + this.regNo);
    }
}

class Faculty
{
    String name;
    String facultyID;

    Faculty(String name, String facultyID)
    {
        this.name = name;
        this.facultyID = facultyID;
    }

    public void display()
    {
        System.out.println("Faculty name = " + this.name);
        System.out.println("Faculty ID = " + this.facultyID);
    }
}

class Course
{
    String name;
    String courseCode;

    Course(String name, String courseCode)
    {
        this.name = name;
        this.courseCode = courseCode;
    }

    public void display()
    {
        System.out.println("Course name = " + this.name);
        System.out.println("Course code = " + this.courseCode);
    }
}

public class class1 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name : ");
        String studentName = sc.next();
        System.out.println("Enter student registration number : ");
        String studentRegNo = sc.next();

        Student s = new Student(studentName, studentRegNo);
        s.display();

        System.out.println("Enter faculty name : ");
        String facultyName = sc.next();
        System.out.println("Enter faculty employee number : ");
        String facultyRegNo = sc.next();

        Faculty f = new Faculty(facultyName, facultyRegNo);
        f.display();

        System.out.println("Enter course name : ");
        String courseName = sc.next();
        System.out.println("Enter course code : ");
        String couseCode = sc.next();

        Course c = new Course(courseName, couseCode);
        c.display();
    }
}
