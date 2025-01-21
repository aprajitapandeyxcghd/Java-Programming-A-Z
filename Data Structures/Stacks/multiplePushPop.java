import java.util.*;
public class multiplePushPop{
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the stack: ");
        int size = sc.nextInt();

        for(int i=0; i<size; i++){
            System.out.print("Element" + (i+1) +":");
            int element = sc.nextInt();
            stack.push(element);
        }

        System.out.println("Stack before popping: " + stack);

        if(!stack.isEmpty()){
            int poppedElement = stack.pop();
            System.out.println("Popped Element: " + poppedElement);
        }
        else{
            System.out.print("Stack is empty!");
        }

        System.out.println("Stack after popping: " + stack);

        for(int j=0; j<size; j++){
            System.out.print("Element" + (j+1) +":");
            int element2 = sc.nextInt();
            stack.push(element2);
        }

        System.out.println("Stack after second push: " + stack);

        if(!stack.isEmpty()){
            int poppedElement2 = stack.pop();
            System.out.println("The new popped element is: " + poppedElement2);
        }
        else{
            System.out.println("Stack is empty.");

        }

        System.out.println("Stack after second pop: " + stack);

        sc.close();
    }
}