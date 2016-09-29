import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by twcn on 9/27/16.
 */
public class SortCollectionDemo1 {
    public static void main(String[] args) {
        List<Cell1> list = new ArrayList<Cell1>();
        list.add(new Cell1(3,4));
        list.add(new Cell1(1,5));
        list.add(new Cell1(2,2));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }

}
