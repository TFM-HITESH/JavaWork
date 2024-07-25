//import java.io.*;
import java.util.*;
//import java.lang.*;

public class upDownModNCounter_StateTableGenerator
{
    static int NCount = 33;
    static int maxCols = 0;
    static int NCountCeiling = 64;
    public static void main(String[] args) 
    {

        System.out.println(findLowest2Power(33));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the modN for which you want to design the counter : ");
        System.out.println("N = ");
        NCount = sc.nextInt();
        maxCols = findLowest2Power(NCount);
        NCountCeiling = (int)Math.pow(2.0, (double)maxCols);

        System.out.println();
        System.out.println("Enter the formatting style you want the table in : ");
        System.out.println("1 for Pretty Formatting, 2 for Raw Table");
        int tableChoice = sc.nextInt();

        if(tableChoice == 1)
        {
            displayFullTablePretty();
        }
        else
        {
            displayFullTable();
        }



        sc.close();
    }

    public static void displayFullTablePretty()
    {
        boolean controlBit;

        displayHeader();
        displayDummyLine('=');

        for(int i=0;i<2*NCountCeiling;i++)
        {
            if(i>0 && i%16==0)
            {
                displayDummyLine(':');
            }

            if(i>0 && i%16!=0 && i%4==0)
            {
                displayDummyLine('-');
            }

            if(i<NCountCeiling)
            {
                controlBit = false;
            }
            else
            {
                controlBit = true;
            }
            
            if(i < NCount || ((i >= NCountCeiling) && (i < (NCountCeiling + NCount))))
            {   
                MBitRow m = new MBitRow(controlBit, NCount);
                m.displayRow();
                PresentStatesRow present = new PresentStatesRow( i, NCountCeiling);
                present.displayRow();
                NextStatesRow next = new NextStatesRow(i, NCountCeiling, controlBit);
                next.displayRow();

                System.out.print("|-|");
                TImplementation t = new TImplementation(present, next, NCountCeiling);
                t.displayRow();
                DImplementation d = new DImplementation(present, next, NCountCeiling);
                d.displayRow();
                JKImplementation jk = new JKImplementation(present, next, NCountCeiling);
                jk.displayRow();
                SRImplementation sr = new SRImplementation(present, next, NCountCeiling);
                sr.displayRow();

                System.out.println();
            }
            else
            {
                MBitRow m = new MBitRow(controlBit, NCount);
                m.displayRow();
                PresentStatesRow present = new PresentStatesRow(NCount);
                present.displayRow();
                NextStatesRow next = new NextStatesRow(NCount);
                next.displayRow();

                System.out.print("|-|");
                TImplementation t = new TImplementation(present, next, NCount);
                t.displayRow();
                DImplementation d = new DImplementation(present, next, NCount);
                d.displayRow();
                JKImplementation jk = new JKImplementation(present, next, NCount);
                jk.displayRow();
                SRImplementation sr = new SRImplementation(present, next, NCount);
                sr.displayRow();

                System.out.println();
            }
        }
        
        displayFooter();
    }

    public static void displayFullTable()
    {
        boolean controlBit;

        for(int i=0;i<2*NCountCeiling;i++)
        {
            if(i<NCountCeiling)
            {
                controlBit = false;
            }
            else
            {
                controlBit = true;
            }

            if(i < NCount || ((i >= NCountCeiling) && (i < (NCountCeiling + NCount))))
            {   
                MBitRow m = new MBitRow(controlBit, NCount);
                m.displayRow();
                PresentStatesRow present = new PresentStatesRow( i, NCountCeiling);
                present.displayRow();
                NextStatesRow next = new NextStatesRow(i, NCountCeiling, controlBit);
                next.displayRow();

                System.out.print("| |");
                TImplementation t = new TImplementation(present, next, NCountCeiling);
                t.displayRow();
                DImplementation d = new DImplementation(present, next, NCountCeiling);
                d.displayRow();
                JKImplementation jk = new JKImplementation(present, next, NCountCeiling);
                jk.displayRow();
                SRImplementation sr = new SRImplementation(present, next, NCountCeiling);
                sr.displayRow();

                System.out.println();
            }
            else
            {
                MBitRow m = new MBitRow(controlBit, NCount);
                m.displayRow();
                PresentStatesRow present = new PresentStatesRow(NCount);
                present.displayRow();
                NextStatesRow next = new NextStatesRow(NCount);
                next.displayRow();

                System.out.print("| |");
                TImplementation t = new TImplementation(present, next, NCount);
                t.displayRow();
                DImplementation d = new DImplementation(present, next, NCount);
                d.displayRow();
                JKImplementation jk = new JKImplementation(present, next, NCount);
                jk.displayRow();
                SRImplementation sr = new SRImplementation(present, next, NCount);
                sr.displayRow();

                System.out.println();
            }
        }
        
    }

