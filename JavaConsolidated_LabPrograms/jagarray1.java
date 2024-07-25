public class jagarray1
{
    public static void main(String args[])
    {
        int jaggedArr[][] = new int[4][];
        
        jaggedArr[0] = new int[5];
        jaggedArr[1] = new int[2];
        jaggedArr[2] = new int[4];
        jaggedArr[3] = new int[2];
        
        //filling values
        for(int i=0;i<jaggedArr.length;i++)
        {
            for(int j=0;j<jaggedArr[i].length;j++)
            {
                jaggedArr[i][j] = i+1;
            }
        }
        
        //printing
        for(int m[]:jaggedArr)
        {
            for(int k:m)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}	 	  	 	  		     	    			  	 	

