import java.util.*;
public class string5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String st = sc.nextLine();
        System.out.println("Enter the substring : ");
        String sub = sc.nextLine();
        
        int count = 0;
        
        for(int i=0;i<st.length() - sub.length() + 1;i++)
        {
            if(st.substring(i,i+sub.length()).equals(sub))
            {
                count++;
            }
        }
        
        if(count >0)
        {
            System.out.println("It occurs " + count + " times.");
        }
        else
        {
            System.out.println("No such substring in given string.");
        }
    }
}	 	  	 	  		     	    			  	 	

