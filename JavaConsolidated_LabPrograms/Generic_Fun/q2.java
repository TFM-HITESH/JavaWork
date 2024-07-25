public class q2 
{
    public static void main(String args[])
    {

        Student s[] = new Student[2];
        Course c[] = new Course[2];

        s[0] = new Student("Hitesh", "1234");
        s[1] = new Student("Pavan", "1234");
        
        c[0] = new Course("Java", "1234");
        c[1] = new Course("Python", "1234");

        display(s);
        display(c);
    }

    public static <T> void display(T arr[])
    {
        for(T element : arr)
        {
            if(element instanceof Student)
            {
                System.out.println(((Student)element).name + " " + ((Student)element).regid);
            }
            if(element instanceof Course)
            {
                System.out.println(((Course)element).name + " " + ((Course)element).courseid);
            }
        }
    }
}

class Student
{
    String name;
    String regid;

    public Student(String name, String regid)
    {
        this.name = name;
        this.regid = regid;
    }
}

class Course
{
    String name;
    String courseid;

    public Course(String name, String courseid)
    {
        this.name = name;
        this.courseid = courseid;
    }
}