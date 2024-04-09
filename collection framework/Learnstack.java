import java.util.Stack;
public class Learnstack {

    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("lion");
        animals.push("tiger");
        animals.push("horse");
        animals.push("cow");

        System.out.println(animals);
        System.out.println(animals.peek());

        animals.pop();
        System.out.println(animals);
    }
    
}
