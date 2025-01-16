import java.util.*;
public class logicalArr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sizes of arrays: ");
        int size = sc.nextInt();
        
        System.out.println("Enter array1: ");
        int[] array1 = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Element" + (i+1) + ":");
            array1[i] = sc.nextInt();
            
        }
        System.out.println("Enter array2: ");
        int[] array2 = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Element" + (i+1) + ":");
            array2[i] = sc.nextInt();
        }

        int[] andResult = new int[size];
        int[] orResult = new int[size];
        int[] xorResult = new int[size];
        int[] notResult = new int[size];

        for(int i=0; i<size;i++){
            andResult[i] = array1[i] & array2[i];
            orResult[i] = array1[i] | array2[i];
            xorResult[i] = array1[i] ^ array2[i];
            notResult[i] = ~array1[i];
        }

        System.out.println("AND result: " + Arrays.toString(andResult));
        System.out.println("OR result: " + Arrays.toString(orResult));
        System.out.println("XOR result: " + Arrays.toString(xorResult));
        System.out.println("NOT result: " + Arrays.toString(notResult));

        sc.close();     
    }

    public static void displayArray(int[] array){
        for(int element : array){
            System.out.print(element + " ");

        }
        System.out.println();

    }
    
}
