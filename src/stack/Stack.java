package stack;

public class Stack {

    private int maxSize;
    private int[] stack;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stack = new int[size];
        this.top = -1;
    }

    public int peek() {
        return this.stack[this.top];
    }

    public void push(int value) {
        this.stack[++this.top] = value;
    }

    public int pop() {
        return this.stack[this.top--];
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.maxSize - 1 == this.top;
    }
}
