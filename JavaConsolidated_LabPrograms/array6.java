
import java.util.*;
public class array6
{
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int count = sc.nextInt();
        
        int arr[] = new int[count];
        int revArr[] = new int[count];
        
        System.out.println("Enter the elements :");
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        //reversal
        for(int j = arr.length-1;j>=0;j--)
        {
            revArr[j] = arr[arr.length-j-1];
        }
        
        System.out.println("Reversed :");
        for(int k=0;k<revArr.length;k++)
        {
            System.out.print(revArr[k] + " ");
        }

        sc.close();
        
    }
}	 	  	 	  		     	    			  	 	
