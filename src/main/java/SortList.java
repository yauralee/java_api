import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by twcn on 9/27/16.
 */
public class SortList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for(int i=0;i<10;i++){
            list.add(random.nextInt(100));
        }
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
