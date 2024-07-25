import java.util.*;
public class array7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int count = sc.nextInt();
        
        int arr[] = new int[count];
        
        System.out.println("Enter the elements :");
        for(int i=0;i<count;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        //bubble sort
        
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.println("Sorted : ");
        for(int j=0;j<count;j++)
        {
            System.out.print(arr[j] + " ");
        }
        
        sc.close();
    }
}