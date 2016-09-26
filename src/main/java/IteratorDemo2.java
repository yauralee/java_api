import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by twcn on 9/26/16.
 */
public class IteratorDemo2 {
    public static void main(String[] args){
        Collection c = new ArrayList();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");

        Iterator it = c.iterator();
        while(it.hasNext()){
            String str = (String)it.next();
            if("#".equals(str)){
//				c.remove(str);  //在使用迭代器遍历集合的过程中，不能通过集合的相关方法改变集合元素数量
                it.remove();
            }
        }

        System.out.println(c);//[one, two, three, four]


        Iterator it1 = c.iterator();
        while(it1.hasNext()){
            String str = (String)it1.next();
            System.out.println(it1.next());//two four

        }

    }
}
