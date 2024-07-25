public class jagarray2
{
    public static void main(String args[])
    {
        int jaggedArr[][] = {{22,44,12,15,16},{2,25,32,33},{4,4,1,3},{1,3,4}};
        
        for(int i=0;i<jaggedArr.length;i++)
        {
            int sum=0;
            for(int j=0;j<jaggedArr[i].length;j++)
            {
                sum+=jaggedArr[i][j];
            }
            
            System.out.println("The sum of row "+i+" is = "+sum);
        }
    }
}