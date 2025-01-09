import java.util.*;
public class solidTriangle{
  public static void printLine(int spaces, int stars){
    if(spaces > 0){
      System.out.print(" ");
      printLine(spaces - 1, stars);
    }
    else if(stars > 0){
      System.out.println("*");
      printLine(spaces, stars - 1);
    }
  }

  public static void printTriangle(int rows, int currentRow){
    if(currentRow > rows){
      return;
    }
    int spaces = rows - currentRow;
    int stars = 2 * currentRow - 1;

   printLine(spaces, stars);
   System.out.println();

   printTriangle(rows, currentRow + 1);
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows for the triangle: ");
    int rows = sc.nextInt();

    printTriangle(rows, 1);
  }
}
   
