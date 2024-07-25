import java.util.*;

abstract class Animal
{
    abstract public void eat();
    abstract public void sleep();
}

class Lion extends Animal
{
    public void eat()
    {
        System.out.println("Lion is eating");
    }
    
    public void sleep()
    {
        System.out.println("Lion is sleeping");
    }
}

class Tiger extends Animal
{
    public void eat()
    {
        System.out.println("Tiger is eating");
    }
    
    public void sleep()
    {
        System.out.println("Tiger is sleeping");
    }
}

class Deer extends Animal
{	 	  	 	  		     	    			  	 	
    public void eat()
    {
        System.out.println("Deer is eating");
    }
    
    public void sleep()
    {
        System.out.println("Deer is sleeping");
    }
}


public class abstract4
{
    public static void main(String args[])
    {
        Lion l = new Lion();
        l.eat();
        l.sleep();
        
        Tiger t = new Tiger();
        t.eat();
        t.sleep();
        
        Deer d = new Deer();
        d.eat();
        d.sleep();
    }
}	 	  	 	  		     	    			  	 	

