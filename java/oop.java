public class oop {
    public static class A {
        int a;
        A(int a){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        int a=10;
        A obj = new A(a);
        System.out.println(obj);
    }
}
