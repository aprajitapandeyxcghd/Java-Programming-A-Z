import java.util.*;
public class userInput{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of the array: ");
    int size = sc.nextInt();

    int[] array = new int[size];

    System.out.println("Enter" + size + "elements");
    for(int i=0; i<=size; i++){
      System.out.print("Element" + (i+1) + " : ");
      array[i] = sc.nextInt();
    }

    System.out.println("You entered the following array: ");
    for(int num : array ){
      System.out.println(num + " ");
    }
  }
}
