import java.util.*;

class BankAccount
{
    public double balance = 0;
    public void deposit(double dep)
    {
        System.out.println("BankAccount deposit");
        this.balance += dep;
    }
    
    public void withdraw(double lessAmount)
    {
        System.out.println("BankAccount withdraw");
    }
}

class SavingsAccount extends BankAccount
{
    public void withdraw(double lessAmount)
    {
        if(lessAmount < 10000.0)
        {
            if(balance - lessAmount > 0.0)
            {
                System.out.println("The remaining balance is : " + (balance - lessAmount));
                super.balance -= lessAmount;
            }
            else
            {
            }
        }
        else
        {
            System.out.println("Exceeding the withdraw limit for this account !");
        }	 	  	 	  		     	    			  	 	
    }
}

class CheckingAccount extends BankAccount
{
    public void withdraw(double lessAmount)
    {
        if(lessAmount < 100000.0)
        {
            if(balance - lessAmount > 0.0)
            {
                System.out.println("The remaining balance is : " + (balance - lessAmount));
                super.balance -= lessAmount;
            }
            else
            {
            }
        }
        else
        {
            System.out.println("Exceeding the withdraw limit for this account !");
        }
    }
}

public class dynamic1
{
    public static void main(String args[])
    {
        BankAccount s = new SavingsAccount();
        BankAccount c = new CheckingAccount();
        
        s.deposit(20000);
        c.deposit(50000);
        
        withdrawFromAccount(s, 5000);
        withdrawFromAccount(s, 11000);
        withdrawFromAccount(s, 6000);
        withdrawFromAccount(c, 5000);
        withdrawFromAccount(c, 49000);
        withdrawFromAccount(c, 50000000);
        
    }	 	  	 	  		     	    			  	 	
    
    public static void withdrawFromAccount(BankAccount account, double amount)
    {
        account.withdraw(amount);
    }
}
