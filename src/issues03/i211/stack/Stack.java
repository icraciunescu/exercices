package issues03.i211.stack;

public class Stack {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char i) {
        if (maxSize - 1 > top) {
            top++;
            stackArray[top] = i;
        } else {
            System.out.println("stack is full");
        }
    }

    public char pop() {
        if (top != -1) {
            int oldTop = top;
            top--;
            return stackArray[oldTop];
        } else {
            System.out.println("stack is empty");
            return '0';
        }
    }

    public char peak() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }
}
