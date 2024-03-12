public class fibonacci {
    public static void main(String[] args) {
        int n=fibo(4);
        System.out.println(n);
    }

    static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return fibo(n-2)+fibo(n-1);
    }
}
