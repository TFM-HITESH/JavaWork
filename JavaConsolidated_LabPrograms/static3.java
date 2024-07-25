import java.util.*;
class Product
{
    String productID;
    String productName;
    int productSerialNumber;
    String productCompany;
    String productMFD;
    int productPrice;
    
    Product()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product ID :");
        this.productID = sc.next();
        System.out.println("Enter the product Name :");
        this.productName = sc.next();
        System.out.println("Enter the product Serial Number :");
        this.productSerialNumber = sc.nextInt();
        System.out.println("Enter the product company :");
        this.productCompany = sc.next();
        System.out.println("Enter the product Manufacture Date :");
        this.productMFD = sc.next();
        System.out.println("Enter the product price :");
        this.productPrice = sc.nextInt();
    }
    
    public void displayProduct()
    {
        System.out.println("Project ID = "+this.productID);
        System.out.println("Project Name = "+this.productName);
        System.out.println("Project Serial Number = "+this.productSerialNumber);
        System.out.println("Project Company = "+this.productCompany);
        System.out.println("Project Manufactured Date = "+this.productMFD);
        System.out.println("Project Price = "+this.productPrice);
    }	 	  	 	  		     	    			  	 	
    
    public static void displayCompany(String company, Product p[])
    {
        for(int i=0;i<p.length;i++)
        {
            if(p[i].productCompany.equals(company))
            {
                p[i].displayProduct();
            }
        }
    }
    
    public static void displayDate(Product p[])
    {
        for(int i=0;i<p.length;i++)
        {
            String MFD = p[i].productMFD;
            String yearStr = MFD.substring(MFD.length()-4,MFD.length());
            int year = Integer.parseInt(yearStr);
            
            if(year >= 2012 && year <= 2019)
            {
                p[i].displayProduct();
            }
            
        }
    }
    
    public static void displayPrice(Product p[])
    {
        for(int i=0;i<p.length;i++)
        {
            if(p[i].productPrice > 10000)
            {
                p[i].displayProduct();
            }	 	  	 	  		     	    			  	 	
        }
    }
    
    public static void displayName(Product p[])
    {
        for(int i=0;i<p.length;i++)
        {
            if(p[i].productName.contains("laptop"))
            {
                p[i].displayProduct();
            }
        }
    }
}

public class static3
{
    public static void main(String args[])
    {
        Product p[] = new Product[5];
        
        System.out.println("Enter product details :");
        for(int i=0;i<p.length;i++)
        {
            p[i] = new Product();
        }
        
        System.out.println("Products that are manufactured by Samsung");
        Product.displayCompany("Samsung",p);
        System.out.println();
        
        System.out.println("Products between 2012 , 2019");
        Product.displayDate(p);
        System.out.println();
        
        System.out.println("Products where price > 10000");
        Product.displayPrice(p);
        System.out.println();
        
        System.out.println("Products with laptop in name");
        Product.displayName(p);
        System.out.println();
    }	 	  	 	  		     	    			  	 	
}