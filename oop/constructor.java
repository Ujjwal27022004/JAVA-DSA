package oop;

public class constructor {
    public static void main(String[] args) {
        employee a = new employee("ujjwal");
        
    }
}

class employee{
    String name;
    int no;
    String refid;

    public employee(String a){
        name =a;
        System.out.println("my name is " + name);
    }
}
