import java.util.*;

public class SRImplementation extends NormalTableRow
{
    public LinkedList<Character> srRow;

    public SRImplementation(PresentStatesRow presentRow, NextStatesRow nextRow, int maxValue)
    {
        super(maxValue);
        this.srRow = new LinkedList<>();

        for(int i = 0; i<super.maxDigits; i++)
        {
            char presentState = presentRow.presentRow.get(i);
            char nextState = nextRow.nextRow.get(i);

            switch(presentState)
            {
                case '0' :
                {
                    switch(nextState)
                    {
                        case '0' : srRow.add('0'); srRow.add('x'); break;
                        case '1' : srRow.add('1'); srRow.add('0'); break;
                        case 'x' : srRow.add('x'); srRow.add('x'); break;
                    }
                    break;
                }
                case '1' :
                {
                    switch(nextState)
                    {
                        case '0' : srRow.add('0'); srRow.add('1'); break;
                        case '1' : srRow.add('x'); srRow.add('0'); break;
                        case 'x' : srRow.add('x'); srRow.add('x'); break;
                    }
                    break;
                } 
                case 'x' :
                {
                    switch(nextState)
                    {
                        case '0' : srRow.add('x'); srRow.add('x'); break;
                        case '1' : srRow.add('x'); srRow.add('x'); break;
                        case 'x' : srRow.add('x'); srRow.add('x'); break;
                    }
                    break;
                } 
            }
        }
    }

    public void displayRow()
    {
        Iterator<Character> itr = srRow.listIterator();
        System.out.print("| ");
        while(itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }
        System.out.print("|");
    }

    public String getRow()
    {
        String currentRow = "";

        Iterator<Character> itr = srRow.listIterator();
        currentRow += "| ";
        while(itr.hasNext())
        {
            currentRow += itr.next();
            currentRow += " ";
        }
        currentRow += "|";
        return currentRow;
    }
}