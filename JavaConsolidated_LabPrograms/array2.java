
import java.util.*;
public class array2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[10];
        
        System.out.println("Enter the 10 elements :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the index : ");
        int reverseIndex = sc.nextInt();
        
        System.out.println("Reversed : ");
        for(int j=reverseIndex;j>=0;j--)
        {
            System.out.print(arr[j]+" ");
        }

        sc.close();
    }
}	 	  	 	  		     	    			  	 	
