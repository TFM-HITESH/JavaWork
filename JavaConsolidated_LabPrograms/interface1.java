interface Flyable
{
    void fly_obj();
}

class Spacecraft implements Flyable
{
    public void fly_obj()
    {
        System.out.println("Spacecraft can fly in space");
    }
}

class Airplane implements Flyable
{
    public void fly_obj()
    {
        System.out.println("Airplane can fly in high altitudes");
    }
}

class Helicopter implements Flyable
{
    public void fly_obj()
    {
        System.out.println("Helicopter can fly in low altitudes");
    }
}


public class interface1
{
    public static void main(String args[])
    {
        Spacecraft s = new Spacecraft();
        s.fly_obj();
    
        Airplane a = new Airplane();
        a.fly_obj();
    
        Helicopter h = new Helicopter();
        h.fly_obj();
    }	 	  	 	  		     	    			  	 	
}