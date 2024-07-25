enum schools
{
    SCOPE("SJT"), 
    SENSE("TT"),
    SELECT("TT"),
    SMEC("SMV");
    
    private String location;
    
    private schools(String location)
    {
        this.location = location;
    }
    
    public void displayLoc()
    {
        System.out.println(this.location);
    }
}

public class enum5
{
    public static void main(String args[])
    {
        for(schools s : schools.values())
        {
            System.out.println(s);
            s.displayLoc();
        }
    }
}
