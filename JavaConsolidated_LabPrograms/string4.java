import java.util.*;
public class string4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the reg. no :");
        String regNo = sc.nextLine();
        
        String school = regNo.substring(2,5);
        
        if(school.equalsIgnoreCase("BCE"))
        {
            System.out.println("SCOPE School");
        }
        else if(school.equalsIgnoreCase("BIT"))
        {
            System.out.println("SITE School");
        }
        else
        {
            System.out.println("Neither school");
        }
    }
}	 	  	 	  		     	    			  	 	
