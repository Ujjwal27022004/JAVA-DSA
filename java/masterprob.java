import java.util.*;

public class masterprob {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the no");
        // int n = sc.nextInt();
        // boolean ans1 = isPrime(n);
        // System.out.println(ans1);
        // boolean ans2 = Armstrong(n);
        // System.out.println(ans2);

        int[] array = { 22,3,6,4,555,8,2,6,6};
        // swapArray(array, 2, 3);
        // System.out.println(Arrays.toString(array));
        // int max=maxArray(array);
        // int[] reverseArray=reverseArray1(array);
        // System.out.println(max);
        // System.out.println(Arrays.toString(reverseArray));
        reverseArray2(array);
        System.out.println(Arrays.toString(array));
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            int c = 2;
            while (c * c <= n) {
                if (n % c == 0) {

                    return false;
                }
                c++;
            }
            return c * c > n;
        }
    }

    // static boolean Armstrong(int n) {
    // int original = n;
    // int sum = 0;
    // while (n > 0) {
    // int rem = n % 10;
    // sum = sum + rem * rem * rem;
    // n = n / 10;
    // }
    // return sum == original;
    // }
    // }

    static void swapArray(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int maxArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static int[] reverseArray1(int[] arr){
        int[] arr2=new int[arr.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=arr[(arr2.length)-i-1];
        }
        return arr2;

    }

    static void reverseArray2(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swapArray(arr,start,end);
            start++;
            end--;
        }
    }
}