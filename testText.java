
  import java.io.FileInputStream;
  import java.io.FileNotFoundException;
  import java.io.FileOutputStream;
  import java.io.IOException;
  import java.io.ObjectInputStream;
  import java.io.ObjectOutputStream;
  import java.io.Serializable;
  import java.util.Scanner;
  
  public class testText {
  
    public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException, ClassNotFoundException  {
      
      try
      {
      employee e[] = new employee[2];
      System.out.println("Enter the Employee Details");
      Scanner input = new Scanner(System.in);
      String name,empid,address,phone;
      ObjectOutputStream objout = new ObjectOutputStream(new FileOutputStream("satish.txt"));
      for(int i=0;i<e.length;i++)
      {		
        System.out.println("Enter the employee name");
        name=input.nextLine();
        System.out.println("Enter the employee empid");
        empid=input.nextLine();
        System.out.println("Enter the employee address");
        address=input.nextLine();
        System.out.println("Enter the employee phone");
        phone = input.nextLine();
        e[i]=new employee(name,empid,address,phone);
        objout.writeObject(e[i]);
      }
      objout.writeObject(new endoffile());
      objout.close();
      //reading the objects from the input file 
      
      ObjectInputStream objin = new ObjectInputStream(new FileInputStream("satish.txt"));
      Object obj = null;
        while((obj =  objin.readObject()) instanceof endoffile == false){
                  System.out.println(((employee)obj).name);}
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
  
  class endoffile implements Serializable
  {
    
  }