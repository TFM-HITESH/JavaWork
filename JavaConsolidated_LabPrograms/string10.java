import java.util.*;

public class string10
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input = sc.nextLine();
        
        char inputArr[] = input.toCharArray();
        
        int flag = 0;
        
        for(int i=0;i<inputArr.length;i++)
        {
            if(flag==0 && inputArr[i] == ' ')
            {
                continue;
            }
            else if(flag==0 && inputArr[i] != ' ')
            {
                flag = 1;
                System.out.print(inputArr[i]);
                continue;
            }
            else
            {
                System.out.print(inputArr[i]);
            }
        }

        if(flag == 0)
        {
            System.out.println("Enter a valid string. Only spaces entered");
        }
    }
}	 	  	 	  		     	    			  	 	
