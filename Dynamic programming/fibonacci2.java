// Dynamic programming

import java.util.*;

public class fibonacci2 {
    int fibo(int n,int[] dp){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]= fibo(n-1,dp) + fibo(n-2,dp);
    }


    public static void main(String[] args) {
        fibonacci2 A = new fibonacci2();
        int n=5;
        int[] dp = new int[n+1]; 
        Arrays.fill(dp,-1);
        System.out.println(A.fibo(n, dp));
        
    }
    
}
