import java.util.*;

public class userInput {
    public static void main(String[] args) {
        Stack<String> chickenNoodles = new Stack<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation: ");
            System.out.println("1. Push an element into the stack");
            System.out.println("2. Pop an element from the stack");
            System.out.println("3. Display the stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // To consume the newline left by nextInt()

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to push: ");
                    String element = sc.nextLine();
                    chickenNoodles.push(element);
                    System.out.println(element + " has been pushed into the stack.");
                    break;

                case 2:
                    if (chickenNoodles.isEmpty()) {
                        System.out.println("Stack is empty, Nothing to pop!");
                    } else {
                        String poppedElement = chickenNoodles.pop();
                        System.out.println("Popped element: " + poppedElement);
                    }
                    break;

                case 3:
                    System.out.println("Current stack: " + chickenNoodles);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close(); // Close the scanner
                    return; // Exit the program

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
