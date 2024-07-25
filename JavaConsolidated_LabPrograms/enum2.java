enum schools {SCOPE, SELECT, SENSE, SMEC}

public class enum2
{
    public static void main(String args[])
    {
        for(schools s : schools.values())
        {
            switch(s)
            {
                case SCOPE:
                    System.out.println("SJT");
                    break;
                case SELECT:
                    System.out.println("TT");
                    break;
                case SENSE:
                    System.out.println("TT");
                    break;
                case SMEC:
                    System.out.println("SMV");
                    break;
            }
        }
    }
}	 	  	 	  		     	    			  	 	
