import java.util.*;
public class rightTriangle{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the triangle: ");
    int size = sc.nextInt();
    int count = 1; 
    while(count<=size){
      for(int i=1; i<=count; i++){
        System.out.print("*");
      }
      System.out.println();
      count++;
    }
    sc.close();
  }
}
