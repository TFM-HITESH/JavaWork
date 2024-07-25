import java.util.*;
public class array3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int count = sc.nextInt();
        
        int Loan_Amount[] = new int[count];
        
        System.out.println("Enter the numbers :");
        for(int i=0;i<Loan_Amount.length;i++)
        {
            Loan_Amount[i] = sc.nextInt();
        }
        
        int sumArr = 0;
        for(int j=0;j<Loan_Amount.length;j++)
        {
            sumArr += Loan_Amount[j];
        }
        
        System.out.println("Final sum is :"+sumArr);
        sc.close();
    }
}	 	  	 	  		     	    			  	 	
