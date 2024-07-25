import java.util.*;

public class MBitRow extends NormalTableRow
{
    LinkedList<Character> mRow;

    public MBitRow(boolean controlBit, int maxValue)
    {
        super(maxValue);
        this.mRow = new LinkedList<>();

        if(controlBit == true)
        {
            mRow.add('1');
        }
        else
        {
            mRow.add('0');
        }
    }

    public void displayRow()
    {
        Iterator<Character> itr = mRow.listIterator();
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

        Iterator<Character> itr = mRow.listIterator();
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