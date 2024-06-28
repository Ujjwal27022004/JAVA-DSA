package DSA;

public class binarysearch2 {
    static int count =0;
    public int search(double[] A,int i,int j){
        int index = 0;
        count++;



        if(i>j){
            return -1;
        }
        else{
            int mid = (i+j)/2;
            if(Double.isInfinite(A[i])){
                return i;
            }
            else if(A[mid]<Double.POSITIVE_INFINITY){
                return search(A,mid+1,j);
            }
            else if(Double.isInfinite(A[mid])){
                return search(A, i, mid);
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        double[] A = {-150,-100,-90,-80,-70,-50,-20,-10,-5,-3,0,3,7,9,10,13,17,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,};
        binarysearch2 obj = new binarysearch2();

        // System.out.println(A.length);
        int a = obj.search(A, 0, A.length-1);
        System.out.println(a);
        System.out.println(count);
    }
}
