
public class t4
{
    public static void main(String args[]) {
    	employee e[] = new employee[2];
    	e[0] = new employee("124","Satish","Vellore");
    	e[1] = new employee("123","Ram","Chennai");
    	test<String,employee> t = new test<String,employee>("Satish",e);
    	t.display();
    	test.sort(e);
        t.display();
    }
} 

class test<T,U>
{
	T element1;
	U[] obj;
	
	public test(T element1, U obj[]) 
	{
        this.element1=element1;
        if(obj[0] instanceof employee)
        {
        	this.obj = obj.clone();
        }
        if(obj[0] instanceof course)
        {
        	this.obj = obj.clone();
        }
     }
	
	public void display()
	{
		for(U ele : this.obj)
		{
			if(ele instanceof employee)
			{
				System.out.println(((employee) ele).empid + ((employee) ele).name + ((employee) ele).address);
			}
			if(ele instanceof course)
			{
				System.out.println(((course) ele).courseid);
				System.out.println(((course) ele).coursename);
			}
		}
	}
	
	public static <U> void sort(U obj[]){
        if(obj[0] instanceof employee)
        {
            for(int i=0;i<obj.length-1;i++)
            {
                for(int j=0;j<obj.length-1-i;j++)
               {
                    if(((employee)obj[j]).empid.compareTo(((employee)obj[j+1]).empid)>0)
                    {
                        U temp=obj[j];
                        obj[j]=obj[j+1];
                        obj[j+1]=temp;
                    }
                }
            }
            for(U ele : obj)
    		{
    				System.out.println(((employee) ele).empid + ((employee) ele).name + ((employee) ele).address);
    		}
        }
        else if(obj[0] instanceof course)
       {
            for(int i=0;i<obj.length-1;i++)
           {
                for(int j=0;j<obj.length-1-i;j++)
                {
                    if(((course)obj[j]).courseid.compareTo(((course)obj[j+1]).courseid)>0)
                    {
                        U temp=obj[j];
                        obj[j]=obj[j+1];
                        obj[j+1]=temp;
                    }
                }
            }
            for(U ele : obj)
			{
				System.out.println(((course) ele).courseid);
				System.out.println(((course) ele).coursename);
			}
        }
        
    }
}

class employee
{
	String empid;
	String name;
	String address;
	public employee(String empid, String name, String address) {
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
	
	public course(String courseid, String coursename) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
	}
}


