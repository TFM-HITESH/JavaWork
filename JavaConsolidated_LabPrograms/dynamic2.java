import java.util.*;

abstract class Sports
{
    abstract public void play();
}

class Football extends Sports
{
    public void play()
    {
        System.out.println("I am playing Football");
    }
}

class Basketball extends Sports
{
    public void play()
    {
        System.out.println("I am playing Basketball");
    }
}

class Rugby extends Sports
{
    public void play()
    {
        System.out.println("I am playing Rugby");
    }
}

public class dynamic2
{
    public static void main(String args[])
    {	 	  	 	  		     	    			  	 	
        Sports s[] = new Sports[3];
        
        s[0] = new Football();
        s[0].play();
        s[1] = new Basketball();
        s[1].play();
        s[2] = new Rugby();
        s[2].play();
    }
}