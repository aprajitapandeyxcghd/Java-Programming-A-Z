import java.util.*;

public class Addition {
    // Function to add two numbers
    public int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int a = sc.nextInt();

        System.out.println("Enter num2: ");
        int b = sc.nextInt();

        // Create an object of the class to call the method
        Addition addition = new Addition();
        int c = addition.addTwoNumbers(a, b);

        System.out.println("The addition output is: " + c);

        sc.close(); // Close the scanner
    }
}
