import java.util.*;
public class string11
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password : ");
        String pass = sc.nextLine();
        
        char passArr[] = pass.toCharArray();
        
        int upperCase = 0;
        int lowerCase = 0;
        int whiteSpace = 0;
        int digit = 0;
        
        String small = "abcdefghijklmnopqrstuvwxyz";
        String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        for(int i=0;i<passArr.length;i++)
        {
            if(Character.isDigit(passArr[i]))
            {
                digit++;
            }
            if(Character.isUpperCase(passArr[i]))
            {
                upperCase++;
            }
            if(Character.isLowerCase(passArr[i]))
            {
                lowerCase++;
            }
            if(Character.isWhitespace(passArr[i]))
            {
                whiteSpace++;
            }	 	  	 	  		     	    			  	 	
        }
        
        boolean whiteFlag=true, upperFlag=true, lowerFlag=true, digitFlag=true;
        
        if(whiteSpace > 0)
        {
            System.out.println("Password cannot contain whitespaces !");
            whiteFlag = false;
        }
        if(upperCase < 1)
        {
            System.out.println("Password must contain at least 1 uppercase letter !");
            upperFlag = false;
        }
        if(lowerCase < 1)
        {
            System.out.println("Password must contain at least 1 lowercase letter !");
            lowerFlag = false;
        }
        if(digit < 1)
        {
            System.out.println("Password must contain at least 1 digit !");
            digitFlag = false;
        }
        
        if(whiteFlag && upperFlag && lowerFlag && digitFlag)
        {
            System.out.println("THe password is valid !");
        }
    }
}	 	  	 	  		     	    			  	 	
