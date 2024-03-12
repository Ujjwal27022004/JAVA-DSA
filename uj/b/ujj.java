package uj.b;

import uj.b.main.ujjwal;

public class ujj {
    public static void main(String[] args) {
        ujjwal A=new ujjwal(20, null, 100000);//class should be static
        ujjwal B=new ujjwal(20, null, 150000);//class should be static
        System.out.println(A.age);
        System.out.println(A.name);
        // System.out.println(A.count);
        // System.out.println(B.count);
        System.out.println(A.count);
        System.out.println(B.count);
    }    
}
