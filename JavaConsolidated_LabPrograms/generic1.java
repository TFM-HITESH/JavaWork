public class generic1
{
    public static void main(String args[])
    {
        add(1,2);
        add(3.5f,10.5f);
        add(3.14, 3.14);
    }
    
    public static <T extends Number, U extends Number> void add(T num1, U num2)
    {
        if(num1 instanceof Integer && num2 instanceof Integer)
        {
            System.out.println((int)num1 + (int)num2);
        }
        if(num1 instanceof Float && num2 instanceof Float)
        {
            System.out.println((float)num1 + (float)num2);
        }
        if(num1 instanceof Double && num2 instanceof Double)
        {
            System.out.println((double)num1 + (double)num2);
        }
    }
}