public class generic2
{
    public static void main(String args[])
    {
        display("Hitesh",1);
        display(2,"Shreya");
    }
    
    public static <T,U> void display(T ele1, U ele2)
    {
        System.out.println(ele1 + " " + ele2);
    }
}