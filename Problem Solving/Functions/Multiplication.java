import java.util.*;
public class Multiplication{
  public int multipyTwoNumbers(int a, int b);
  return a*b;
}
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a: ");
  int a = sc.nextInt();

  System.out.println("Enter b: ");
  int b = sc.nextInt();

  Multiplication mul = new Multiplication();
  int result = mul.multiplyTwoNumbers(a,b);
  System.out.println("The product is : " + result);
  sc.close();
}
}
