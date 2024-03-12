package Searchingalgo;
import Searchingalgo.ceiling;

public class binary {
    public int binary(int[] arr,int val){
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = low +(high-low)/2;
            if(val<arr[mid]){
                high = mid-1;
            }
            else if(val>arr[mid]){
                low =mid+1;
            }
            else if(val == arr[mid]){
                return mid;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        binary A = new binary();
        int[] arr = {1,2,3,4,5,6} ;
        int b=A.binary(arr,3);

        
        ceiling B = new ceiling();
        int c = B.ceilingNo(arr, 8);
        System.out.println(c);

        System.out.println(b);
    }
}
