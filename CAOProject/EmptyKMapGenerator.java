import javax.swing.plaf.synth.SynthStyle;

public class EmptyKMapGenerator 
{
    int NCount;
    int maxDigits;
    int NCountCeiling;

    int kMap[][][];

    public EmptyKMapGenerator(int NCount)
    {
        this.NCount = NCount;
        this.maxDigits = findLowest2Power(NCount);
        this.NCountCeiling = (int) Math.pow(2.0 , (double) maxDigits);

        int dimensions[] = new int[2];
        dimensions = findDimensions();

        this.kMap = new int[dimensions[0]][dimensions[1]][2];

        for(int i=0;i<kMap.length;i++)
        {
            for(int j=0;j<kMap[i].length;j++)
            {
                for(int k=0;k<kMap[i][j].length;k++)
                {
                    kMap[i][j][k] = 0;
                }
            }
        }

        for(int i=0;i<kMap.length;i++)
        {
            for(int j=0;j<kMap[i].length;j++)
            {
                System.out.print('0');
            }
            System.out.println();
        }

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

    public int[] findDimensions()
    {
        int dimensions[] =  new int[2]; // [#rows , #cols] cols >= rows always in KMAP 

        if(maxDigits % 2 == 0)
        {
            dimensions[0] = maxDigits/2;
            dimensions[1] = maxDigits/2;
        }
        else
        {
            dimensions[0] = maxDigits/2;
            dimensions[1] = maxDigits/2 + 1;
        }

        return dimensions;
    }
}
