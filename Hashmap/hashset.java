package Hashmap;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        //no duplicates allowed
        HashSet<Integer> hashset = new HashSet<>();
        hashset.add(56);
        hashset.add(57);
        hashset.add(58);
        hashset.add(59);
        hashset.add(59);

        System.out.println(hashset);


    }

    
}