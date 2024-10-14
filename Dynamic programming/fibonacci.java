//normal program

import java.util.*;
public class fibonacci {


    //using recurssion
    int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }

    //using dynamic programming memmorization
    int fibo2(int n,int[] dp){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]= fibo2(n-1,dp) + fibo2(n-2,dp);
    }

    //using dynamic programming Tabular form
    int fibo3(int n,int[] dp){
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    //using dynamic programming more optimized SC = O(1);
    int fibo3(int n){
        int prev1 = 0;
        int prev2 = 1;
        int curr = 0;


        for(int i=2;i<=n;i++){
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }

    public static void main(String[] args) {

        fibonacci A = new fibonacci();
        System.out.println(A.fibo(3));
        
    }

    
}