import java.util.Scanner;

public class AddTwoNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number2: ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("Sum is: "+ sum);
        sc.close();        
    }
}