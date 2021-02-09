import java.util.HashSet;
import java.util.Iterator;

public class HashMap {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet();

        set.add("Bob");
        set.add("Alice");
        set.add("Nina");
        set.add("Ray");

        Iterator<String> it = set.iterator();
        while (it.hasNext())
            System.out.println(it.next());

    }

}