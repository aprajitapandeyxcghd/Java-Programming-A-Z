import java.util.*;
public class sumAverage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter elements in the array ");
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Element" + (i+1) + ":");
            array[i] = sc.nextInt();
        }

        int sum =0;
        for(int num : array){
            sum += num;
        }
        double average = (double)sum/size;

        System.out.println("Sum: " + sum);
        System.out.println("Average:"+ average);

        sc.close();
    }
    
}
