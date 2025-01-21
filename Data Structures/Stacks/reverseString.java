import java.util.*;
public class reverseString{
    public static void main(String[] args){
        Stack<String> ogStack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the string: ");
        int size = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<size; i++){
            System.out.print("Element" + (i+1) + ":");
            String character = sc.nextLine();
            ogStack.push(character);
        }

        Stack<String> reversedStack = new Stack<>();

        while(!ogStack.isEmpty()){
            reversedStack.push(ogStack.pop());
            
        }
        
        for(int i=0; i<reversedStack.size(); i++){
            System.out.println("Character at " + (i) + ":" + reversedStack.get(i));
        }

        System.out.println("Reversed stack is: " + reversedStack);


        sc.close();
    }
}