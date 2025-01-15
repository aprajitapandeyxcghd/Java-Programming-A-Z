import java.util.*;

public class basicDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for array1
        System.out.print("Enter size of array1: ");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        System.out.println("For array1");
        for (int i = 0; i < size1; i++) {
            System.out.print("Element" + (i + 1) + ": ");
            array1[i] = sc.nextInt();
        }

        // Input for array2
        System.out.println("For array2");
        System.out.print("Enter size for the array2: ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        for (int j = 0; j < size2; j++) {
            System.out.print("Element" + (j + 1) + ": ");
            array2[j] = sc.nextInt();
        }

        // Input for indices
        System.out.print("Enter the index for the number in array1: ");
        int index1 = sc.nextInt();
        System.out.print("Enter the index for the number in array2: ");
        int index2 = sc.nextInt();

        // Validation and Division
        if (index1 >= 0 && index1 < size1 && index2 >= 0 && index2 < size2) {
            if (array2[index2] == 0) {
                System.out.println("Division by zero is not allowed!");
            } else {
                int div = array1[index1] / array2[index2];
                System.out.println("Division Answer: " + div);
            }
        } else {
            System.out.println("Invalid indices. Please enter valid indices.");
        }

        sc.close();
    }
}
