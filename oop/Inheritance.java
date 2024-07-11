package oop;

public class Inheritance {

    
    public static void main(String[] args) {

        Dog dog = new Dog("uj",20);

        Cat cat = new Cat("vn",21);
        cat.print();
    }

}

class Dog{
    String name;
    int age;

    Dog(){}

    Dog(String name,int age){
        this.name = name;
        this.age = age;
    }

    void print(){
        System.out.println(name);
        System.out.println(age);
    }
}

class Cat extends Dog{
    

    Cat(String name,int age){
        super(name,age);
    }

    //overriding
    @Override
    void print() {
        System.out.println(name + "common");
    }

}
