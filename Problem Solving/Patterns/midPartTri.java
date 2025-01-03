import java.util.*;
public class midPartTri{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter rows: ");
    int rows = sc.nextInt();

    System.out.println("Enter columns: ");
    int columns = sc.nextInt();

    for(int i = 1; i<=rows; i++){
      for(int j = 1; j<=columns; j++){
        if(i==1 || j==1 || i==rows || j==columns){
          System.out.print("*");
        }
        else{
          System.out.println(" ");
      }
      }
      System.out.println();
    }
    sc.close();
  }
}
      
      
        
