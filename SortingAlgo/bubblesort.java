package SortingAlgo;

import java.util.Arrays;

public class bubblesort {
    public void sort(int[] arr,int n){
        for(int i = 0;i<n;i++){
            for(int j= 1; j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {

        bubblesort A = new bubblesort();
        int[] arr={1,2,3,5,4,6,};
        A.sort(arr,arr.length);
        
        System.out.println(Arrays.toString(arr));
        
       
    }
    
}
