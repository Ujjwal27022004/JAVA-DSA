// Dynamic programming

import java.util.*;




    public static void main(String[] args) {
        fibonacci2 A = new fibonacci2();
        int n=5;
        int[] dp = new int[n+1]; 
        Arrays.fill(dp,-1);
        System.out.println(A.fibo(n, dp));
        
    }
    
}
