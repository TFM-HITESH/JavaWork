import java.util.*;

public class array5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int count = sc.nextInt();
        
        char arr[] = new char[count];
        
        System.out.println("Enter the elements : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.next().charAt(0);
        }
        
        int vowelCount = 0;
        
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]=='A' || arr[j]=='E' || arr[j]=='I' || arr[j]=='O' || arr[j]=='U' || arr[j]=='a' || arr[j]=='e' || arr[j]=='i' || arr[j]=='o' || arr[j]=='u')
            {
                vowelCount++;
            }
        }
        
        System.out.println("The final vowel count is : "+vowelCount);
        sc.close();
    }
}	 	  	 	  		     	    			  	 	
