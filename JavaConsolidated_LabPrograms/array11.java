import java.util.*;
public class array11
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns :");
        int n = sc.nextInt();
        
        int arr[][] = new int[m][n];
        
        System.out.println("Enter the matrix : ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0;i<arr.length;i++)
        {
            int sumRow = 0;
            for(int j=0;j<arr[i].length;j++)
            {
                sumRow += arr[i][j];
            }
            System.out.println("Sum of row "+(i+1)+" = "+sumRow);
        }

        sc.close();
    }
}
	 	  	 	  		     	    			  	 	
