package Heaps;

public class heap {
    public void insert(int[] A,int n,int value){
        n=n+1;
        A[n] = value;
        int i = n;
        while(i>1){
            int parent = i/2;
            if(A[parent] < A[i]){
                swap(A[parent],A[i]);
                    i=parent;
            }
                else{
                    return;
                }
            }
        }
    public static void swap(int a,int b){
        int temp = a;
        a=b;
        b=temp;
    }

    
    public static void main(String[] args) {
        heap A = new heap();
        int[] arr = new int[10];


    }
}
