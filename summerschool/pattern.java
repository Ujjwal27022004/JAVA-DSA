
import java.util.Scanner;

public class pattern {

    void function(int n) {
        int size = 2 * n + 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == n && j == n) {
                    System.out.print("A");
                } else if (i == j || i + j == size - 1) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern pattern = new pattern();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        pattern.function(a);
    }
}
