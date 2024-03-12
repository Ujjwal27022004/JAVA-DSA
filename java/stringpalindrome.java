import java.util.*;

public class stringpalindrome {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String str=a.next();
        StringBuilder name=new StringBuilder(str);

        System.out.println(name==name.reverse());
        
    }
}
