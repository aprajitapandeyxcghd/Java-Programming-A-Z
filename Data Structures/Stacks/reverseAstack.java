import java.util.*;
public class reverseAstack{
    public static void main(String[] args){
        Stack <Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");

        int size = sc.nextInt();
        for(int i=0; i<size; i++){
            System.out.print("Element" + (i+1) +":");
            int element = sc.nextInt();
            stack.push(element);
        }

        Stack<Integer> reversedInteger = new Stack<>();

        while(!stack.isEmpty()){
            reversedInteger.push(stack.pop());
        }

        System.out.println("Reversed Stack: " + reversedInteger);

        System.out.println("Accessing elements in reversed order");
        for(int i=0; i<reversedInteger.size(); i++){
            System.out.println("Element at index" + i + ":" + reversedInteger.get(i));
        }

        System.out.println("Stack after reversal: " + reversedInteger);
    }
}