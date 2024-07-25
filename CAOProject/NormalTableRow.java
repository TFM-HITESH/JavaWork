public class NormalTableRow 
{
    int NCount;
    int maxDigits;

     public NormalTableRow(int NCount)
     {
        this.NCount = NCount;
        this.maxDigits = findLowest2Power(this.NCount);
     }

     public int findLowest2Power(int inputValue)
     {
        int lowestPower = 0;

        while(Math.pow(2.0, (double)lowestPower) < inputValue )
        {
            lowestPower++;
        }
        return lowestPower;
     }
}
