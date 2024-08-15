package Trie;

import java.util.List;

public class trie {
    static class Node {
        Node[] children;
        boolean eow;

        Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word) {

        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            if (i == word.length() - 1) {
                curr.children[index].eow = true;
            }
            curr = curr.children[index];

        }
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (curr.children[index] == null) {
                return false;
            }
            if (i == key.length() - 1 && curr.children[index].eow == false) {
                return false;
            }
            curr = curr.children[index];
        }
        return true;
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.length() == 0) {
            return true;
        }

        for (String word : wordDict) {
            insert(word);
        }

        for (int i = 1; i <= s.length(); i++) {
            String firstPart = s.substring(0, i);
            String secPart = s.substring(i);

            if (search(firstPart) && wordBreak(secPart, wordDict)) { 
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String[] words = { "the", "a", "there", "their", "any" };

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(search("ther"));

    }
}
