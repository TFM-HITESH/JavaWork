import java.util.*;

public class string8
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String cityInfo[][] = new String[10][2];
        
        //taking input
        System.out.println("Enter info for the 10 district in the format District Name and then Zipcode");
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter district "+(i+1));
            cityInfo[i][0] = sc.nextLine();
            System.out.println("Enter zipcode "+(i+1));
            cityInfo[i][1] = sc.nextLine();
        }
        
        System.out.println("Enter 1 to display zipcode by search : ");
        System.out.println("Enter 2 to update zipcode by search : ");
        System.out.println("Enter 3 to display zipcode by partial search : ");
        System.out.println("Enter 4 to exit.");
        int choice = 0;
        
        while(choice != 4)
        {
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            String dummy = sc.nextLine();
            
            switch(choice)
            {
                case 1:
                    {
                        //display zipcode by linear search
                        System.out.println("Enter the district to be searched : ");
                        String searchKey = sc.nextLine();
        
                        int flag1 = 0;
                        for(int i=0;i<10;i++)
                        {	 	  	 	  		     	    			  	 	
                            if(searchKey.equals(cityInfo[i][0]))
                            {
                                System.out.println("Zipcode = " + cityInfo[i][1]);
                                flag1 = 1;
                                break;
                            }
                        }
                        if(flag1==0)
                        {
                            System.out.println("District not in Data");
                        }
                        break;
                    }
                case 2:
                    {
                        //update zipcode
                        System.out.println("Enter the district to be updated : ");
                        String searchDistrict = sc.nextLine();
                        System.out.println("Enter the new Zipcode : ");
                        String newZip = sc.nextLine();
                        
                        int flag2 = 0;
                        for(int i=0;i<10;i++)
                        {
                            if(searchDistrict.equals(cityInfo[i][0]))
                            {
                                cityInfo[i][1] = newZip;
                                flag2 = 1;
                                break;
                            }
                        }
                        if(flag2==0)
                        {
                            System.out.println("District not in Data");
                        }
                        break;
                    }	 	  	 	  		     	    			  	 	
                case 3:
                    {
                        //matching districts
                        System.out.println("Enter the partial district name : ");
                        String searchPart = sc.nextLine();
                        
                        int flag3 = 0;
                        for(int i=0;i<10;i++)
                        {
                            if(cityInfo[i][0].contains(searchPart))
                            {
                                System.out.println(cityInfo[i][0] + " : " + cityInfo[i][1]);
                                flag3 = 1;
                                break;
                            }
                        }
                        if(flag3==0)
                        {
                            System.out.println("District not in Data");
                        }
                        break;
                    }
                case 4:
                    {
                        System.out.println("Terminating sequence");
                        break;
                    }
                default:
                    {
                        System.out.println("Invalid choice");
                        break;
                    }
            }
        }
        
    }	 	  	 	  		     	    			  	 	
}