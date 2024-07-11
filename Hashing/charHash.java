package Hashing;

import java.util.Scanner;

public class charHash {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int hash[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a'] += 1;
        }

        for (int j = 0; j < hash.length; j++) {
            System.out.println(hash[j]);
        }
    }
}
