import java.util.*;
public class reverseastringusingstack{
    public static void main(String[] args){
        String inputString = "Hello World!";
        Stack<Character> GryffindorStack = new Stack<>();

        for(int i=0; i<inputString.length(); i++){
            GryffindorStack.push(inputString.charAt(i));
        }

        
        StringBuilder reversedString = new StringBuilder();
            while(!GryffindorStack.isEmpty()){
                reversedString.append(GryffindorStack.pop());
            }

            System.out.println(reversedString.toString());


        
    }
}

    
