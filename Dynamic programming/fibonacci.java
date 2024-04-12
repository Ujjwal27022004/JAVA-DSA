//normal program

import java.util.*;
public class fibonacci {
    int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {

        fibonacci A = new fibonacci();
        System.out.println(A.fibo(3));
        
    }

    
}