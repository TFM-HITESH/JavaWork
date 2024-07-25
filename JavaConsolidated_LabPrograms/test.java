
import java.util.ArrayList;
import java.util.ListIterator;

 class Stack<T> {
    private ArrayList<T> stk1 = new ArrayList<T>();
    private int index = -1;
    private final int len;

    public Stack(int n) {
        this.len = n;
    }

    public void push(T ele) throws StackOverflowException {
        if (index + 1 == len) {
            throw new StackOverflowException();
        } else {
            index++;
            stk1.add(ele);
        }
    }

    public T pop() throws StackUnderflowException {
        if (index == -1) {
            throw new StackUnderflowException();
        } else {
            T element = stk1.get(index);
            index--;
            return element;
        }
    }

    public void display() throws StackUnderflowException, StackOverflowException {
        if (index == -1) {
            throw new StackUnderflowException();
        } else if (index + 1 == len) {
            throw new StackOverflowException();
        } else {
            ListIterator<T> itr = stk1.listIterator(stk1.size());
            while (itr.hasPrevious()) {
                T ele = itr.previous();
                System.out.println(ele);
            }
        }
    }
}
public class test{
    public static void main(String[] args) {
        Stack<Double> s1 = new Stack<Double>(3);
        try {
            s1.push(57.7);
            s1.display();
            System.out.println("============");
            s1.push(7.7);
            s1.display();
            System.out.println("============");
            s1.pop();
            System.out.println("============");
            s1.push(-797.7);
            s1.display();
            System.out.println("============");
            s1.push(37.9);
            s1.display();
            System.out.println("============");
        } 
        catch (StackOverflowException | StackUnderflowException e) {
          System.out.println(e.getMessage());
        }
    }
}

class StackOverflowException extends Exception {
    StackOverflowException() {
        super("Stack has overflowed! Can't take more elements");
    }
}

class StackUnderflowException extends Exception {
    StackUnderflowException() {
        super("Stack has underflowed! Can't delete more elements");
    }
}