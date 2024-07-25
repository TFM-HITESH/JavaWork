import java.util.*;
public class string2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String str = sc.nextLine().trim();
        
        String s[] = str.split(" ");
        
        String rev[] = new String[s.length];
        
        for(int i=0;i<s.length;i++)
        {
            String ele = s[i];
            String revele = "";
            
            for(int j=ele.length()-1;j>=0;j--)
            {
                revele = revele + ele.charAt(j);
            }
            
            rev[i] = revele;
        } 
        
        System.out.println("Manipulated :");
        for(int i=rev.length-1;i>=0;i--)
        {
            System.out.print(rev[i] + " ");
        }
    }
}	 	  	 	  		     	    			  	 	

