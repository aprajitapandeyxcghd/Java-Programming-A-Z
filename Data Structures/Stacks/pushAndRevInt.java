import java.util.*;

public class pushAndRevInt {
    public static void main(String[] args) {
        Stack<Integer> myOgStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of the stack: ");
        int size = sc.nextInt();

        // Push elements into the original stack
        for (int i = 0; i < size; i++) {
            System.out.print("Push element into stack " + (i + 1) + ": ");
            int element = sc.nextInt();
            myOgStack.push(element);
        }

        // Create a reversed stack
        Stack<Integer> myRevStack = new Stack<>();
        while (!myOgStack.isEmpty()) {
            myRevStack.push(myOgStack.pop());
        }

        // Print the reversed stack with brackets
        System.out.print("Reversed Stack: ");
        System.out.print("[");
        for (int i = 0; i < myRevStack.size(); i++) {
            System.out.print(myRevStack.get(i));
            if (i < myRevStack.size() - 1) {
                System.out.print(", "); // Add a comma between elements
            }
        }
        System.out.println("]");

        sc.close();
    }
}
