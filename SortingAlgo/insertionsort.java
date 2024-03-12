package SortingAlgo;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        insertionsort A = new insertionsort();
        int[] arr = {5,4,3,2,1};
        A.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void sort(int[] arr){
        int n  = arr.length;
        for(int i=0;i < n-1;i++){
            for (int j = i+1; j > 0; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    public void swap(int[] arr,int first,int second){
        int temp = arr[first]; 
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
