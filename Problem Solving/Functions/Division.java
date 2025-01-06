import java.util.*;

public class Division {
    public int divideTwoNumbers(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0; // or throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        Division div = new Division();
        int result = div.divideTwoNumbers(a, b);
        System.out.println("The result is: " + result);

        sc.close();
    }
}

