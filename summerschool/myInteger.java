
import java.util.Scanner;

public class myInteger {



    public static int compare(int x,int y){
        if(x>y){
            return 1;
        }
        else if(x<y){
            return -1;
        }

        return 0;
    }

    public static int compareUnsigned(int x,int y){

        x=Math.abs(x);
        y=Math.abs(y);
        if(x>y){
            return 1;
        }
        else if(x<y){
            return -1;
        }

        return 0;
    }

    public static long toUnsignedLong(int x){

        long z = Integer.MAX_VALUE;
        long a = 2*z-x-8;
        if(x<0){
            return a ;
        }
        return x;

    }

    public static long divideUnsigned(int x, int y){
        long a = toUnsignedLong(x);
        long b = toUnsignedLong(y);

        long c = (a/b);
        return c;
    }

    public static int highestOneBit(int x){
        int i=1;

        if(x==1){
            return i;
        }
        while(i<x){
            i=2*i;
        }
        return i/2;
    }

    // public static int lowestOneBit(int x){
    //     String a = Integer.toBinaryString(x);
    //     int l = a.length();
    //     double   count=1;
    //     for(int i=l-1;i>=0;i++){
    //         if(a.charAt(i) != '1'){
    //             count++;
    //         }
    //     }
    //     int z = Math.pow(2, count);

    // }

    public static int sum(int x, int y){
        return x+y;
    }

    public static int max(int x, int y){
        if(x>y){
            return x;
        }
        return y;
    }
    public static int min(int x, int y){
        if(x<y){
            return x;
        }
        return y;
    }

    public static int numberOfLeadingZeros(int x){
        String a = Integer.toBinaryString(x);
        int l = a.length();
        int ans = 32-l;
        return ans;
    }
    public static int numberOfTrailingZeros(int x){
        String a = Integer.toBinaryString(x);
        int l = a.length();
        int count=0;
        for(int i=l-1;i>=0;i--){
            if(a.charAt(i) == '0'){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
    public static int bitCount(int x){
        String a = Integer.toBinaryString(x);
        int l = a.length();
        int count=0;
        for(int i=l-1;i>=0;i--){
            if(a.charAt(i) == '1'){
                count++;
            }
            
        }
        return count;
    }

    public static int random(){
        int randomnumber=0;
        int n=100;
        randomnumber = (int)(System.nanoTime()%(n+1));
        return randomnumber;
    }



    public static void testPerformance(int numberOfInputs) {
        int[] inputs = new int[numberOfInputs];

        for (int i = 0; i < numberOfInputs; i++) {
            inputs[i] = (int)(myInteger.random() * 100);
        }

        long startTime1 = System.nanoTime();
        for (int i = 0; i < numberOfInputs; i++) {
            Integer.numberOfLeadingZeros(inputs[i]);
        }
        long endTime1 = System.nanoTime();
        long builtIn = endTime1 - startTime1;

        long startTime2 = System.nanoTime();
        for (int i = 0; i < numberOfInputs; i++) {
            myInteger.numberOfLeadingZeros(inputs[i]);
        }
        long endTime2 = System.nanoTime();
        long manual = endTime2 - startTime2;


        System.out.println("Built in function time is " + builtIn + " nanoseconds");
        System.out.println("Manual function time is " + manual + " nanoseconds");
    }



    public static void main(String[] args) {
        myInteger A = new myInteger();
        // int a = A.compare(5,4);
        // System.out.println(a);
        // int b = A.compareUnsigned(-5,4);
        // System.out.println(b);
        // long c = A.toUnsignedLong(5);
        // System.out.println(c);
        // long d = A.divideUnsigned(5,-4);
        // System.out.println(d);
        // int e = highestOneBit(129);
        // System.out.println(e);
        // int f = sum(129,1);
        // System.out.println(f);
        // int g = min(129,1);
        // System.out.println(g);
        // int h = max(129,1);
        // System.out.println(h);
        // int i = numberOfLeadingZeros(4);
        // System.out.println(i);
        // int j = numberOfTrailingZeros(15);
        // System.out.println(j);
        // int k = bitCount(100);
        // System.out.println(k);

        testPerformance(10);
        // int z = A.random();
        // System.out.println(z);


        
    }
}


