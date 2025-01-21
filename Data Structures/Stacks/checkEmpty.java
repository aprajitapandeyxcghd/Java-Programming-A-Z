import java.util.*;
public class checkEmpty {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        stack.push(100);

        if(!stack.isEmpty()){
            System.out.println("Stack is Full.");
        }
        else{
            System.out.println("Stack is empty.");
        }

    }
}
