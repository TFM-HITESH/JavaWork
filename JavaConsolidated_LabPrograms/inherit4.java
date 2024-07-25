class Parent
{
    String parentVar;
    
    Parent()
    {
        System.out.println("This is the Parent Class");
    }
}

class Child extends Parent
{
    String childVar;
    
    Child()
    {
        System.out.println("This is the Child Class");
    }
}

public class inherit4
{
    public static void main(String args[])
    {
        Child c = new Child();
    }
}
