import java.util.*;
public class array12
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of square matrices : ");
        int size = sc.nextInt();
        
        int matrix1[][] = new int[size][size];
        int matrix2[][] = new int[size][size];
        int addMatrix[][] = new int[size][size];
        
        //input
        System.out.println("Enter matrix 1 :");
        for(int i=0;i<matrix1.length;i++)
        {
            for(int j=0;j<matrix1[i].length;j++)
            {
                matrix1[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter matrix 2 :");
        for(int i=0;i<matrix2.length;i++)
        {
            for(int j=0;j<matrix2[i].length;j++)
            {
                matrix2[i][j] = sc.nextInt();
            }
        }
        
        //sum
        for(int i=0;i<addMatrix.length;i++)
        {
            for(int j=0;j<addMatrix[i].length;j++)
            {	 	  	 	  		     	    			  	 	
                addMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        //print
        System.out.println("Sum matrix :");
        for(int i=0;i<addMatrix.length;i++)
        {
            for(int j=0;j<addMatrix[i].length;j++)
            {
                System.out.print(addMatrix[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
        
    }
}
