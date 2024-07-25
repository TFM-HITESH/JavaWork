import java.util.*;

public class exceptions1
{
    public static void main(String args[])
    {
        String regNo = null;
        String name;
        int mark;
        
        Scanner sc = new Scanner(System.in);
        
        try
        {
            System.out.println("Enter your Regno :");
            regNo = sc.nextLine();
            
            System.out.println("Enter your Name :");
            name = sc.nextLine();
            
            System.out.println("Length of name = " + name.length());
            
            System.out.println("Enter your Marks :");
            mark = sc.nextInt();
            
            if(mark < 0 || mark > 100)
            {
                throw new MarksException("check mark range");
            }
        }
        
        catch (InputMismatchException e)
        {
            System.out.println("Wrong input data type entered.");
        }
        
        catch (NullPointerException e)
        {	 	  	 	  		     	    			  	 	
            System.out.println("You are referencing nothing :)");
        }
        
        catch (MarksException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

class MarksException extends Exception
{
    public MarksException(String s)
    {
        super(s);
    }
}
