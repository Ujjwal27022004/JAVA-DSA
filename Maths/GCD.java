package Maths;

public class GCD {
    
    public static int gcdno(int a,int b){
        if(b==0){
            return a;
        }
        return gcdno(b,a%b);
    }

    public static int lcmno(int a,int b){
        int lcm = a*b/gcdno(a, b);
        return lcm;
    }
    public static void main(String[] args) {
        int x = GCD.gcdno(15,12);
        System.out.println(x); 
        int y = GCD.lcmno(15,12);
        System.out.println(x); 
    }
}
