import java.util.EmptyStackException;

public class printAllStack {
    private int[] stackArray;
    private int top;

    // Constructor name matches the class name
    public printAllStack(int size) {
        stackArray = new int[size];
        top = -1;
    }

    // Push method
    public void push(int value) {
        if (top == stackArray.length - 1) {
            throw new StackOverflowError("Stack overflow");
        }
        stackArray[++top] = value;
    }

    // Pop method
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }

    // Top method
    public int top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to print elements from top to bottom (iteration)
    public void printAllElements() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements from top to bottom:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }

    public static void main(String[] args) {
        // Use the class name printAllStack
        printAllStack stack = new printAllStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Print all elements in the stack
        stack.printAllElements();  // Prints: 30, 20, 10
    }
}
