import java.util.*;

public class PresentStatesRow extends NormalTableRow
{
    LinkedList<Character> presentRow;

    public PresentStatesRow(int insertValue, int maxValue)
    {
        super(maxValue);
        this.presentRow = new LinkedList<>();
        
        insertValue %= maxValue;
        String insertString = decToBinary(insertValue,super.maxDigits);

        for(int i=insertString.length()-1; i>=0; i--)
        {
            presentRow.add(insertString.charAt(i));
        }
    }

    public PresentStatesRow(int maxValue) //generate dummy row | x x x x ... x |
    {
        super(maxValue);
        this.presentRow = new LinkedList<>();

        for(int i=0; i<super.maxDigits; i++)
        {
            presentRow.add('x');
        }
    }

    public String decToBinary(int inputDecimal, int maxDigits)
    {
        String outputBinary = "";

        while(inputDecimal > 0)
        {
            int binaryValue = inputDecimal % 2;
            
            switch(binaryValue)
            {
                case 0 : outputBinary += "0"; break;
                case 1 : outputBinary += "1"; break;
                default : outputBinary += "x"; break;
            }
            
            inputDecimal /= 2;
        } 

        while(outputBinary.length() < maxDigits)
        {
            outputBinary += "0";
        }
        return outputBinary;
    }

    public void displayRow()
    {
        Iterator<Character> itr = presentRow.listIterator();
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

        Iterator<Character> itr = presentRow.listIterator();
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