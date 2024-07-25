import java.util.*;

public class string9
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string.");
        String inputStr = sc.nextLine().toLowerCase();
        
        String inputArr[] = inputStr.split(" ");
        
        System.out.println("Enter keyword to be found : ");
        String searchKey = sc.nextLine().toLowerCase();
        
        System.out.println("Enter word to be replace it with : ");
        String replaceKey = sc.nextLine().toLowerCase();
        
        int count = 0;
        for(int i=0;i<inputArr.length;i++)
        {
            if(searchKey.equals(inputArr[i]))
            {
                inputArr[i] = replaceKey;
                count++;
            }
        }
        if(count != 0)
        {
            System.out.println("The word occurs "+count+" times.");
        }
        else
        {
            System.out.println("The word does not occur in string");
        }
        
        System.out.println("The final string is :");
        
        for(String k:inputArr)
        {	 	  	 	  		     	    			  	 	
            System.out.print(k + " ");
        }
    }
}