    public static void displayHeader()
    {
        displayDummyLine('-');
        System.out.print("| M ||");
        for(int i=0;i<maxCols;i++)
        {
            System.out.print(" s");
        }
        System.out.print(" ||");
        for(int i=0;i<maxCols;i++)
        {
            System.out.print(" S");
        }
        System.out.print(" ||-||");
        for(int i=0;i<maxCols;i++)
        {
            System.out.print(" T");
        }
        System.out.print(" ||");
        for(int i=0;i<maxCols;i++)
        {
            System.out.print(" D");
        }
        System.out.print(" ||");
        for(int i=0;i<maxCols;i++)
        {
            System.out.print(" J K");
        }
        System.out.print(" ||");
        for(int i=0;i<maxCols;i++)
        {
            System.out.print(" S R");
        }
        System.out.print(" |");
        System.out.println();

        System.out.print("| ~ ||");
        for(int i=0;i<maxCols;i++)
        {
            System.out.print(" " + (maxCols - i - 1));
        }
        System.out.print(" ||");
        for(int i=0;i<maxCols;i++)
        {
            System.out.print(" " + (maxCols - i - 1));
        }
        System.out.print(" ||-||");
        for(int i=0;i<maxCols;i++)
        {
            System.out.print(" " + (maxCols - i - 1));
        }
        System.out.print(" ||");
        for(int i=0;i<maxCols;i++)
        {
            System.out.print(" " + (maxCols - i - 1));
        }
        System.out.print(" ||");
        for(int i=0;i<maxCols;i++)
        {
            System.out.print(" " + (maxCols - i - 1) + " " + (maxCols - i - 1));
        }
        System.out.print(" ||");
        for(int i=0;i<maxCols;i++)
        {
            System.out.print(" " + (maxCols - i - 1) + " " + (maxCols - i - 1));
        }
        System.out.print(" |");
        System.out.println();
    }

    public static void displayFooter()
    {
        displayDummyLine('=');
    }

    public static void displayDummyLine(char c)
    {
        String outpuString = "";
        outpuString += "+";
        outpuString += c;
        outpuString += c;
        outpuString += c;
        outpuString += "++";
        
        for(int i=0;i<=2*maxCols;i++)
        {
            outpuString += c;
        }
        outpuString += "++";
        for(int i=0;i<=2*maxCols;i++)
        {
            outpuString += c;
        }
        outpuString += "++-++";
        for(int i=0;i<=2*maxCols;i++)
        {
            outpuString += c;
        }
        outpuString += "++";
        for(int i=0;i<=2*maxCols;i++)
        {
            outpuString += c;
        }
        outpuString += "++";
        for(int i=0;i<=4*maxCols;i++)
        {
            outpuString += c;
        }
        outpuString += "++";
        for(int i=0;i<=4*maxCols;i++)
        {
            outpuString += c;
        }
        outpuString += "+";

        System.out.println(outpuString);
    }

    public static int findLowest2Power(int inputValue)
     {
        int lowestPower = 0;

        while(Math.pow(2.0, (double)lowestPower) < inputValue )
        {
            lowestPower++;
        }
        return lowestPower;
     }
}















