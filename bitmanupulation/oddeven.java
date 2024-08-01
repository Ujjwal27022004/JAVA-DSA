package bitmanupulation;

public class oddeven {
        static String oddEven(int N){
            
            int a = N&1;
            if(a == 1){
                return "odd";
            }
            return "even";
        }
}
