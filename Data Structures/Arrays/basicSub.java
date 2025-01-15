import java.util.*;
public class basicSub{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array1: ");
    int size1 = sc.nextInt();
    
    System.out.println(" For array1 ");
    int[] array1 = new int[size1];

    for(int i=0; i<size1; i++){
    System.out.print(" Element" + (i+1) + " of Array: ");
    array1[i] = sc.nextInt();
    }
    
    System.out.print("Enter size of array2: ");
    int size2 = sc.nextInt();
    System.out.println(" For array2 ");
    int[] array2 = new int[size2];
    
    for(int j = 0; j < size2; j++){
      System.out.print(" Element" + (j+1) + "of Array: ");
      array2[j] = sc.nextInt();
    }

    System.out.print("Enter the index of the first number to add: ");
    int index1 = sc.nextInt();

    System.out.print("Enter the index of the second number to add: ");
    int index2 = sc.nextInt();

    if(index1 >= 0 && index1 < size1 && index2 >= 0 && index2 < size2){
      int sub = array1[index1] + array2[index2];
      System.out.println("Difference : " + sub);
    }
    else{
      System.out.println("Invalid!");
    }
    sc.close();
      }
}
