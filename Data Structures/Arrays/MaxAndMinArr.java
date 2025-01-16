import java.util.*;
public class MaxAndMinArr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        for(int i=0; i<size;i++){
            System.out.print("Elements: " + (i+1) + ":");
            array[i] = sc.nextInt();
        }

        int min = array[0];
        int max = array[0];

        for(int i=0; i<size; i++){
            if(array[i] < min){
                min = array[i];
            }
             if(array[i] > max){
                max = array[i];
            }

        }
        System.out.println("Maximum is : " + max);
        System.out.println("Minimum is : " + min);

        sc.close();
   }
    
}
