import java.util.*;
public class array10
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of matrix :");
        int count = sc.nextInt();
        
        int arr[][] = new int[count][count];
        int transArr[][] = new int[count][count];
        
        //input
        System.out.println("Enter the matrix :");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int x=0;x<arr.length;x++)
        {
            for(int y=0;y<arr[x].length;y++)
            {
                transArr[x][y] = arr[y][x];
            }
        }
        
        System.out.println("Tranposed : ");
        for(int x=0;x<arr.length;x++)
        {
            for(int y=0;y<arr[x].length;y++)
            {
                System.out.print(transArr[x][y]+" ");
            }	 	  	 	  		     	    			  	 	
            System.out.println();
        }
        
        sc.close();
    }
}