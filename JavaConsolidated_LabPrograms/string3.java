
import java.util.*;
public class string3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence :");
        String str = sc.nextLine();
        
        String words[] = str.split(" ");
        
        String wordArr[] = new String[100];
        int wordCount[] = new int[100];
        
        int count=0;
        
        for(int i=0;i<words.length;i++)
        {
            if(inCheck(wordArr,count,words[i]) > -1)
            {
                wordCount[inCheck(wordArr,count,words[i])]++;
            }
            else
            {
                wordArr[count] = words[i];
                wordCount[count] = 1;
                count++;
            }
        }
        
        for(int i=0;i<count;i++)
        {
            System.out.println(wordArr[i] + " : " + wordCount[i]);
        }
    }	 	  	 	  		     	    			  	 	
    
    public static int inCheck(String w[], int n, String s)
    {
        int flag = -1;
        
        if(n == 0)
        {
            return flag;
        }
        
        for(int i=0;i<n;i++)
        {
            
            if(w[i].equals(s))
            {
                flag = i;
                break;
            }
        }
        return flag;
    }
}