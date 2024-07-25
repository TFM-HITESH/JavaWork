import java.util.*;

public class array4
{
    public static void main(String args[])
    {
        //input array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int count = sc.nextInt();
        
        int arr[] = new int[count];
        
        System.out.println("Enter elements :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter element to be searched :");
        int searchKey = sc.nextInt();
        
        //search
        int searchIndex = -1;
        
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j] == searchKey)
            {
                searchIndex = j;
                break;
            }
        }
        
        if(searchIndex == -1)
        {
            System.out.println("Element not found");
        }	 	  	 	  		     	    			  	 	
        else
        {
            System.out.println("Element found at position "+(searchIndex+1));
        }

        sc.close();
    }
}