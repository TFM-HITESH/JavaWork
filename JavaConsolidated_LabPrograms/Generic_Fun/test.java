
  import java.io.FileInputStream;
  import java.io.FileOutputStream;
  import java.io.ObjectInputStream;
  import java.io.ObjectOutputStream;
  import java.io.Serializable;
  import java.util.Scanner;
  public class test{
    public static void main(String args[]) 
    {
      try
      {
      employee e;
      System.out.println("Enter the Employee Details");
      Scanner input = new Scanner(System.in);
      String name,empid,address,phone;
      ObjectOutputStream objout = new ObjectOutputStream(new FileOutputStream("satish.txt"));
      System.out.println("Enter the employee name");
      name=input.nextLine();
      System.out.println("Enter the employee empid");
      empid=input.nextLine();
      System.out.println("Enter the employee address");
      address=input.nextLine();
      System.out.println("Enter the employee phone");
      phone = input.nextLine();
      e=new employee(name,empid,address,phone);
      //Writing the object to a file
      objout.writeObject(e);
      objout.close();
      //reading the object from the input file 
      ObjectInputStream objin = new ObjectInputStream(new FileInputStream("satish.txt"));
      Object obj = null;
      obj =  objin.readObject();
      System.out.println("The name of the employee is ");
      System.out.println(((employee)obj).name);
      objin.close();
      }	
        catch(Exception e)
        {
          System.out.println("I am catching exception here");
          System.out.println(e.getMessage());
        }
      }
    }
  
    class employee implements Serializable
    {
      String name;
      String empid;
      String address;
      String phone;
      public employee(String name, String empid, String address, String phone) {
        this.name = name;
        this.empid = empid;
        this.address = address;
        this.phone = phone;
      }
    }
