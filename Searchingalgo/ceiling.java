package Searchingalgo;

public class ceiling {
    public int ceilingNo(int[] arr,int target)
    {
        int s = 0;
        int n = arr.length;
        int e = n-1;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]<target){
                s = mid+1;
            }
            else if(arr[mid]>target){
                e = mid-1;
            }
            else{
                return mid;
            }
        }
        return e;
    }

    public static void main(String[] args) {
        ceiling A = new ceiling();
        int[] arr = {1,3,4,6,7,98};
        int a = A.ceilingNo(arr, 5);

        System.out.println(a);
    }
}
