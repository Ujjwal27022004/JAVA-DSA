package Hashmap;
import java.util.TreeMap;
public class treemap {
    public static void main(String[] args) {
    TreeMap<String ,Integer> hashmap = new TreeMap<>();

    hashmap.put("Ujjwal", 52);
    hashmap.put("Mayur", 98);
    hashmap.put("Chetan", 545);

    System.out.println(hashmap.get("Ujjwal"));
    System.out.println(hashmap.containsKey("Ujjwal"));
    System.out.println( hashmap.size());
    System.out.println( hashmap.isEmpty());
    System.out.println( hashmap.isEmpty());
        System.out.println(hashmap);
    }
}
