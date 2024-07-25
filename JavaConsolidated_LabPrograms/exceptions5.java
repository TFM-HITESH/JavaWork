import java.util.*;
public class exceptions5
{
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        try
        {
            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter a number to divide");
            int a = input.nextInt();
            System.out.println(4/a);
            try
            {
                System.out.println("Enter an Integer");
                int k=input1.nextInt();
                System.out.println("Your number is" +k);
            }
            catch(InputMismatchException e)
            {
                System.out.println("Wrong data type entered !");
            }
            finally
            {
                input1.close();
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            input.close();
        }        
    }   
}

