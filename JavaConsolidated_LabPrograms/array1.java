import java.util.*;
public class array1
{
    public static void main(String args[])
    {
        //taking input array 
        int inputArr[] = new int[5];
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the 5 elements into the array :");
        for(int i=0;i<5;i++)
        {
            inputArr[i] = sc.nextInt();
        }
        
        //display array
        System.out.println("Your elements are :");
        for(int j=0;j<5;j++)
        {
            System.out.print(inputArr[j]+" ");
        }

        sc.close();
    }
}