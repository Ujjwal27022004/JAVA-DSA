package String;
import java.lang.*;

public class MyStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        System.out.println(sb);
        sb.insert(1, "java");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb); 
        sb.reverse();
        System.out.println(sb); 
        sb.delete(1,5);
        System.out.println(sb); 

    }
}
