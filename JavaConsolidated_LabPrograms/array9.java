import java.util.*;
public class array9
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of square matrix :");
        int count = sc.nextInt();
        
        int arr[][] = new int[count][count];
        
        System.out.println("Enter the elements : ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        
        boolean flag = true;
        for(int x=0;x<arr.length;x++)
        {
            for(int y=0;y<arr.length;y++)
            {
                if(x==y)
                {
                    if(arr[x][y] == 1)
                    {
                        continue;
                    }
                    else
                    {
                        flag = false;
                        break;
                    }	 	  	 	  		     	    			  	 	
                }
                else
                {
                    if(arr[x][y] == 0)
                    {
                        continue;
                    }
                    else
                    {
                        flag = false;
                        break;
                    }
                }
            }
        }
        
        if(flag)
        {
            System.out.println("Identity Matrix");
        }
        else
        {
            System.out.println("NOT an Identity Matrix");
        }

        sc.close();
    }
}	 	  	 	  		     	    			  	 	

