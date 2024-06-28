package DSA;
import java.util.Scanner;

public class mergesort2 {

    static Scanner sc = new Scanner(System.in);

    public void sort(int n,int a) {
        int logn = n/a;
        int size = a*n;

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
        System.out.println("Enter a number(n):");
        int n = sc.nextInt();
        System.out.println("Enter a number(a):");
        int a = sc.nextInt();

        mergesort2 A = new mergesort2();
        A.sort(n,a);
    }
}
 
