package oop;

public class Inheritance {

    
    public static void main(String[] args) {

        Dog dog = new Dog("uj",20);

        Cat cat = new Cat();
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

    String name = super.name;
    @Override
    void print() {
        System.out.println(name + "common");
    }

}
