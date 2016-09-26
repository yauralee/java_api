import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by twcn on 9/26/16.
 */
public class CollectionDemo {

    public static void main(String[] args){
        Collection c = new ArrayList();

        Cell cell = new Cell(3,3);
        c.add(cell);
        c.add(new Cell(2,2));
        System.out.println(c);

        cell.x = 8;
        System.out.println(c);

    }
}
