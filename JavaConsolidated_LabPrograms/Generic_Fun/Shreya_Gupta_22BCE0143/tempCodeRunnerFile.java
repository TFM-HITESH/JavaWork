import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class error {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the two numbers : ");
            int a = input.nextInt();
            int b = input.nextInt();
            calculator obj = new calculator(a, b);
            obj.add();
            obj.divide();
            obj.multiply();
            obj.sub();
            obj.mod();
            obj.percent();
            System.out.println("thank you for using our software");
        } catch (InputMismatchException e) {
            System.out.println("thank you for using our software");
        } catch (ArithmeticException e) {
            System.out.println("thank you for using our software");
        } catch (Exception e) {
            System.out.println("thank you for using our software");
        }

    }
}

class calculator {
    int num1;
    int num2;

    calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void add() {
        System.out.println("sum is" + (num1 + num2));
    }

    public void divide() {
        System.out.println("quotient is" + (num1 / num2));
    }

    public void multiply() {
        System.out.println("product is" + (num1 * num2));
    }

    public void sub() {
        System.out.print("the diffrence is ");
        System.out.println(num1 - num2);
    }

    public void mod() {
        System.out.println("modulo is" + (num1 % num2));
    }

    public void percent() {
        System.out.println("percent is" + num1 / (num2 * 100));
    }
}