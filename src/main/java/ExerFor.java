import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by twcn on 9/26/16.
 */
public class ExerFor {
    public static void main(String[] args){
        String[] arr = {"one", "two", "three", "four", "five"};
        for(String str : arr) {
            System.out.println(str);
        }
        Collection c = new ArrayList();
        c.add("1");
        c.add("#");
        c.add("2");
        c.add("#");
        c.add("3");
        c.add("#");
        c.add("4");
        for(Object o : c){
            System.out.println(o);
            String str1 = (String)o;
            if("#".equals(str1)){
//                c.remove(o); //for中不能remove
            }
        }
    }

}
