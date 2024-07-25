class Parent
{
    String parentVar;
    
    Parent()
    {
        System.out.println("This is the Parent Class, first constructor call.");
    }
}

class Child extends Parent
{
    String childVar;
    
    Child()
    {
        System.out.println("This is the Child Class, second constructor call.");
    }
}

public class inherit5
{
    public static void main(String args[])
    {
        Child c = new Child();
    }
}
