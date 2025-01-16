import java.util.*;
public class factorialArr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the arrays: ");
        int size = sc.nextInt();

        System.out.print("Enter elements of the array:  ");
        int[] array1 = new int[size];

        for(int i=0; i<size;i++){
            System.out.print("Element" + (i+1) +":");
            array1[i] = sc.nextInt();
        }

        System.out.println("Factorials of the numbers:");
        for (int i = 0; i < size; i++) {
            System.out.println("Factorial of " + array1[i] + " is " + calculateFactorial(array1[i]));
        }
        sc.close();
    }

    public static long calculateFactorial(int n){
        if(n<0){
            return -1;
        }

        long factorial = 1;
        for(int i=1; i<=n;i++){
            factorial *= i;
        }
        return factorial;
    }
    
}
