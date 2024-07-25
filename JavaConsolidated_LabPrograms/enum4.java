enum schools
{
    SCOPE("Scope School"), 
    SENSE("Sense School"),
    SELECT("Select School"),
    SMEC("Smec School");
    
    private String s;
    private schools(String s)
    {
        this.s = s;
    }
    
    public void display()
    {
        System.out.println(this.s);
    }
}

public class enum4
{
    public static void main(String args[])
    {
        for(schools s : schools.values())
        {
            s.display();
        }
    }
}