package DSA;

import java.util.Scanner;

public class mergesort {

    static Scanner sc = new Scanner(System.in);

    public void sort(int n) {
        int logn = (int) Math.ceil(Math.log(n) / Math.log(2)); 
        int size = n / logn;

        int[][] A = new int[logn][size];

        for (int i = 0; i < logn; i++) {
            System.out.println("Enter Array " + i + " elements:");
            for (int j = 0; j < size; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int[] ans = A[0];
        for (int j = 1; j < logn; j++) {
            ans = merge(ans, A[j]);
        }

        System.out.println("Merged sorted array:");
        for (int p = 0; p < ans.length; p++) {
            System.out.print(ans[p] + " ");
        }
        System.out.println();
    }

    public static int[] merge(int[] first, int[] second) {
        int[] temp = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                temp[k++] = first[i++];
            } else {
                temp[k++] = second[j++];
            }
        }

        while (i < first.length) {
            temp[k++] = first[i++];
        }
        while (j < second.length) {
            temp[k++] = second[j++];
        }

        return temp;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        mergesort A = new mergesort();
        A.sort(n);
    }
}
