import java.util.*;

public class Subtraction {
    // Function to subtract two numbers
    public int subtractTwoNumbers(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        // Create an object to call the method
        Subtraction subtraction = new Subtraction();
        int result = subtraction.subtractTwoNumbers(a, b);

        System.out.println("The result is: " + result);

        sc.close(); // Close the scanner
    }
}
