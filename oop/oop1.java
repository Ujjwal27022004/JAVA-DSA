package oop;

public class oop1 {

public class A{
    void function(){
        System.out.println("ujjwal");
    }
}

    public static void main(String[] args) {
        Dog a = new Dog();
        a.age = 5;
        System.out.println(a.age);
        System.out.println(a.color);
        System.out.println(a.name);

        a.walking();
        a.walking("tommy");

        a.function();

        oop1 b = new oop1();
        A c = b.new A();
        c.function();

        

        
    }
}

class Dog{
    String name;
    int age;
    String color;

    

    void walking(){
        System.out.println("dog is walking");
    }

    void walking(String name){
        System.out.println(name+" is walking");
    }
    void Barking(){
        System.out.println("dog is barking");
    }

    void function(){
        oop1 a = new oop1();
        oop1.A b = a.new A();
        b.function();
    }
}
