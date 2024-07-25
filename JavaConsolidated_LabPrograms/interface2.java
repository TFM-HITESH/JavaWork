import java.util.*;

interface customlist
{
    void add(int index);
    void remove(int index);
    void delete();
    void size();
    void get(int index);
}

class customarray implements customlist
{
    int arr[];
    int count = 0;
    
    customarray()
    {
        arr = new int[10];
    }
    
    public void add(int index)
    {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        
        this.arr[index] = val;
        System.out.println("Added successfully");
        this.count++;
    }
    
    public void remove(int index)
    {
        this.arr[index] = 0;
        System.out.println("Removed successfully");
        this.count--;
    }	 	  	 	  		     	    			  	 	
    
    public void delete()
    {
        for(int i=0;i< this.arr.length;i++)
        {
            this.arr[i] = 0;
        }
        this.count = 0;
    }
    
    public void size()
    {
        System.out.println(this.count);
    }
    
    public void get(int index)
    {
        System.out.print(this.arr[index] + " ");
    }
    
    public void display()
    {
        for(int i=0;i< this.arr.length;i++)
        {
            this.get(i);
        }
    }
}

public class interface2
{
    public static void main(String args[])
    {
        customarray a = new customarray();
        
        System.out.println("Enter the elements : ");
        for(int i=0;i<10;i++)
        {	 	  	 	  		     	    			  	 	
            a.add(i);
        }
        
        System.out.println("Removing indexes 3, 5");
        a.remove(3);
        a.remove(5);
        
        a.display();
        
        System.out.println();
        System.out.println("Showing the size");
        a.size();
        
        System.out.println("Getting elements 1, 5");
        a.get(1);
        a.get(5);
        
        a.display();
        
        System.out.println();
        System.out.println("Delete method");
        a.delete();
        
        a.display();
    }
}	 	  	 	  		     	    			  	 	

