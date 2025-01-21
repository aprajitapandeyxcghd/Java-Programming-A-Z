import java.util.*;
public class basicStack{
    public static void main(String[] args){
        Stack<String> chickenBiryani = new Stack<>();
        chickenBiryani.push("Oil");
        chickenBiryani.push("Vegetables");
        chickenBiryani.push("Salt");
        chickenBiryani.push("Boiled Rice");
        chickenBiryani.push("Marinated Chicken");

        System.out.println("Biryani Recipe: " + chickenBiryani);

        chickenBiryani.pop();
        System.out.println("Biryani Recipe: " + chickenBiryani);
    }
}