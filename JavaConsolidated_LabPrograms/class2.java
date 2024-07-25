import java.util.*;

class Jcomponent
{
    String projectname;
    int projectid;
    int teamsize;
    
    
    void set()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the project name : ");
        this.projectname = sc.nextLine();
        System.out.println("Enter the project id : ");
        this.projectid = sc.nextInt();
        System.out.println("Enter the team size : ");
        this.teamsize = sc.nextInt();
    }

    void display()
    {
        System.out.println("The project name is : " + this.projectname);
        System.out.println("The project id is : " + this.projectid);
        System.out.println("The team size is : " + this.teamsize);
    }
}


public class class2
{
    public static void main(String args[])
    {
        //creating 5 objects
        Jcomponent objs[] = new Jcomponent[5];
        
        for(int i=0;i<objs.length;i++)
        {	 	  	 	  		     	    			  	 	
            objs[i] = new Jcomponent();
        }

        System.out.println("Setting the values for the objects :");
        for(int i=0;i<objs.length;i++)
        {
            objs[i].set();
        }
        
        System.out.println("Getting the values of the objects :");
        for(int i=0;i<objs.length;i++)
        {
            objs[i].display();
        }
    }
}

