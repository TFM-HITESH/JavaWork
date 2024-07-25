import java.util.*;
public class string7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String country[] = new String[10];
        System.out.println("Enter the countries : ");
        
        //input
        for(int i=0;i<10;i++)
        {
            country[i] = sc.nextLine();
        }
        
        //sorting
        Arrays.sort(country);
        
        //output
        System.out.println("Sorted country list : ");
        for(int i=0;i<10;i++)
        {
            System.out.println(country[i]);
        }
        
    }
}	 	  	 	  		     	    			  	 	

