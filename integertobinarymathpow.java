import java.util.Scanner;
public class integertobinarymathpow {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter integer: ");
        int num = sc.nextInt();
        int i = 0;
        int binary=0;
        int rem;

        //MathPow Method
       
        while(num!=0){
            rem= num%2;
            binary+=rem*Math.pow(10,i);
            num/=2;
            i++;
        }

        System.out.print("Binary value is: " + binary);
        sc.close();
    }
    
}
