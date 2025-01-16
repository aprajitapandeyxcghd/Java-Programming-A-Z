import java.util.*;

public class palindromeArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = sc.nextLine();

        char[] charArr = inputStr.toCharArray();
        boolean isPalindrome = true;  // Start with assumption that it's a palindrome

        // Check if the string is a palindrome
        for (int i = 0; i < charArr.length / 2; i++) {
            if (charArr[i] != charArr[charArr.length - 1 - i]) {
                isPalindrome = false;  // If characters don't match, it's not a palindrome
                break;
            }
        }

        // Output the result
        if (isPalindrome) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Is not a palindrome");
        }

        // Print the array elements
        System.out.print("Array elements: ");
        for (char variable : charArr) {
            System.out.print(variable + " ");
        }

        sc.close();
    }
}
