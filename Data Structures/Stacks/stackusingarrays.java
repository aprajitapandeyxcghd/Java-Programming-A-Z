import java.util.*;
public class stackusingarrays{
  public static void main(String[] args){
    String[] GryffindorArray = {"Harry", "Hermione","Ronald"};
    String[] SlytherinArray = {"Draco", "Crabbe", "Goyle"};
    String[] RavenclawArray = {"Cho", "Ravenclaw","Lochart"};
    String[] HufflepuffArray = {"Cedric", "Tonks", "Teddy"}

    Stack<String>GryffindorStack = new Stack<>();
    Stack<String>SlytherinStack = new Stack<>();
    Stack<String>RavenclawStack = new Stack<>();
    Stack<String>HufflepuffStack = new Stack<>();

    for(String member : GryffindorStack){
      GryffindorStack.push(member)
        };
    for (String member1 : SlytherinStack){
      SlytherinStack.push(member1)
        };
    for(String member2 : RavenclawStack){
      RavenclawStack.push(member2)
        };
    for(String member3 : HufflepuffStack){
      HufflepuffStack.push(member3)
        };

    GryffindorStack.push("Ginny");
    SlytheriStack.push("Voldemort");
    Ravenclaw.push("Quirell");
    Hufflepuff.push("Hannah");
    
    System.out.println("Before popping");
    System.out.println(GryffindorStack);
    System.out.println(SlytherinStack);
    System.out.println(RavenclawStack);
    System.out.println(HufflepuffStack);

    GryffindorStack.pop();
    SlytherinStack.pop();
    RavenclawStack.pop();
    HufflepuffStack.pop();

    System.out.println("After popping");
    System.out.println(GryffindorStack);
    System.out.println(SlytherinStack);
    System.out.println(RavenclawStack);
    System.out.println(HufflepuffStack);
    
  }
}

    



  
