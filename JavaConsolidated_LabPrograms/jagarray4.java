import java.util.*;
public class jagarray4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        
        int jaggedArr[][] = new int[rows][];
        
        for(int i=0;i<rows;i++)
        {
            System.out.println("Enter the number of elements in row "+i+" : ");
            int cols = sc.nextInt();
            
            jaggedArr[i] = new int[cols];
            
            System.out.println("Enter the elements : ");
            for(int j=0;j<cols;j++)
            {
                jaggedArr[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0;i<rows;i++)
        {
            int maxRow = jaggedArr[i][0];
            int minRow = jaggedArr[i][0];
            
            for(int j=0;j<jaggedArr[i].length;j++)
            {
                if(jaggedArr[i][j] > maxRow)
                {
                    maxRow = jaggedArr[i][j];
                }	 	  	 	  		     	    			  	 	
                if(jaggedArr[i][j] < minRow)
                {
                    minRow = jaggedArr[i][j];
                }
            }
            
            System.out.println("In row "+i+" : ");
            System.out.println("Max = "+maxRow + " Min = "+minRow);
        }
        sc.close();
    }
}