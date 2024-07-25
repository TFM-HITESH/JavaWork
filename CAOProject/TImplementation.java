import java.util.*;

public class TImplementation extends NormalTableRow
{
    public LinkedList<Character> tRow;

    public TImplementation(PresentStatesRow presentRow, NextStatesRow nextRow, int maxValue)
    {
        super(maxValue);
        this.tRow = new LinkedList<>();
        
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
                        case '0' : tRow.add('0'); break;
                        case '1' : tRow.add('1'); break;
                        case 'x' : tRow.add('x'); break;
                    }
                    break;
                }
                case '1' :
                {
                    switch(nextState)
                    {
                        case '0' : tRow.add('1'); break;
                        case '1' : tRow.add('0'); break;
                        case 'x' : tRow.add('x'); break;
                    }
                    break;
                } 
                case 'x' :
                {
                    switch(nextState)
                    {
                        case '0' : tRow.add('x'); break;
                        case '1' : tRow.add('x'); break;
                        case 'x' : tRow.add('x'); break;
                    }
                    break;
                } 
            }
        }
    }

    public void displayRow()
    {
        Iterator<Character> itr = tRow.listIterator();
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

        Iterator<Character> itr = tRow.listIterator();
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