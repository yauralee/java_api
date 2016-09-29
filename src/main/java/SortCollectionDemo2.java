import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by twcn on 9/27/16.
 */
public class SortCollectionDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("marry");
        list.add("rose");
        list.add("Able");
        list.add("allen");
        list.add("jack");
        list.add("Mark");
        list.add("mike");
        list.add("jackson");
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
