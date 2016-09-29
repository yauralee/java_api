import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by twcn on 9/27/16.
 */
public class TypeDemo2 {
    public static void main(String[] args) {

        Collection<String> c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");

        for (String o : c) {
            System.out.println(o);
        }

        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

    }
}
