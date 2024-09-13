import java.util.*;

public class test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        System.out.println("Hello world");
        sc.close();

        Triangle t = new Triangle();
        t.area();

        System.out.println("hello world");
    }
}

class Triangle implements Shape {
    public void area() {
        System.out.println("hello");
    }
}

interface Shape {
    int area1 = 0;

    void area();

    default void display() {
        System.out.println(area1);
    }
}
