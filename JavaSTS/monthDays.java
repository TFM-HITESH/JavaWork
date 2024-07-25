import java.util.Scanner;

public class monthDays {
    public static void main(String[] args) {
        // System.out.println("hello world");

        int inputYear;
        int inputMonth;

        Scanner sc = new Scanner(System.in);
        inputYear = sc.nextInt();
        inputMonth = sc.nextInt();

        sc.close();

        int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (isLeapYear(inputYear) && inputMonth == 2) {
            System.out.println("29 Days");
        } else {
            System.out.println(monthDays[inputMonth - 1] + " Days");
        }

    }

    public static boolean isLeapYear(int year) {
        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                } else {
                    isLeap = false;
                }
            } else {
                isLeap = true;
            }
        }

        return isLeap;
    }
}