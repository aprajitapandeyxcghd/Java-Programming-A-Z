import java.util.*;
public class basicMul {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array1: ");
        int size1 = sc.nextInt();

        System.out.print("For array 1 ");
        int[] array1 = new int[size1];
        for(int i=0; i<size1;i++){
            System.out.print("Element" + (i+1) +  ":");
            array1[i] = sc.nextInt();
        }
        
        System.out.print("For array 2");
        System.out.print("Enter size of array2: ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        for(int j=0; j<size2;j++){
            System.out.print("Element" + (j+1) + ":");
            array2[j] = sc.nextInt();
        }

        System.out.print("Enter the index for the first number: ");
        int index1 = sc.nextInt();

        System.out.print("Enter the index for the second number: ");
        int index2 = sc.nextInt();

        if(index1 >= 0 && index1 < size1 && index2 >= 0 && index2 < size2){
            int mul = array1[index1] * array2[index2];
            System.out.println("Product is : " + mul);
        }
        sc.close();
    }
}
