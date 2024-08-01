package bitmanupulation;

public class FindXORlTOr {
    public static int findXOR(int l, int r) {
        
        int ans = XOR(l-1)^XOR(r);
        return ans;
        
    }
    
    public static int XOR(int n){
        if(n%4 == 1){
            return 1;
        }
        if(n%4 == 2){
            return n+1;
        }
        if(n%4 == 3){
            return 0;
        }
        if(n%4 == 0){
            return n;
        }
        
        return -1;
    }
}
