import java.util.*;

public class JKImplementation extends NormalTableRow
{
    public LinkedList<Character> jkRow;

    public JKImplementation(PresentStatesRow presentRow, NextStatesRow nextRow, int maxValue)
    {
        super(maxValue);
        this.jkRow = new LinkedList<>();

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
                        case '0' : jkRow.add('0'); jkRow.add('x'); break;
                        case '1' : jkRow.add('1'); jkRow.add('x'); break;
                        case 'x' : jkRow.add('x'); jkRow.add('x'); break;
                    }
                    break;
                }
                case '1' :
                {
                    switch(nextState)
                    {
                        case '0' : jkRow.add('x'); jkRow.add('1'); break;
                        case '1' : jkRow.add('x'); jkRow.add('0'); break;
                        case 'x' : jkRow.add('x'); jkRow.add('x'); break;
                    }
                    break;
                } 
                case 'x' :
                {
                    switch(nextState)
                    {
                        case '0' : jkRow.add('x'); jkRow.add('x'); break;
                        case '1' : jkRow.add('x'); jkRow.add('x'); break;
                        case 'x' : jkRow.add('x'); jkRow.add('x'); break;
                    }
                    break;
                } 
            }
        }
    }

    public void displayRow()
    {
        Iterator<Character> itr = jkRow.listIterator();
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

        Iterator<Character> itr = jkRow.listIterator();
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