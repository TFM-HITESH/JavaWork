import java.util.*;
public class string6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int n = sc.nextInt();
        String dummy = sc.nextLine();
        
        String studentInfo[][] = new String[n][2];
        
        //input infor
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Reg. no. : ");
            studentInfo[i][0] = sc.nextLine();
            System.out.println("Enter the course name : ");
            studentInfo[i][1] = sc.nextLine();
        }
        
        System.out.println("The information is as given below : ");
        //display info
        for(int i=0;i<n;i++)
        {
            System.out.println(studentInfo[i][0]);
            System.out.println(studentInfo[i][1]);
        }
    }
}	 	  	 	  		     	    			  	 	
