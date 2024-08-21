import java.util.Scanner;
public class integertobinary {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int num = sc.nextInt();
        int binary[]= new int[100];
        int i=0;
        
        while(num!=0){
            binary[i]=num%2; //for storing remainder
            num=num/2; 
            i++;
        }
        System.out.print("Binary value is: ");
        for(int j=i-1;j>=0;j--){  //to print in reverse order
            System.out.print(""+binary[j]);
        }
        sc.close();     
        

    }
    
}
