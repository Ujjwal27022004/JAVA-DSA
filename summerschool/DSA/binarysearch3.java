package DSA;

public class binarysearch3 {

    public static void main(String[] args) {

        double[] A = {-150,-100,-90,-80,-70,-50,-20,-10,-5,-3,0,3,7,9,10,13,17,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,};

        for (int i = 0; ;i++) {
            if(Double.isInfinite(A[i])){
                System.out.println(i);
                break;
            }
            
        }
    }
    
}
