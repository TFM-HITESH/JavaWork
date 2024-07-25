public class t1
{
    public static void main(String args[])
    {
        t1.display("hello");
        t1.display(1234);
        t1.display(1.2f);
        System.out.println();

        t1.display2(1,2);
        t1.display2("hello","hi");
        t1.display2(1,12);
        System.out.println();

        display3("hello",123);
        display3(123,"hi");
        System.out.println();

        test<String, Integer> t = new test<String, Integer>("hii",123);
        t.display();
        test<Integer, Integer> to = new test<>(1,2);
        to.display();
    }

    public static <T> void display(T element)
    {
        System.out.println(element);
    }

    public static <T> void display2(T ele1, T ele2)
    {
        System.out.println(ele1 + "---" + ele2);
    }

    public static <T,U> void display3(T ele1, U ele2)
    {
        System.out.println(ele1 + "---" + ele2);
    }
}


class test<T,U>
{
    T ele1;
    U ele2;

    test(T ele1, U ele2)
    {
        this.ele1 = ele1;
        this.ele2 = ele2;
    }

    public void display()
    {
        System.out.println(ele1);
        System.out.println(ele2);
    }
}