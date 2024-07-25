
import java.util.*;
public class arrMethods
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of Array 1 : ");
        int a1 = sc.nextInt();
        
        System.out.println("Enter the elements of Array 1");
        Integer firstArray[] = new Integer[a1];
        
        for(int i=0;i<firstArray.length;i++)
        {
            firstArray[i] = sc.nextInt();
        }
        
        
        System.out.println("Enter the size of Array 2 : ");
        int a2 = sc.nextInt();
        
        System.out.println("Enter the elements of Array 2");
        Integer secondArray[] = new Integer[a2];
        
        for(int i=0;i<secondArray.length;i++)
        {
            secondArray[i] = sc.nextInt();
        }
        
        int choice = 0;
        
        while(choice != 6)
        {	 	  	 	  		     	    			  	 	
            System.out.println("Choose a choice : ");
            System.out.println("Enter 1 : Binary Search");
            System.out.println("Enter 2 : Compare arrays");
            System.out.println("Enter 3 : Mismatch Arryas");
            System.out.println("Enter 4 : Ascending Sort");
            System.out.println("Enter 5 : Descending Sort");
            System.out.println("Enter 6 : Terminate Program");
            
            System.out.println("Enter your choice = ");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    {
                        System.out.println("Choose the array you want to binary search (1 or 2):");
                        int arrChoice = sc.nextInt();
                        System.out.println("Choose the element you want to search for :");
                        int key = sc.nextInt();
                        int index = -1;
                        
                        if(arrChoice == 1)
                        {
                            index = Arrays.binarySearch(firstArray,key);
                        }
                        if(arrChoice == 2)
                        {
                            index = Arrays.binarySearch(secondArray,key);
                        }
                        
                        if(index > 0)
                        {
                            System.out.println(key + " was found at index "+index);
                        }
                        else
                        {	 	  	 	  		     	    			  	 	
                            System.out.println("Could not find element in the array");
                        }
                        break;
                    }
                    
                case 2:
                    {
                        int compVal = Arrays.compare(firstArray, secondArray);
                        
                        if(compVal > 0)
                        {
                            System.out.println("firstArray > secondArray");
                        }
                        if(compVal == 0)
                        {
                            System.out.println("firstArray = secondArray");
                        }
                        if(compVal < 0)
                        {
                            System.out.println("firstArray < secondArray");
                        }
                        break;
                    }
                
                case 3:
                    {
                        int miss = Arrays.mismatch(firstArray,secondArray);
                        System.out.println("The first mismatch occurs at index " + miss);
                        break;
                    }
                
                case 4:
                    {
                        System.out.println("Ascending order : ");
                        
                        Arrays.sort(firstArray);
                        Arrays.sort(secondArray);
                        
                        arrDisplay(firstArray);
                        System.out.println();
                        arrDisplay(secondArray);
                        
                        break;
                    }	 	  	 	  		     	    			  	 	
                    
                case 5:
                    {
                        System.out.println("Descending order : ");
                        
                        Arrays.sort(firstArray,Collections.reverseOrder());
                        Arrays.sort(secondArray,Collections.reverseOrder());
                        
                        arrDisplay(firstArray);
                        System.out.println();
                        arrDisplay(secondArray);
                        
                        break;
                    }
                case 6:
                    {
                        System.out.println("Terminating the program . . . ");
                        break;
                    }
                default:
                    {
                       System.out.println("Invalid choice ! Try again."); 
                    }
            }
        }
    }
    
    public static void arrDisplay(Integer a[])
    {
        for(int k : a)
        {
            System.out.print(k + " ");
        }
    }
}	 	  	 	  		     	    			  	 	

