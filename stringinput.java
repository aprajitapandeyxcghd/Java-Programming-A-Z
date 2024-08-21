//Write Hello World Program in Java
import java.util.Scanner;

public class stringinput{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your inout: ");
        String name = sc.nextLine();
        System.out.println(name);
        sc.close();
    }
}