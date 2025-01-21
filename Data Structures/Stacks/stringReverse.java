import java.util.*;
public class stringReverse{
    public static void main(String[] args){
        Stack<String> myString = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the string: ");
        int size = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<size; i++){
            System.out.print("Character" + (i+1) + ":");
            String myChar = sc.nextLine();
            myString.push(myChar);
        }

        Stack<String> myReversedString = new Stack<>();

        while(!myString.isEmpty()){
            myReversedString.push(myString.pop());
        }

        for(int i=0; i<myReversedString.size(); i++){
            System.out.print("Character at" + (i) + "is" + myReversedString.get(i));
        }

        System.out.println("Reversed stack is: " + myReversedString);
        sc.close();
  
    }
}