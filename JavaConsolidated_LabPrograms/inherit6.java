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
    
    Child(String childVar)
    {
        this.childVar = childVar;
        System.out.println("This is the Child Class");
        System.out.println("childVar = "+this.childVar);
    }
}

public class inherit6
{
    public static void main(String args[])
    {
        Child c = new Child("Test");
    }
}

