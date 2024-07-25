public class exceptLearn 
{
    public static void main(String args[])
    {
        try
        {
            int n = 2;

            if(n == 1)
            {
                System.out.println(n);
            }
            else
            {
                throw new otherException("hellloooo");
                //throw new myException("this is a problem");
            }
        }
        catch(otherException e)
        {
            System.out.println(e.getMessage());
        }
        catch(myException e)
        {
            System.out.println(e.getMessage());
        }
    }    
}


class myException extends Exception
{
    public myException(String s)
    {
        super(s);
    }
}

class otherException extends myException
{
    public otherException(String s)
    {
        super(s);
    }
}