package SortingAlgo;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,2,1};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sort(int[] arr) {

        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] second) {
        int[] temp = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                temp[k] = first[i];
                i++;
            } else {
                temp[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            temp[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            temp[k] = first[i];
            i++;
            k++;
        }
        return temp;
    }
}
