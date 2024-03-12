import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("uj");
        list.add("uj");
        list.add("uj");
        list.add("uj");

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
