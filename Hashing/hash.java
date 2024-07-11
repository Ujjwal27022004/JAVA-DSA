package Hashing;

import java.util.Scanner;

public class hash {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int hash[] = new int[13];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;
        }

        for (int j = 0; j < hash.length; j++) {
            
            System.out.println(hash[j]);
        }


    }

    
}
