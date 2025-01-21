import java.util.*;
public class userInputEasy{
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the stack: ");
        int size = sc.nextInt();

        for(int i=0; i<size;i++){
            System.out.print("Element" + (i+1)+":");
            int element = sc.nextInt();
            stack.push(element);

        }

        System.out.println("Stack before popping" + stack);

        if(!stack.isEmpty()){
            int poppedElement = stack.pop();
            System.out.println("Popped Element: " + poppedElement);
        }
        else{
            System.out.println("Stack is empty");
        }

        System.out.println("Stack after popping" + stack);

        sc.close();
    }
}