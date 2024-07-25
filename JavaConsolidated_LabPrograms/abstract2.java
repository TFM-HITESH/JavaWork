import java.util.*;

abstract class Shape
{
    final double pi = 3.1415; 
    public double area = 0.0;
    abstract public void calc_area();
    abstract public void display_area();
}

abstract class TwoDimensionalShape extends Shape
{
    public int x = 0;
    public int y = 0;
    abstract public void position(int x, int y);
}

abstract class ThreeDimensionalShape extends Shape
{
    public int x = 0;
    public int y = 0;
    public int z = 0;
    abstract public void position(int x, int y, int z);
}

class Rectangle extends TwoDimensionalShape
{
    public void position(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void calc_area()
    {	 	  	 	  		     	    			  	 	
        Scanner sc = new Scanner(System.in);
        
        float length, breadth;
        System.out.println("Enter the length :");
        length = sc.nextFloat();
        System.out.println("Enter the breadth :");
        breadth = sc.nextFloat();
        
        this.area = length * breadth;
    }
    
    public void display_area()
    {
        System.out.println("The coordinates of the rectangle is :"+this.x+","+this.y);
        System.out.println("The area = "+this.area);
    }
}

class Sphere extends ThreeDimensionalShape
{
    public void position(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public void calc_area()
    {
        Scanner sc = new Scanner(System.in);
        
        float radius;
        System.out.println("Enter the radius :");
        radius = sc.nextFloat();
        
        this.area = 4 * this.pi * radius * radius;
    }	 	  	 	  		     	    			  	 	
    
    public void display_area()
    {
        System.out.println("The coordinates of the sphere is :"+this.x+","+this.y+","+this.z);
        System.out.println("The area = "+this.area);
    }
}

public class abstract2
{
    public static void main(String args[])
    {
        Rectangle r = new Rectangle();
        Sphere s = new Sphere();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the coordinates for the rectangle :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        r.position(a, b);
        r.calc_area();
        r.display_area();
        
        System.out.println("Enter the coordinates for the sphere :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        s.position(x,y,z);
        s.calc_area();
        s.display_area();
    }
}	 	  	 	  		     	    			  	 	
