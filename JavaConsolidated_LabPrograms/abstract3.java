import java.util.*;

abstract class Vehicle
{
    protected String make;
    protected String model;
    protected String year;
    protected String fuelType;
    protected float fuelEfficiency;
    
    Vehicle()
    {
        this.make = getMake();
        this.model = getModel();
        this.year = getYear();
        this.fuelType = getFuelType();
        this.fuelEfficiency = getFuelEfficiency();
    }
    
    public String getMake()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the make of the vehicle :");
        String make = sc.next();
        return make;
    }
    
    public String getModel()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the model of the vehicle :");
        String model = sc.next();
        return model;
    }
    
    public String getYear()
    {	 	  	 	  		     	    			  	 	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year of the vehicle :");
        String year = sc.next();
        return year;
    }
    
    public String getFuelType()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fuel type of the vehicle :");
        String fuelType = sc.next();
        return fuelType;
    }
    
    public float getFuelEfficiency()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fuel efficiency of the vehicle :");
        float fuelEfficiency = sc.nextFloat();
        return fuelEfficiency;
    }
    
    abstract public void distanceTravelled();
    abstract public void maxSpeed();
    abstract public void display();
}

class Truck extends Vehicle
{
    float fuel = 0;
    float distanceTravelledVar = 0;
    float maxSpeedVar = 0;
    float engineDisplacement = 0.8f;
    
    public void distanceTravelled()
    {	 	  	 	  		     	    			  	 	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fuel given in litres :");
        fuel = sc.nextFloat();
        this.distanceTravelledVar = fuel * super.fuelEfficiency * 0.9f; //truck multiplier
    }
    
    public void maxSpeed()
    {
        this.maxSpeedVar = 100 * engineDisplacement;
    }
    
    public void display()
    {
        System.out.println("The make of the Truck is : " + super.make);
        System.out.println("The model of the Truck is : "+super.model);
        System.out.println("The year of the Truck is : "+super.year);
        System.out.println("The fuel type of the Truck is :"+super.fuelType);
        System.out.println("The fuel efficiency of the Truck is :"+super.fuelEfficiency);
        System.out.println("The distance travelled by the Truck is :"+this.distanceTravelledVar);
        System.out.println("The max speed of the Truck is :"+this.maxSpeedVar);
    }
}

class Car extends Vehicle
{
    float fuel = 0;
    float distanceTravelledVar = 0;
    float maxSpeedVar = 0;
    float engineDisplacement = 0.9f;
    
    public void distanceTravelled()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fuel given in litres :");
        fuel = sc.nextFloat();
        this.distanceTravelledVar = fuel * super.fuelEfficiency * 0.9f; //truck multiplier
    }	 	  	 	  		     	    			  	 	
    
    public void maxSpeed()
    {
        this.maxSpeedVar = 100 * engineDisplacement;
    }
    
    public void display()
    {
        System.out.println("The make of the Car is : " + super.make);
        System.out.println("The model of the Car is : "+super.model);
        System.out.println("The year of the Car is : "+super.year);
        System.out.println("The fuel type of the Car is :"+super.fuelType);
        System.out.println("The fuel efficiency of the Car is :"+super.fuelEfficiency);
        System.out.println("The distance travelled by the Car is :"+this.distanceTravelledVar);
        System.out.println("The max speed of the Car is :"+this.maxSpeedVar);
    }
}

class Motorcycle extends Vehicle
{
    float fuel = 0;
    float distanceTravelledVar = 0;
    float maxSpeedVar = 0;
    float engineDisplacement = 0.9f;
    
    public void distanceTravelled()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fuel given in litres :");
        fuel = sc.nextFloat();
        this.distanceTravelledVar = fuel * super.fuelEfficiency * 0.9f; //truck multiplier
    }
    
    public void maxSpeed()
    {
        this.maxSpeedVar = 100 * engineDisplacement;
    }	 	  	 	  		     	    			  	 	
    
    public void display()
    {
        System.out.println("The make of the Motorcycle is : " + super.make);
        System.out.println("The model of the Motorcycle is : "+super.model);
        System.out.println("The year of the Motorcycle is : "+super.year);
        System.out.println("The fuel type of the Motorcycle is :"+super.fuelType);
        System.out.println("The fuel efficiency of the Motorcycle is :"+super.fuelEfficiency);
        System.out.println("The distance travelled by the Motorcycle is :"+this.distanceTravelledVar);
        System.out.println("The max speed of the Motorcycle is :"+this.maxSpeedVar);
    }
}

public class abstract3
{
    public static void main(String args[])
    {
        Truck t = new Truck();
        t.distanceTravelled();
        t.maxSpeed();
        t.display();
        
        Car c = new Car();
        c.distanceTravelled();
        c.maxSpeed();
        c.display();
        
        Motorcycle m = new Motorcycle();
        m.distanceTravelled();
        m.maxSpeed();
        m.display();
        
    }	 	  	 	  		     	    			  	 	
}
