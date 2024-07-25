import java.util.*;
class Project
{
    String projectID;
    String projectName;
    String projectDomain;
    static int projectCount = 0;
    
    Project(String projectID, String projectName, String projectDomain)
    {
        this.projectID = projectID;
        this.projectName = projectName;
        this.projectDomain = projectDomain;
        projectCount++;
    }
    
    public void displayProject()
    {
        System.out.println("Project ID = "+this.projectID);
        System.out.println("Project Name = "+this.projectName);
        System.out.println("Project Domain = "+this.projectDomain);
    }
    
    public static void displayProjectCount()
    {
        System.out.println("Total running projects are = "+projectCount);
    }
}

public class static1
{
    public static void main(String args[])
    {
       System.out.println("Creating the projects : "); 
        Project p1 = new Project("ID1","Name1","Domain1");
        p1.displayProject();
        Project p2 = new Project("ID2","Name2","Domain2");
        p2.displayProject();
        Project p3 = new Project("ID3","Name3","Domain3");
        p3.displayProject();
        Project p4 = new Project("ID4","Name4","Domain4");
        p4.displayProject();
        
        Project.displayProjectCount();
    }	 	  	 	  		     	    			  	 	
}
