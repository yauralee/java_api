import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by twcn on 9/26/16.
 */
public class IteratorDemo {

    public static void main(String[] args){
        Collection c = new ArrayList();
            c.add("one");
            c.add("two");
            c.add("three");
            c.add("four");
            c.add("five");

        Iterator it = c.iterator();
        while(it.hasNext()){
            String str = (String)it.next();
            System.out.println(str);
         }
    }

}
