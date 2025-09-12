
/**
 * Write a description of class MyStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyStack<T>
{
    private int top = -1;
    private T[] theStack;
    
    public MyStack() {
        theStack = (T[])(new Object[100]);
    }
    
    public void push(T element) {
        if (top >= 99) {
            System.out.println("this stack is not supposed to hold over 100 items :(");
        } else {
            top++;
            theStack[top] = element;
        }
    }
    
    public T pop() {
        if (top >= 0) {
            top--;
            return theStack[top + 1];
        } else {
            return null;
        }
    }
    
    public boolean empty() {
        return top == -1;
    }
    
    public T peek() {
         if (top >= 0) {
            return theStack[top];
        } else {
            return null;
        }
    }
    
    public void makeEmpty() {
        top = -1;
    }
    
    public static void main(String[] args) {
        MyStack<Integer> s1 = new MyStack<Integer>();
        System.out.println(s1.peek());
        System.out.println(s1.empty());
        System.out.println(s1.pop());
        s1.push(3);
                System.out.println(s1.peek());

        s1.push(-2);
                System.out.println(s1.peek());

        s1.push(1030);
                System.out.println(s1.peek());

        System.out.println(s1.peek());
        System.out.println(s1.pop());
                System.out.println(s1.peek());

        System.out.println(s1.empty());
        for (int i = 0; i < 100; i++) {
            s1.push(i);
        }
        System.out.println(s1.peek());
        s1.makeEmpty();
        System.out.println(s1.peek());
        System.out.println(s1.empty());
    }
}
