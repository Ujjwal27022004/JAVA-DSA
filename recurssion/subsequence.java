package recurssion;
import java.util.*;

public class subsequence {

    public static void subseq(int[] arr,List<Integer> current,int index){

        if(index>=arr.length){
            System.out.println(current);
            return;
        }

        current.add(arr[index]);
        subseq(arr,current,index+1);
        current.remove(current.size() - 1);
        subseq(arr,current,index+1);

    }
    public static void main(String[] args) {
        int[] arr  = {3,1,2};
        List<Integer> current = new ArrayList<>();
        subsequence.subseq(arr, current, 0);
    }
}
