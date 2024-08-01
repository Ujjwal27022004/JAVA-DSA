package bitmanupulation;
import java.util.*;
public class swapwithouttemp {
    
        static List<Integer> get(int a,int b)
        {
        List<Integer> A = new ArrayList<>();
           a = a^b;
           b = a^b;
           a=a^b;
           
           A.add(a);
           A.add(b);
           return A;
        }
    
}
