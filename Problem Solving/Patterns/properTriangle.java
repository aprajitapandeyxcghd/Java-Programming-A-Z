import java.util.*;
public class properTriangle{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter rows: ");
    int rows = sc.nextInt();

   for(int i=1; i<=rows; i++){
     for(int j=i; j<rows; j++){
       System.out.println(" ");
     }
   }
    for(int k=1; k<=i;k++){
      System.out.print("*");
    }
    System.out.println();
  }
  sc.close();
}
}
