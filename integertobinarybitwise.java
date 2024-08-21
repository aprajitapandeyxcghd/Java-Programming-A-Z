import java.util.Scanner;
public class integertobinarybitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary: ");
        int num = sc.nextInt();
        int binary[]= new int[100];
        int i=0;

        //Logic
        while(num!=0){
            binary[i]= num & 1;
            num = num >> 1;
            i++;
        }

        System.out.print("Binary value is: ");
        for(int j=i-1;j>=0;j--){
            System.out.print(""+binary[j]);

        }
        sc.close();
    }
    
}
