import java.util.*;
public class array8
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int count = sc.nextInt();
        
        int arr[] = new int[count];
        int newArr[] = new int[count];
        
        int newIndex = 0; //keep track of number of unique elements
        
        System.out.println("Enter the elements :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        //only uniques builder
        for(int i=0;i<arr.length;i++)
        {
            boolean flag = true;
            for(int j=0;j<newIndex;j++)
            {
                if(arr[i] == newArr[j])
                {
                    flag = false;
                    break;
                }
            }
            
            if(flag)
            {
                newArr[newIndex] = arr[i];
                newIndex++;
            }	 	  	 	  		     	    			  	 	
        }
        
        System.out.println("Final array : ");
        for(int j=0;j<newIndex;j++)
        {
            System.out.print(newArr[j]+" ");
        }
        sc.close();       
    }
    
}