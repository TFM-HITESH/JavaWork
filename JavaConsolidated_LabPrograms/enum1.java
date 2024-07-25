enum schools {SCOPE, SENSE, SELECT, SCORE};

public class enum1
{
    public static void main(String args[])
    {
        for(schools s : schools.values())
        {
            System.out.println(s);
        }
    }
}