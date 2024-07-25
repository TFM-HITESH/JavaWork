import java.util.*;
class Car
{
    public String brandName;
    
    Car(String brandName)
    {
        this.brandName = brandName;
    }
    
    public static void brandSort(Car c[])
    {
        for(int i=0;i<c.length;i++)
        {
            for(int j=i;j<c.length;j++)
            {
                if(c[i].brandName.compareTo(c[j].brandName) < 0)
                {
                    String temp = c[i].brandName;
                    c[i].brandName = c[j].brandName;
                    c[j].brandName = temp;
                }
            }
        }
    }
    
    public static void displayBrands(Car c[])
    {
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i].brandName);
        }
    }
}	 	  	 	  		     	    			  	 	


public class static2
{
    public static void main(String args[])
    {
        System.out.println("Enter 5 car brands : ");
        
        Car c[] = new Car[5];
        
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<c.length;i++)
        {
            System.out.println("Enter car brand : ");
            String brandName = sc.next();
            
            c[i] = new Car(brandName);
        }
        
        
        Car.brandSort(c);
        System.out.println("Displaying car brands :");
        Car.displayBrands(c);
    }
}	 	  	 	  		     	    			  	 	

