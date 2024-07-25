import java.util.*;
public class array13
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //encrypt
        System.out.println("Enter the string :");
        String inputStr = sc.nextLine().toLowerCase();
        System.out.println("Enter the shift : ");
        int shift = sc.nextInt();
        
        int strlen = inputStr.length();
        int inputArr[] = new int[strlen];
        
        for(int i=0;i<inputStr.length();i++)
        {
            inputArr[i] = (int)inputStr.charAt(i) - 97;
        }
        
        //shift
        for(int j=0;j<inputArr.length;j++)
        {
            if(inputArr[j]+shift >25)
            {
                inputArr[j] += shift -25;
            }
            else
            {
                inputArr[j] += shift;
            }
        }
        
        System.out.println("Encrytped :");
        for(int i=0;i<inputArr.length;i++)
        {	 	  	 	  		     	    			  	 	
            System.out.print(inputArr[i]);
        }
        System.out.println();
        String dump = sc.nextLine();
        
        //decryption
        System.out.println("Enter the encrypted text :");
        String encryptText = sc.nextLine();
        System.out.println("Enter the shift : ");
        int deshift = sc.nextInt();
        
        System.out.println("Decrytped :");
        for(int i=0;i<encryptText.length();i++)
        {
            int digit = (int)encryptText.charAt(i);
            digit += shift;
            digit %=49;
            System.out.print((char)(digit + 96));
        }

        sc.close();
    }
}
