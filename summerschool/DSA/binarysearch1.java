package DSA;

public class binarysearch1 {
    static int count = 0 ;

    public static int search(int[] A,int i,int j)
    {
        count++;
        if(i>j){
            return -1;
        }
        



        else{
            int mid = (i+j)/2;

            if(A[mid] == mid){
                return mid;
            }
            else if(A[mid]<mid){
                return search(A,i,mid-1);
            }else if(A[mid]>mid){
               return search(A,mid+1,j);
            }
        }


        return -1;
    }
    public static void main(String[] args) {
        int[] A = {-150,-100,-90,-80,-70,-50,-20,-10,-5,-3,0,3,7,9,10,13,17,20,25,30,35,50,55,60,70,90,200,210,220};
        binarysearch1 obj = new binarysearch1();

        int a = obj.search(A, 0, A.length-1);
        System.out.println(a);
        System.out.println(count);
    }
}
