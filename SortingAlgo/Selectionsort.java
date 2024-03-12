package SortingAlgo;

import java.util.Arrays;

public class Selectionsort {

    public static void main(String[] args) {
        Selectionsort A = new Selectionsort();
        int[] arr = {5,4,3,2,1};
        A.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void sort(int[] arr){
        for(int i = 0;i < arr.length; i++){
            int last = arr.length-i-1; 
            int maxIndex = max(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }


    public int max(int[] arr,int start,int end){
        int max = start;
        for(int i = start;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    public void swap(int[] arr,int first,int second){
        int temp = arr[first]; 
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
