enum schools {
    SCOPE,
    SENSE, 
    SELECT, 
    SMEC
};

public class enum3
{
    public static void main(String args[])
    {
        System.out.println("To show use of values()");
        for(schools s : schools.values())
        {
            System.out.println(s); 
        }
        
        System.out.println("To show use of ordinal()");
        for(schools s : schools.values())
        {
            System.out.println(s.ordinal()); 
        }
        
        System.out.println("To show use of toString()");
        String schoolNames[] = new String[4];
        
        schoolNames[0] = schools.SCOPE.toString();
        schoolNames[1] = schools.SENSE.toString();
        schoolNames[2] = schools.SELECT.toString();
        schoolNames[3] = schools.SMEC.toString();
        
        for(String s : schoolNames)
        {
            System.out.println("String = "+s);
        }	 	  	 	  		     	    			  	 	
        
        System.out.println("To show use of valueOf()");
        for(String s : schoolNames)
        {
            System.out.println("Enum = "+schools.valueOf(s));
        }
        
        System.out.println("To show use of compareTo()");
        for(int i=0;i<4;i++)
        {
            for(int j=i;j<4;j++)
            {
                System.out.println(schoolNames[i].compareTo(schoolNames[j]));
            }
        }
    }
}