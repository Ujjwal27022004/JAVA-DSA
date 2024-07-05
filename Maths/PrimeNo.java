package Maths;

import java.util.Arrays;


//SEIVE OF ERATOSTENIS
public class PrimeNo {

    public static boolean[] FindNO(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i < n; i++) {
            for (int j = 2 * i; j <= n; j = j + i) {
                isPrime[j] = false;
            }
        }
        return isPrime;

    }

    public static void main(String[] args) {
        int n = 100;
        boolean[] isPrime = new boolean[n + 1];
        isPrime = PrimeNo.FindNO(n);
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
