import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class LearnArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(2);
        list.add(6);
        list.add(4);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println(list.get(1));
        list.remove(Integer.valueOf(1));

        list.set(2, 8);
        System.out.println(list.size());

        // iterators
        //for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println("the element is " + list.get(i));
        }
        
        //foreach
        for (Integer element : list) {
            System.out.println("foreach element is " + element);
        }

        //iterator
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println("iterator " + it.next());
        }
    }
}
