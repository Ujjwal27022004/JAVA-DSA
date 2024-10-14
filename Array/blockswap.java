package Array;

public class blockswap {

    public static void swap(int[] arr,int a,int b,int k){
        for(int i=0;i<k;i++){
            int temp = arr[a+i];
            arr[a+i] = arr[b+i];
            arr[b+i] = temp;
        }
    }

    public static void Blockswap(int[] arr,int i,int k,int n){
        
        if(k == n-k){
            swap(arr,i,n-k+i,k);
            return;
        }

        else if(k<n-k){
            swap(arr,i,n-k+i,k);
            Blockswap(arr,i,k,n-k);
        }
        else{
            swap(arr, i, k, n-k);
            Blockswap(arr, n-k+i, 2*k-n, k);
        }
    }
    public static void main(String[] args) {
        
    }
}
