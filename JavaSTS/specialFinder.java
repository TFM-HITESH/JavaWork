import java.util.Scanner;

public class specialFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = n; i <= m; i++) {
            specialFinder(i);
        }
    }

    public static void specialFinder(int n) {
        if (numProd(n) + numSum(n) == n) {
            System.out.println(n);
        }
    }

    public static int numSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }

    public static int numProd(int n) {
        int prod = 1;
        while (n > 0) {
            prod *= n % 10;
            n = n / 10;
        }

        return prod;
    }
}
