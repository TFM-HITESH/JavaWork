import java.util.Scanner;

public class linearSearch {
    public static void main(String args[])
    {
        String subs[] = new String[4];

        subs[0] = "Java";
        subs[1] = "Python";
        subs[2] = "DSa";
        subs[3] = "C++";
        
        Scanner sc = new Scanner(System.in);
        String key = sc.next();
        int flag = 0;

        for(String s : subs)
        {
            if(s.equals(key.toLowerCase()))
            {
                System.out.println("Subject has been found in the array");
                flag = 1;
            }
        }

        if(flag == 0)
        {
            System.out.println("not found");
        }

        sc.close();
    }
}
