package oop;

class get_set {
    int num;
    String string;

    void get(int number,String stringer){
        num = number;
        string = stringer;
    }
    void set(){
        System.out.println(num);
        System.out.println(string);
    }
}

public class classobj {
    public static void main(String[] args) {
        get_set A = new get_set();
        A.get(19,"ujjwal");
        A.set();
    }
}
