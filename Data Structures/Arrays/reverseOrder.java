import java.util.*;
public class reverseOrder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter array ");
        int[] array = new int[size];
        for(int i=0; i<size;i++){
            System.out.print("Element" + (i+1) + ":");
            array[i]=sc.nextInt();       
    }
        System.out.println("Array in reverse order");
        for(int i=size-1; i>=0;i--){
            System.out.print(array[i] + " ");

        }

        sc.close();


}   
}
