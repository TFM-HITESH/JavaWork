import java.util.*;
public class jagarray3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of jagged array :");
        int row = sc.nextInt();
        
        int jaggedArr[][] = new int[row][];
        
        for(int i=0;i<row;i++)
        {
            System.out.println("Enter the number of elements in row "+i+" : ");
            int col = sc.nextInt();
            
            jaggedArr[i] = new int[col];
            
            System.out.println("Enter the elements :");
            for(int j=0;j<col;j++)
            {
                jaggedArr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Displaying the jagged Array :");
        for(int m[]:jaggedArr)
        {
            for(int k:m)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }	 	  	 	  
        
        sc.close();
    }
}
