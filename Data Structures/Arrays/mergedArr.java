import java.util.*;

public class mergedArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take size and input for first array
        System.out.print("Enter size of first array: ");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements of first array: ");
        for (int i = 0; i < size1; i++) {
            array1[i] = sc.nextInt();
        }

        // Take size and input for second array
        System.out.print("Enter size of second array: ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements of second array: ");
        for (int i = 0; i < size2; i++) {
            array2[i] = sc.nextInt();
        }

        // Create a new array to store the merged result
        int[] mergedArray = new int[size1 + size2];
        
        // Copy elements from the first array into the merged array
        for (int i = 0; i < size1; i++) {
            mergedArray[i] = array1[i];
        }

        // Copy elements from the second array into the merged array
        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = array2[i];
        }

        // Print the merged array
        System.out.println("Merged Array: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }

        sc.close();
    }
}
