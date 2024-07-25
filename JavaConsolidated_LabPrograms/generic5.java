class employee
{
    String empid;
    String name;
    String address;
    
    public employee(String empid, String name, String address)
    {
        super();
        this.empid = empid;
        this.name = name;
        this.address = address;
    }
}

class course
{
    String courseid;
    String coursename;
    
    public course(String courseid, String coursename)
    {
        super();
        this.courseid = courseid;
        this.coursename = coursename;
    }
}

class test<T, U>
{
    T element1;
    U obj[];
    
    public test(T element1, U obj[])
    {
        this.element1 = element1;
        
        if(obj[0] instanceof course)
        {	 	  	 	  		     	    			  	 	
            this.obj = obj.clone();
            for(int i=0;i<obj.length;i++)
            {
                this.obj[i] = obj[i];
            }
        }
    }
    
    public void display()
    {
        System.out.println(element1);
        for(int i=0;i<obj.length;i++)
        {
            System.out.println(((course)obj[i]).courseid);
        }
    }
    
    public static <U> void sort(U obj[])
    {
        if(obj[0] instanceof course)
        {
            for(int i=0;i<obj.length;i++)
            {
                for(int j = i;j<obj.length;j++)
                {
                    if(((course)obj[i]).courseid.compareTo(((course)obj[j]).courseid) < 0)
                    {
                        U temp;
                        temp = obj[i];
                        obj[i] = obj[j];
                        obj[j] = temp;
                    }
                }
            }
        }
        if(obj[0] instanceof employee)
        {	 	  	 	  		     	    			  	 	
            for(int i=0;i<obj.length;i++)
            {
                for(int j = i;j<obj.length;j++)
                {
                    if(((employee)obj[i]).empid.compareTo(((employee)obj[j]).empid) < 0)
                    {
                        U temp;
                        temp = obj[i];
                        obj[i] = obj[j];
                        obj[j] = temp;
                    }
                }
            }
        }
    }
}

public class generic5
{
    public static void main(String args[])
    {
        course c[] = new course[3];
        c[0] = new course("2222","Java");
        c[1] = new course("1111","Python");
        c[2] = new course("3333","C++");
        
        test<String, course> t = new test<String, course>("Test", c);
        
        System.out.println("Before sorting");
        t.display();
        
        test.sort(c);

        test<String, course> tNew = new test<String, course>("TestNew",c);
        
        System.out.println("After sorting");
        tNew.display();
    }	 	  	 	  		     	    			  	 	
}