class genericTest <T,U>
{
    T ele1;
    U ele2;
    
    public genericTest(T ele1, U ele2)
    {
        this.ele1 = ele1;
        this.ele2 = ele2;
    }
    
    public void display()
    {
        System.out.println(ele1);
        System.out.println(ele2);
    }
}

public class generic3
{
    public static void main(String args[])
    {
        genericTest<Integer, String> obj1 = new genericTest<Integer, String> (123,"abc");
        
        obj1.display();
    }
}