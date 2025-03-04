import java.util.*;
public class IteratorExample {
    public static void main(String[] args) {
        // Create a list of Objects (String and Integer)
        ArrayList<Object> list = new ArrayList<>();
        list.add("Apple");
        list.add(10);
        list.add("Banana");
        list.add(20);
        list.add("Cherry");
        list.add(30);
        list.add("Date");
        list.add(40);
        list.add("Elderberry");
        list.add(50);

        // Create an iterator
        Iterator<Object> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
