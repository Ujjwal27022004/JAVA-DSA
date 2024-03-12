public class sample {
    public static void change(int...v){
        System.out.println(v[1]);
    }

    public static void main(String[] args){
        change(1,2,3,4,5,6);
    }
}
