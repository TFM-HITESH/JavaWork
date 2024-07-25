import java.util.*;
public class string1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the username :");
        String username = sc.nextLine();
        System.out.println("Enter the password :");
        String password = sc.nextLine();
        System.out.println("Confirm password :");
        String passwordAuth = sc.nextLine();
        
        System.out.println("Starting checks . . . . .");
        //empty check
        if(username.length() == 0)
        {
            System.out.println("Username is empty !");
        }
        if(password.length() == 0)
        {
            System.out.println("Password is empty !");
        }
        
        //password length check
        if(password.length() < 8)
        {
            System.out.println("The password is too short ! 8 characters needed");
        }
        
        //password contains username check
        boolean flag = true;
        for(int i=0;i<password.length() - username.length();i++)
        {	 	  	 	  		     	    			  	 	
            if(username.equals(password.substring(i,i+username.length())))
            {
                System.out.println("Password should not contain username !");
                flag = false;
                break;
            }
        }
        
        //pass,confirm check
        if(!(password.equals(passwordAuth)))
        {
            System.out.println("Passwords dont match !");
        }
        
    }
}