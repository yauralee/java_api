import java.util.*;

/**
 * Created by twcn on 9/27/16.
 */
public class ArrayToList {
    public static void main(String[] args) {
        String[] array = {"one","two","three","two"};

        List<String> list = Arrays.asList(array);
        System.out.println(list);

        Set<String> set = new HashSet<String>(list);
        System.out.println(set);
        List<String> list2 = new ArrayList<String>(list);
        list2.add("four");
        System.out.println(list2);

    }
}
